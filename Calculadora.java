import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class Calculadora implements ActionListener {

    private String OperandoA = "";
    private String OperandoB = "";
    private String Resultado = "Aguardando";

    private JLabel texto;
    private Memoria m;
    private int operacao = 0;

    Calculadora(JLabel texto, Memoria m) {
        this.texto = texto;
        this.m = m;
    }

    void setOperandoA() {
        this.OperandoA = texto.getText();
    }

    public String getOperandoA() {
        return OperandoA;
    }

    void DIGITOS() {
        setOperandoA();

    }

    void SOMAR() {

        operacao = 1;
        OperandoB = OperandoA;
        OperandoA = "";
    }

    void SUBTRAIR() {
        operacao = 2;
        OperandoB = OperandoA;
        OperandoA = "";
    }

    void DIVIDIR() {
        operacao = 3;
        OperandoB = OperandoA;
        OperandoA = "";
    }

    void MULTIPLICAR() {
        operacao = 4;
        OperandoB = OperandoA;
        OperandoA = "";
    }

    void PORCENTAGEM() {
        operacao = 5;
        OperandoB = OperandoA;
        OperandoA = "";

    }

    void RAIZ() {
        operacao = 6;
        OperandoB = OperandoA;
        OperandoA = "";
        RESULTADO();
    }

    void CLEAN() {
        texto.setText("0");
        OperandoA = "";
        OperandoB = "";

    }

    void RESULTADO() {
        switch (operacao) {
            case 1: {
                operacao = 1; //somar
                Resultado = Float.toString(Float.parseFloat(OperandoB) + Float.parseFloat(texto.getText()));
                OperandoA = Resultado;
                texto.setText(Resultado);
                break;
            }
            case 2: {
                operacao = 2; //subtrair
                Resultado = Float.toString(Float.parseFloat(OperandoB) - Float.parseFloat(texto.getText()));
                OperandoA = Resultado;
                texto.setText(Resultado);
                break;
            }
            case 3: {

                operacao = 3; //dividir
                Resultado = Float.toString(Float.parseFloat(OperandoB) / Float.parseFloat(texto.getText()));
                OperandoA = Resultado;
                texto.setText(Resultado);
                break;

            }

            case 4: {
                operacao = 4; //multiplicar
                Resultado = Float.toString(Float.parseFloat(OperandoB) * Float.parseFloat(texto.getText()));
                OperandoA = Resultado;
                texto.setText(Resultado);
                break;
            }

            case 5: {
                operacao = 5;
                Resultado = (Float.toString((Float.parseFloat(OperandoB) * Float.parseFloat(texto.getText())) / 100));
                OperandoA = Resultado;
                texto.setText(Resultado);
                break;

            }
            case 6: {
                operacao = 6;
                Resultado = (Float.toString((float) Math.sqrt(Float.parseFloat(texto.getText()))));
                OperandoA = Resultado;
                texto.setText(Resultado);
                break;
            }
           

        }

    }

    public void actionPerformed(ActionEvent e) {
        String cmd = e.getActionCommand();

        if (cmd.equals("MCLEAN")) {
            CLEAN();
            m.mc();
        } else if (cmd.equals("SOMAR")) {
            SOMAR();
        } else if (cmd.equals("SUBTRAIR")) {
            SUBTRAIR();
        } else if (cmd.equals("DIVIDIR")) {
            DIVIDIR();
        } else if (cmd.equals("MULTIPLICAR")) {
            MULTIPLICAR();
        } else if (cmd.equals("RESULTADO")) {
            RESULTADO();
        } else if (cmd.equals("RAIZ")) {
            RAIZ();
        } else if (cmd.equals("PORCENTAGEM")) {
            PORCENTAGEM();
        } else if (cmd.equals("1")) {
            if (Resultado.equals(OperandoA)) {
                CLEAN();
                texto.setText("1");
                DIGITOS();

            } else {
                texto.setText(OperandoA + "1");
            }
            DIGITOS();

        } else if (cmd.equals("2")) {
            if (Resultado.equals(OperandoA)) {
                CLEAN();
                texto.setText("2");
                DIGITOS();
            } else {
                texto.setText(OperandoA + "2");
            }
            DIGITOS();

        } else if (cmd.equals("3")) {
            if (Resultado.equals(OperandoA)) {
                CLEAN();
                texto.setText("3");
                DIGITOS();
            } else {
                texto.setText(OperandoA + "3");
            }
            DIGITOS();
        } else if (cmd.equals("4")) {
            if (Resultado.equals(OperandoA)) {
                CLEAN();
                texto.setText("4");
                DIGITOS();
            } else {
                texto.setText(OperandoA + "4");
            }
            DIGITOS();
        } else if (cmd.equals("5")) {
            if (Resultado.equals(OperandoA)) {
                CLEAN();
                texto.setText("5");
                DIGITOS();
            } else {
                texto.setText(OperandoA + "5");
            }
            DIGITOS();
        } else if (cmd.equals("6")) {
            if (Resultado.equals(OperandoA)) {
                CLEAN();
                texto.setText("6");
                DIGITOS();
            } else {
                texto.setText(OperandoA + "6");
            }
            DIGITOS();
        } else if (cmd.equals("7")) {
            if (Resultado.equals(OperandoA)) {
                CLEAN();
                texto.setText("7");
                DIGITOS();
            } else {
                texto.setText(OperandoA + "7");
            }
            DIGITOS();
        } else if (cmd.equals("8")) {
            if (Resultado.equals(OperandoA)) {
                CLEAN();
                texto.setText("8");
                DIGITOS();
            } else {
                texto.setText(OperandoA + "8");
            }
            DIGITOS();
        } else if (cmd.equals("9")) {
            if (Resultado.equals(OperandoA)) {
                CLEAN();
                texto.setText("9");
                DIGITOS();
            } else {
                texto.setText(OperandoA + "9");
            }
            DIGITOS();
        } else if (cmd.equals("0")) {
            if (Resultado.equals(OperandoA)) {
                CLEAN();
                texto.setText("0");
                DIGITOS();
            } else {
                texto.setText(OperandoA + "0");
            }
            DIGITOS();
        } else if (cmd.equals("PONTO")) {
            if (Resultado.equals(OperandoA)) {
                CLEAN();
                texto.setText(".");
                DIGITOS();
            } else {
                texto.setText(OperandoA + ".");
            }
            DIGITOS();
        } 
        
        else if (cmd.equals("MS")) {
            m.ms(texto.getText());
            OperandoA = "";
            OperandoB = "";
        } else if (cmd.equals("MR")) {
            texto.setText(m.mr());
            OperandoA = "";
            OperandoB = "";

        } else if (cmd.equals("MADD")) {

            texto.setText(m.mplus());
        } else if (cmd.equals("MSUB")) {

            texto.setText(m.msub());
        }
    }

}//()
