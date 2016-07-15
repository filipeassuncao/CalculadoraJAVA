import java.awt.event.*;
import javax.swing.*;



class Main {

    public static void main(String[] sdsd) {
        JFrame f = new JFrame("Calculadora");
        JPanel quadro = new JPanel();
        ActionListener listener;
        JLabel texto = new JLabel("0");
        listener = new Calculadora(texto, new Memoria(),new File());
      
        TelaCalculadora view = new TelaCalculadora();
        view.gui(quadro, listener, texto);
        f.add(quadro);
        f.setVisible(true);
        f.setResizable(false);
        f.setTitle("Calculadora");
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.pack();
     }
    }

