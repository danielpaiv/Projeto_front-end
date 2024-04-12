import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;

public class PainelLogin extends JFrame{

    private JFormattedTextField jFormattedTextField;
    private JPasswordField jPasswordField;
    private JTextArea jTextArea;
    private JLabel  jLabel;
    private JButton jButton;

    public PainelLogin(){

        //janela
        setTitle("Tela Login");
        setVisible(true);// renderiza a janela
        setSize(500, 300);// Ajusta o tamanho da janela
        setBackground(new Color(18,103,249));
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);// comando para fechar o programa
        setResizable(false);// Bloqueia o ajuste da janela
        setLocationRelativeTo(null);// Ajusta a janela para o centro da tela
        setLayout(null);

        //Texto
        JLabel jLabel1 = new JLabel("Usuário");
        jLabel1.setBounds(130,20,50,40);
        add(jLabel1);

        //Texto
        JLabel jLabel2 = new JLabel("Senha");
        jLabel2.setBounds(130,80,50,40);
        add(jLabel2);



        //Campo Usuario
        JFormattedTextField jFormattedTextField1 = new JFormattedTextField("");
        jFormattedTextField1.setBounds(130,50,200,30);// X move P direita e P esqyuerda Y P cima P baixo WIDTH  tamanho P direita  HEIGHT autura P cima
        jFormattedTextField1.setForeground(new Color(01,01,01));
        jFormattedTextField1.setBackground(new Color(255,255,255));
        add(jFormattedTextField1);

        //Campo Senha
        JPasswordField jPasswordField1 = new JPasswordField("");
        jPasswordField1.setBounds(130,110,200,30);// X move P direita e P esqyuerda Y P cima P baixo WIDTH  tamanho P direita  HEIGHT autura P cima
        jPasswordField1.setForeground(new Color(01,01,01));
        jPasswordField1.setBackground(new Color(255,255,255));
        add(jPasswordField1);

        //Botão Enviar
        JButton jButton1 = new JButton("Enviar");
        jButton1.setBounds(130, 150, 100, 30);// X orizontal Y vertical WIDTH  tamanho do botáo  HEIGHT autura do botão
        jButton1.setFont(new Font("Arial", Font.BOLD, 10));// Ajuste da fonte
        jButton1.setForeground(new Color(255, 255, 255));
        jButton1.setBackground(new Color(21, 81, 213));
        add(jButton1);

        jButton1.addActionListener(this::enviar);
    }

    private void enviar(ActionEvent actionEvent) {
        JOptionPane.showMessageDialog(
                null, "enviar", "Titulo", JOptionPane.WARNING_MESSAGE);//Adciona uma menssage de alerte
    }


}
