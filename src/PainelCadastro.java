import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;

public class PainelCadastro extends JFrame{

    JTextField text;
    JTextField text2;
    JTextField text3;
    JTextField text4;

    private JTextArea nome;
    private JTextArea  sobreNome;
    private JTextArea cpf;
    private JTextArea telefone;
    private JLabel jLabel;
    private JButton enviar;

    public PainelCadastro() {

        //janela
        setTitle("Cadastro");
        setVisible(true);// renderiza a janela
        setSize(500, 300);// Ajusta o tamanho da janela
        setBackground(new Color(18,103,249));
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);// comando para fechar o programa
        setResizable(false);// Bloqueia o ajuste da janela
        setLocationRelativeTo(null);// Ajusta a janela para o centro da tela
        setLayout(null);

        //Texto
        JLabel jLabel1 = new JLabel("Nome");
        jLabel1.setBounds(100,20,50,40);
        add(jLabel1);

        //Texto
        JLabel jLabel2 = new JLabel("Sobre Nome");
        jLabel2.setBounds(100,50,70,40);
        add(jLabel2);

        //Texto
        JLabel jLabel3 = new JLabel("Cpf");
        jLabel3.setBounds(100,80,70,40);
        add(jLabel3);

        //Texto
        JLabel jLabel4 = new JLabel("Telefone");
        jLabel4.setBounds(100,110,70,40);
        add(jLabel4);

        //Caixa de texto
        text = new JTextField("");
        text.setBounds(200,30,130,20);
        add(text);

        text2 = new JTextField("");
        text2.setBounds(200,60,130,20);
        add(text2);

        text3 = new JTextField("");
        text3.setBounds(200,90,130,20);
        add(text3);

        text4 = new JTextField("");
        text4.setBounds(200,120,130,20);
        add(text4);



        //Botao enviar
        JButton jButton = new JButton("enviar");
        jButton.setBounds(130,200,100,30);
        add(jButton);

        jButton.addActionListener(this::enviar);

    }

    private void enviar(ActionEvent actionEvent) {

        JOptionPane.showMessageDialog(null,text.getText());
        JOptionPane.showMessageDialog(null,text2.getText());



//        JOptionPane.showMessageDialog(
//               null, text.getText() , "Titulo", JOptionPane.WARNING_MESSAGE);//Adciona uma menssage de alerte
    }
}
