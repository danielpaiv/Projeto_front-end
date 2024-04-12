import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;


public class PainelInicio extends JFrame  {// Exemplo 2 usando 'extends JFrame'

    private JButton jButton;


    public PainelInicio() {



        //janela
        setTitle("Painel Inicio");
        setVisible(true);// renderiza a janela
        setSize(375, 200);// Ajusta o tamanho da janela
        setBackground(new Color(18,103,249));
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);// comando para fechar o programa
        setResizable(false);// Bloqueia o ajuste da janela
        setLocationRelativeTo(null);// Ajusta a janela para o centro da tela
        setLayout(null);
        Object dispose;


        //Botao 1
        JButton jButton = new JButton("Menu");
        jButton.setBounds(50, 50, 100, 50);// X orizontal Y vertical WIDTH  tamanho do botáo  HEIGHT autura do botão
        jButton.setFont(new Font("Arial", Font.BOLD, 10));// Ajuste da fonte
        jButton.setForeground(new Color(255, 255, 255));
        jButton.setBackground(new Color(21, 81, 213));
        add(jButton);
//
//        //Botao 2
        JButton jButton2 = new JButton("Login");
        jButton2.setBounds(200, 50, 100, 50);// X move P direita e P esqyuerda Y P cima P baixo WIDTH  tamanho P direita  HEIGHT autura P cima
        jButton2.setFont(new Font("Arial", Font.BOLD, 10));// Ajuste da fonte
        jButton2.setForeground(new Color(255, 255, 255));
        jButton2.setBackground(new Color(21, 81, 213));
        add(jButton2);

//        JFormattedTextField jFormattedTextField1 = new JFormattedTextField("Usuario");
//        jFormattedTextField1.setBounds(320,200,200,30);
//        jFormattedTextField1.setForeground(new Color(01,01,01));
//        jFormattedTextField1.setBackground(new Color(255,255,255));
//        add(jFormattedTextField1);
//
//        JPasswordField jPasswordField1 = new JPasswordField("Senha");
//        jPasswordField1.setBounds(320,300,200,30);
//        jPasswordField1.setForeground(new Color(01,01,01));
//        jPasswordField1.setBackground(new Color(255,255,255));
//        add(jPasswordField1);

        //Para chamar a ação do botão com o metodo @override
        jButton.addActionListener(this::botao1);
        jButton2.addActionListener(this:: botao2);

    }

    //Cama a função para o botão1
    private void botao1(ActionEvent actionEvent) {

        PainelPricipal menu = new PainelPricipal();//Cama a tela Painel Pricipal
        menu.setVisible(true);
        dispose();//Fecha as janelas




//        JOptionPane.showMessageDialog(
//                null, "Bortao 1", "Titulo", JOptionPane.WARNING_MESSAGE);//Adciona uma menssage de alerte
    }

    //Cama a função para o botão2
    private void botao2(ActionEvent actionEvent) {

        PainelLogin painelLogin = new PainelLogin();
        painelLogin.setVisible(true);
        dispose();




//        JOptionPane.showMessageDialog(
//                null, "Bortao 2", "Titulo", JOptionPane.WARNING_MESSAGE);//Adciona uma menssage de alerte
    }


}
