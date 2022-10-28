import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class TelaCadastroTarefa extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private final ButtonGroup buttonGroup = new ButtonGroup();

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaCadastroTarefa frame = new TelaCadastroTarefa();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public TelaCadastroTarefa() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblDescrioDaTarefa = new JLabel("Descri\u00E7\u00E3o da Tarefa:");
		lblDescrioDaTarefa.setBounds(10, 35, 124, 14);
		contentPane.add(lblDescrioDaTarefa);
		
		textField = new JTextField();
		textField.setBounds(144, 32, 280, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel lblPrioridade = new JLabel("Prioridade:");
		lblPrioridade.setBounds(10, 94, 124, 14);
		contentPane.add(lblPrioridade);
		
		JRadioButton rdbtnAlta = new JRadioButton("Alta");
		buttonGroup.add(rdbtnAlta);
		rdbtnAlta.setBounds(144, 90, 109, 23);
		contentPane.add(rdbtnAlta);
		
		JRadioButton rdbtnMedia = new JRadioButton("M\u00E9dia");
		buttonGroup.add(rdbtnMedia);
		rdbtnMedia.setBounds(144, 116, 109, 23);
		contentPane.add(rdbtnMedia);
		
		JRadioButton rdbtnBaixa = new JRadioButton("Baixa");
		buttonGroup.add(rdbtnBaixa);
		rdbtnBaixa.setBounds(144, 142, 109, 23);
		contentPane.add(rdbtnBaixa);
		
		JLabel lblFinalizado = new JLabel("Finalizado:");
		lblFinalizado.setBounds(10, 172, 124, 14);
		contentPane.add(lblFinalizado);
		
		JRadioButton rdbtnSim = new JRadioButton("Sim");
		buttonGroup.add(rdbtnSim);
		rdbtnSim.setBounds(144, 168, 109, 23);
		contentPane.add(rdbtnSim);
		
		JRadioButton rdbtnNo = new JRadioButton("N\u00E3o");
		buttonGroup.add(rdbtnNo);
		rdbtnNo.setBounds(144, 194, 109, 23);
		contentPane.add(rdbtnNo);
		
		JButton btnSalvar = new JButton("Salvar");
		btnSalvar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnSalvar.setBounds(10, 227, 89, 23);
		contentPane.add(btnSalvar);
		
		JButton btnCancelar = new JButton("Cancelar");
		btnCancelar.setBounds(335, 227, 89, 23);
		contentPane.add(btnCancelar);
	}
}