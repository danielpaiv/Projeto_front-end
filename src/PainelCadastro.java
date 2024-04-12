import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;

public class PainelCadastro extends JFrame{

    //Variaveis das caixas de texto
    JTextField text1;
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
///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        //janela
        setTitle("Cadastro");
        setVisible(true);// renderiza a janela
        setSize(500, 300);// Ajusta o tamanho da janela
        setBackground(new Color(18,103,249));
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);// comando para fechar o programa
        setResizable(false);// Bloqueia o ajuste da janela
        setLocationRelativeTo(null);// Ajusta a janela para o centro da tela
        setLayout(null);

///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        //Texto
        JLabel jLabel1 = new JLabel("Nome");
        jLabel1.setBounds(100,20,50,40);
        add(jLabel1);

        JLabel jLabel2 = new JLabel("Sobre Nome");
        jLabel2.setBounds(100,50,70,40);
        add(jLabel2);

        JLabel jLabel3 = new JLabel("Cpf");
        jLabel3.setBounds(100,80,70,40);
        add(jLabel3);

        JLabel jLabel4 = new JLabel("Telefone");
        jLabel4.setBounds(100,110,70,40);
        add(jLabel4);

//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        //Caixa de texto
        text1 = new JTextField("");
        text1.setBounds(200,30,130,20);
        add(text1);

        text2 = new JTextField("");
        text2.setBounds(200,60,130,20);
        add(text2);

        text3 = new JTextField("");
        text3.setBounds(200,90,130,20);
        add(text3);

        text4 = new JTextField("");
        text4.setBounds(200,120,130,20);
        add(text4);


//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        //Botao enviar
        JButton jButton = new JButton("enviar");
        jButton.setBounds(210,150,100,30);
        add(jButton);

        //Botao voltar
        JButton jButton2 = new JButton("Voltar");
        jButton2.setBounds(10,10,70,20);
        add(jButton2);

////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        //Chama o evento do botão
        jButton.addActionListener(this::enviar);
        jButton2.addActionListener(this::voltar);

    }
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

    //Botão voltar
    private void voltar(ActionEvent actionEvent) {
        PainelInicio painelInicio = new PainelInicio();//Chama a janela desejada
        painelInicio.setVisible(true);
        dispose();//fecha a janela
    }
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    //Botão enviar
    private void enviar(ActionEvent actionEvent) {
        //Mostra um alerta com o texto da caixa
        JOptionPane.showMessageDialog(null,text1.getText());
        JOptionPane.showMessageDialog(null,text2.getText());



//        JOptionPane.showMessageDialog(
//               null, text.getText() , "Titulo", JOptionPane.WARNING_MESSAGE);//Adciona uma menssage de alerte
    }
}
