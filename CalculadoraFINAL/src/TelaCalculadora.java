
import java.awt.BorderLayout;
import java.awt.Color;
import static java.awt.Color.BLACK;
import static java.awt.Color.RED;
import static java.awt.Color.WHITE;
import static java.awt.Color.black;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;


public class TelaCalculadora {
     
    

    void gui(JPanel quadro, ActionListener listener, JLabel texto) {
        quadro.setLayout(new BorderLayout());

        JPanel q = new JPanel();
        q.setLayout(new FlowLayout(FlowLayout.CENTER));
        quadro.add(q, BorderLayout.NORTH);
        q.add(texto);

        q.setBackground(WHITE);
        q.setBorder(new EmptyBorder(4, 4, 4, 4));
        cfg_texto(texto);

        JPanel p = new JPanel();
        
        p.setPreferredSize(new Dimension(65,150));
        p.setBackground(WHITE);
        p.setBorder(new EmptyBorder(4, 4, 4, 4));
        p.setLayout(new GridLayout(5, 5, 8, 8));

        quadro.add(p, BorderLayout.CENTER);

        grupoOperacao(p, listener);

    }

    void grupoOperacao(JPanel p, ActionListener listener) {

        JButton b1, b2, b3, b4, b5, b6, b7, b8, b9, b0, ponto,
                soma, subtrair, dividir, multiplicar, resultado, raiz, porcentagem,
                ms, mr, mclean, madd, msub,file;

        soma = new JButton("+");
        subtrair = new JButton("-");
        dividir = new JButton("/");
        multiplicar = new JButton("x");
        raiz = new JButton("√");
        porcentagem = new JButton("%");
        resultado = new JButton("=");
        ms = new JButton("MS");
        mr = new JButton("MR");
        mclean = new JButton("MC");
        madd = new JButton("M+");
        msub = new JButton("M-");
        b1 = new JButton("1");
        b2 = new JButton("2");
        b3 = new JButton("3");
        b4 = new JButton("4");
        b5 = new JButton("5");
        b6 = new JButton("6");
        b7 = new JButton("7");
        b8 = new JButton("8");
        b9 = new JButton("9");
        b0 = new JButton("0");
        ponto = new JButton(".");
        file = new JButton("FILE");
        
        
        b1.setBackground(black);
        b1.setForeground(WHITE);
        b2.setBackground(BLACK);
        b2.setForeground(WHITE);
        b3.setBackground(BLACK);
        b3.setForeground(WHITE);
        b4.setBackground(BLACK);
        b4.setForeground(WHITE);
        b5.setBackground(BLACK);
        b5.setForeground(WHITE);
        b6.setBackground(BLACK);
        b6.setForeground(WHITE);
        b7.setBackground(BLACK);
        b7.setForeground(WHITE);
        b8.setBackground(BLACK);
        b8.setForeground(WHITE);
        b9.setBackground(BLACK);
        b9.setForeground(WHITE);
        b0.setBackground(BLACK);
        b0.setForeground(WHITE);
        ponto.setBackground(BLACK);
        ponto.setForeground(WHITE);
        resultado.setBackground(RED);
        resultado.setForeground(WHITE);
        resultado.setForeground(WHITE);
        soma.setBackground(BLACK);
        soma.setForeground(WHITE);
        subtrair.setBackground(BLACK);
        subtrair.setForeground(WHITE);
        multiplicar.setBackground(BLACK);
        multiplicar.setForeground(WHITE);
        dividir.setBackground(BLACK);
        dividir.setForeground(WHITE);
        porcentagem.setBackground(BLACK);
        porcentagem.setForeground(WHITE);
        raiz.setBackground(BLACK);
        raiz.setForeground(WHITE);
        ms.setBackground(BLACK);
        ms.setForeground(WHITE);
        mr.setBackground(BLACK);
        mr.setForeground(WHITE);
        madd.setBackground(BLACK);
        madd.setForeground(WHITE);
        msub.setBackground(BLACK);
        msub.setForeground(WHITE);
        mclean.setBackground(BLACK);
        mclean.setForeground(WHITE);
        file.setBackground(RED);
        file.setForeground(WHITE);

        resultado.setFont(new Font("Verdana", Font.BOLD, 20));
        b1.setFont(new Font("Verdana", Font.BOLD, 20));
        b2.setFont(new Font("Verdana", Font.BOLD, 20));
        b3.setFont(new Font("Verdana", Font.BOLD, 20));
        b4.setFont(new Font("Verdana", Font.BOLD, 20));
        b5.setFont(new Font("Verdana", Font.BOLD, 20));
        b6.setFont(new Font("Verdana", Font.BOLD, 20));
        b7.setFont(new Font("Verdana", Font.BOLD, 20));
        b8.setFont(new Font("Verdana", Font.BOLD, 20));
        b9.setFont(new Font("Verdana", Font.BOLD, 20));
        b0.setFont(new Font("Verdana", Font.BOLD, 20));
        raiz.setFont(new Font("Verdana", Font.BOLD, 20));
        soma.setFont(new Font("Verdana", Font.BOLD, 20));
        subtrair.setFont(new Font("Verdana", Font.BOLD, 20));
        porcentagem.setFont(new Font("Verdana", Font.BOLD, 20));
        multiplicar.setFont(new Font("Verdana", Font.BOLD, 20));
        ms.setFont(new Font("Verdana", Font.BOLD, 20));
        mr.setFont(new Font("Verdana", Font.BOLD, 20));
        msub.setFont(new Font("Verdana", Font.BOLD, 20));
        mclean.setFont(new Font("Verdana", Font.BOLD, 20));
        madd.setFont(new Font("Verdana", Font.BOLD, 20));
        ponto.setFont(new Font("Verdana", Font.BOLD, 20));

        p.add(ms);
        p.add(mr);
        p.add(madd);
        p.add(msub);
        p.add(mclean);
        p.add(b7);
        p.add(b8);
        p.add(b9);
        p.add(dividir);
        p.add(porcentagem);
        p.add(b4);
        p.add(b5);
        p.add(b6);
        p.add(multiplicar);
        p.add(raiz);
        p.add(b1);
        p.add(b2);
        p.add(b3);
        p.add(soma);
        p.add(subtrair);
        p.add(new JLabel(""));
        p.add(b0);
        p.add(ponto);
        p.add(resultado);
        p.add(file);
        
      
    

        b1.addActionListener(listener);
        b1.setActionCommand("1");
        b2.addActionListener(listener);
        b2.setActionCommand("2");
        b3.addActionListener(listener);
        b3.setActionCommand("3");
        b4.addActionListener(listener);
        b4.setActionCommand("4");
        b5.addActionListener(listener);
        b5.setActionCommand("5");
        b6.addActionListener(listener);
        b6.setActionCommand("6");
        b7.addActionListener(listener);
        b7.setActionCommand("7");
        b8.addActionListener(listener);
        b8.setActionCommand("8");
        b9.addActionListener(listener);
        b9.setActionCommand("9");
        b0.addActionListener(listener);
        b0.setActionCommand("0");
        soma.addActionListener(listener);
        soma.setActionCommand("SOMAR");
        subtrair.addActionListener(listener);
        subtrair.setActionCommand("SUBTRAIR");
        multiplicar.addActionListener(listener);
        multiplicar.setActionCommand("MULTIPLICAR");
        dividir.addActionListener(listener);
        dividir.setActionCommand("DIVIDIR");
        porcentagem.addActionListener(listener);
        porcentagem.setActionCommand("PORCENTAGEM");
        madd.addActionListener(listener);
        madd.setActionCommand("MADD");
        msub.addActionListener(listener);
        msub.setActionCommand("MSUB");
        mclean.addActionListener(listener);
        mclean.setActionCommand("MCLEAN");
        mr.addActionListener(listener);
        mr.setActionCommand("MR");
        ms.addActionListener(listener);
        ms.setActionCommand("MS");
        resultado.addActionListener(listener);
        resultado.setActionCommand("RESULTADO");
        raiz.addActionListener(listener);
        raiz.setActionCommand("RAIZ");
        ponto.addActionListener(listener);
        ponto.setActionCommand("PONTO");
        file.addActionListener(listener);
        file.setActionCommand("FILE");
    }

    void cfg_texto(JLabel texto) {//default
        cfg_texto(texto, SwingConstants.RIGHT, 380, 60, Color.red, Color.BLACK);
    }

    void cfg_texto(JLabel texto, int hpos, int lar, int alt, Color red, Color bcor) {

        texto.setFont(new Font("Verdana", Font.BOLD, 60));
        texto.setHorizontalAlignment(hpos);
        texto.setPreferredSize(new Dimension(lar, alt));

        texto.setForeground(red);
        if (bcor != null) {
            texto.setOpaque(true);
            texto.setBackground(bcor);
        }
    }}

