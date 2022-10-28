
import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class Tela extends JFrame {
	
	private JPanel painelNorte, painelCentral;
	private JButton botaoAdicionar;
	private JTextField campoTarefa;
	private JLabel labelTarefa;
	private JList<String> lista;
	private DefaultListModel<String> modelo;
	
	public Tela() {
		super("Minhas tarefas");
		
		painelNorte = new JPanel();
		painelCentral = new JPanel();
		
		botaoAdicionar = new JButton("Adicionar");
		campoTarefa = new JTextField(20);
		labelTarefa = new JLabel("Tarefa");
		lista = new JList<String>();
		modelo = new DefaultListModel<String>();
		
		lista.setModel(modelo);
		
		painelNorte.add(labelTarefa);
		painelNorte.add(campoTarefa);
		painelNorte.add(botaoAdicionar);
		
		painelCentral.add(new JScrollPane(lista));
		
		add(painelNorte, BorderLayout.NORTH);
		add(painelCentral, BorderLayout.CENTER);
		
		botaoAdicionar.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				String tarefa = campoTarefa.getText();
				if(!tarefa.isEmpty()) {
					modelo.addElement(tarefa);
					campoTarefa.setText("");
				}
				
			}
		});
		
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize(400, 300);
		setLocationRelativeTo(null);
		setVisible(true);
	}

	public static void main(String[] args) {
		new Tela();

	}

}