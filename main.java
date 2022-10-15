main.java
public class TarefaDao {

	private final Connection connection;
	
	public TarefaDao() {
		try {
			this.connection = DriverManager.getConnection("jdbc:mysql://localhost/tarefas", "root", "");
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
	}
	
	public void adicionar(Tarefa tarefa) {
		String sql = "insert into tarefa (nome, descricao, status, prioridade, idUsuario) values (?,?,?,?,?)";
		
		try {
			PreparedStatement stmt = connection.prepareStatement(sql);
			
			stmt.setString(1, tarefa.getNome());
			stmt.setString(2, tarefa.getDescricao());
			stmt.setString(3, tarefa.getStatus());
			stmt.setString(4, tarefa.getPrioridade());
			stmt.setInt(5, tarefa.getIdUsuario());
			
			stmt.execute();
			stmt.close();
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
	}
	
	public List<Tarefa> listar(){
		try {
			List<Tarefa> tarefas = new ArrayList<Tarefa>();
			PreparedStatement stmt = this.connection.
					prepareStatement("select * from tarefa");
			ResultSet rs = stmt.executeQuery();
			
			while (rs.next()) {
				// criando o objeto Tarefa
				Tarefa tarefa = new Tarefa();
				tarefa.setId(rs.getLong("id"));
				tarefa.setNome(rs.getString("nome"));
				tarefa.setDescricao(rs.getString("descricao"));
				tarefa.setStatus(rs.getString("status"));
				tarefa.setPrioridade(rs.getString("prioridade"));
				tarefa.setIdUsuario(rs.getInt("idUsuario"));
				
				// adicionando o objeto à lista
				tarefas.add(tarefa);
			}
			rs.close();
			stmt.close();
			return tarefas;
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
	}
	
	public void remover(Tarefa tarefa) {
		try {
			PreparedStatement stmt = connection.prepareStatement("delete from tarefa where id = ?");
			stmt.setLong(1, tarefa.getId());
			stmt.execute();
			stmt.close();
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
	}
	
	public void altera(Tarefa tarefa) {
		String sql = "update tarefa set nome=?, descricao=?, status=?, prioridade=?, idUsuario=? where id=?";
		try {
			PreparedStatement stmt = connection.prepareStatement(sql);
			stmt.setString(1, tarefa.getNome());
			stmt.setString(2, tarefa.getDescricao());
			stmt.setString(3, tarefa.getStatus());
			stmt.setString(4, tarefa.getPrioridade());
			stmt.setInt(5, tarefa.getIdUsuario());
			stmt.setLong(6, tarefa.getId());
			stmt.execute();
			stmt.close();
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
	}
	
	public Tarefa buscaPorId(long id) {
		try {
			PreparedStatement stmt = this.connection.
					prepareStatement("select * from tarefa where id = ?");
			stmt.setLong(1, id);
			ResultSet rs = stmt.executeQuery();
			
			if (rs.next()) {
				// criando o objeto Tarefa
				Tarefa tarefa = new Tarefa();
				tarefa.setId(rs.getLong("id"));
				tarefa.setNome(rs.getString("nome"));
				tarefa.setDescricao(rs.getString("descricao"));
				tarefa.setStatus(rs.getString("status"));
				tarefa.setPrioridade(rs.getString("prioridade"));
				tarefa.setIdUsuario(rs.getInt("idUsuario"));
				
				rs.close();
				stmt.close();
				return tarefa;
			}
			
			rs.close();
			stmt.close();
			return null;
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
	}
	
	public List<Tarefa> listarTarefasUsuario(long idUsuario){
		try {
			List<Tarefa> tarefas = new ArrayList<Tarefa>();
			PreparedStatement stmt = this.connection.
					prepareStatement("select * from tarefa where idUsuario = ?");
			stmt.setLong(1, idUsuario);
			ResultSet rs = stmt.executeQuery();
			
			while (rs.next()) {
				// criando o objeto Tarefa
				Tarefa tarefa = new Tarefa();
				tarefa.setId(rs.getLong("id"));
				tarefa.setNome(rs.getString("nome"));
				tarefa.setDescricao(rs.getString("descricao"));
				tarefa.setStatus(rs.getString("status"));
				tarefa.setPrioridade(rs.getString("prioridade"));
				tarefa.setIdUsuario(rs.getInt("idUsuario"));
				
				// adicionando o objeto à lista
				tarefas.add(tarefa);
			}
			rs.close();
			stmt.close();
			return tarefas;
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
	}
}