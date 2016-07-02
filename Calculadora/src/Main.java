import java.awt.*;
import static java.awt.Color.BLACK;
import static java.awt.Color.RED;
import static java.awt.Color.WHITE;
import static java.awt.Color.black;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.UIManager.LookAndFeelInfo;
import javax.swing.border.Border;
import javax.swing.border.EmptyBorder;

class Main {

    public static void main(String[] sdsd) {
        JFrame f = new JFrame("Calculadora");
        JPanel quadro = new JPanel();
        ActionListener listener;
        JLabel texto = new JLabel("0");
        listener = new Calculadora(texto, new Memoria());
      
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

