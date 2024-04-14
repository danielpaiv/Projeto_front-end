import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;

public class PainelPricipal extends JFrame {

    private final PopupMenu PainelPricipal;//Rederiza a janela

    private JButton jButton;

    public PainelPricipal(PopupMenu painelPricipal){
        PainelPricipal = painelPricipal;
        this.add(PainelPricipal);
        setLayout(null);
    }

    public PainelPricipal() {
        PainelPricipal = null;

        ///////////////////////////////////////////////////////////////////////////////////////////////////////////////
        //janela
        setTitle("Painel Pricipal");
        setVisible(true);// renderiza a janela
        setSize(700, 500);// Ajusta o tamanho da janela
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);// comando para fechar o programa
        setResizable(false);// Bloqueia o ajuste da janela
        setLocationRelativeTo(null);// Ajusta a janela para o centro da tela
        setLayout(null);

        ////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        //Botao 1
        JButton jButton = new JButton("Cadastrar");
        jButton.setBounds(50, 50, 100, 50);// X orizontal Y vertical WIDTH  tamanho do botáo  HEIGHT autura do botão
        jButton.setFont(new Font("Arial", Font.BOLD, 10));// Ajuste da fonte
        jButton.setForeground(new Color(255, 255, 255));
        jButton.setBackground(new Color(21, 81, 213));
        add(jButton);

        ///////////////////////////////////////////////////////////////////////////////////////////////////////////////
        //Botao 2
        JButton jButton2 = new JButton("Consultar");
        jButton2.setBounds(285, 50, 100, 50);// X orizontal Y vertical WIDTH  tamanho do botáo  HEIGHT autura do botão
        jButton2.setFont(new Font("Arial", Font.BOLD, 10));// Ajuste da fonte
        jButton2.setForeground(new Color(255, 255, 255));
        jButton2.setBackground(new Color(21, 81, 213));
        add(jButton2);

        ///////////////////////////////////////////////////////////////////////////////////////////////////////////////
        //Botao 3
        JButton jButton3 = new JButton("Voltar");
        jButton3.setBounds(530, 50, 100, 50);// X orizontal Y vertical WIDTH  tamanho do botáo  HEIGHT autura do botão
        jButton3.setFont(new Font("Arial", Font.BOLD, 10));// Ajuste da fonte
        jButton3.setForeground(new Color(255, 255, 255));
        jButton3.setBackground(new Color(21, 81, 213));
        add(jButton3);

        ////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        //Chama o evento do botão
        jButton.addActionListener(this::botao4);//Botão cadastrar
        jButton2.addActionListener(this:: botao3);//Botão consultar
        jButton3.addActionListener(this::botao5);//Botão voltar

    }

    ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    //Botão voltar
    private void botao5(ActionEvent actionEvent) {
        PainelInicio painelInicio = new PainelInicio();//Chama a janela desejada
        painelInicio.setVisible(true);
        dispose();//fecha a janela

//        JOptionPane.showMessageDialog(
//                null, "Voltar", "Titulo", JOptionPane.WARNING_MESSAGE);//Adciona uma menssage de alerte
    }

    ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    //Botão consultar
    private void botao3(ActionEvent actionEvent) {//Botão consultar


    }

    ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    //Botão cadastrar
    private void botao4(ActionEvent actionEvent) {
        PainelCadastro painelCadastro = new PainelCadastro();
        painelCadastro.setVisible(true);
        dispose();

//        JOptionPane.showMessageDialog(
//                null, "Cadastrar", "Titulo", JOptionPane.WARNING_MESSAGE);//Adciona uma menssage de alerte
    }

}
