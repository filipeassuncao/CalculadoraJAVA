import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.io.IOException;
import java.io.FileWriter;
import java.io.PrintWriter;

class Calculadora implements ActionListener {

    private String receptor = "";
    private float operandoA = 0;
    private float operandoB = 0;
    private float resultado = -1;

    private JLabel texto;
    private Memoria m;
    private int operacao = 0;

    Calculadora(JLabel texto, Memoria m) {
        this.texto = texto;
        this.m = m;
    }

    void DIGITOS() {
        
        this.receptor = texto.getText();
        
        if (operacao == 0)
            operandoA = Float.parseFloat(receptor);
        else 
            operandoB = Float.parseFloat(receptor);
    }

    void SOMAR() {

        operacao = 1;
        receptor = "";
    }

    void SUBTRAIR() {
        operacao = 2;
        receptor = "";
    }

    void DIVIDIR() {
        operacao = 3;
        receptor = "";
    }

    void MULTIPLICAR() {
        operacao = 4;
        receptor = "";
    }

    void PORCENTAGEM() {
        operacao = 5;
        receptor = "";
    }

    void RAIZ() {
        operacao = 6;
        receptor = "";
        RESULTADO();
    }

    void CLEAN() {
        texto.setText("0");
        receptor = "";
        operacao = 0;
        operandoA = 0;
        operandoB = 0;

    }
    
    void filesave(){   
        
        try{
        FileWriter arq = new FileWriter("/home/filipe/NetBeansProjects/CalculadoraV3/historico/historico.txt", true);
        PrintWriter gravarArq = new PrintWriter(arq);

        gravarArq.printf("Operando A: " + operandoA + "\n Operação: " + operacao + "\n Operando B: " + operandoB + "\n Resultado: " + resultado + "\n");

        arq.close();
 
        System.out.printf("\n Historico gravado com sucesso em /home/filipe/NetBeansProjects/CalculadoraV3/historico/historico.txt.\n");
  
        }catch(IOException e){
            JOptionPane.showMessageDialog(null, "Falha ao salvar arquivo");
             e.printStackTrace(); // isso vai exibir as últimas chamadas de método
        }
    }

    void RESULTADO() {
        switch (operacao) {
            case 1: {
                operacao = 1; //somar
                resultado = operandoA + operandoB;
                operandoA = resultado;
                texto.setText("" + resultado);
                break;
            }
            case 2: {
                operacao = 2; //subtrair
                resultado = operandoA - operandoB;
                operandoA = resultado;
                texto.setText("" + resultado);
                break;
            }
            case 3: {

                operacao = 3; //dividir
                if (operandoB != 0){
                    resultado = operandoA / operandoB;
                    texto.setText("" + resultado);
                } else {
                    resultado = 0;
                    texto.setText("Indeterminação");
                }
                break;

            }

            case 4: {
                operacao = 4; //multiplicar
                resultado = operandoA * operandoB;
                operandoA = resultado;
                texto.setText("" + resultado);
                break;
            }

            case 5: {
                operacao = 5;
                resultado = ((operandoA * operandoB)/ 100);
                operandoA = resultado;
                texto.setText("" + resultado);
                break;

            }
            case 6: {
                operacao = 6;
                resultado = (float) Math.sqrt(operandoA + operandoB);
                operandoA = resultado;
                texto.setText("" + resultado);
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
            if (resultado == operandoA) {
                CLEAN();
                texto.setText("1");
                DIGITOS();

            } else {
                texto.setText(receptor + "1");
            }
            DIGITOS();

        } else if (cmd.equals("2")) {
            if (resultado == operandoA) {
                CLEAN();
                texto.setText("2");
                DIGITOS();
            } else {
                texto.setText(receptor + "2");
            }
            DIGITOS();

        } else if (cmd.equals("3")) {
            if (resultado == operandoA) {
                CLEAN();
                texto.setText("3");
                DIGITOS();
            } else {
                texto.setText(receptor + "3");
            }
            DIGITOS();
            
        } else if (cmd.equals("4")) {
            if (resultado == operandoA) {
                CLEAN();
                texto.setText("4");
                DIGITOS();
            } else {
                texto.setText(receptor + "4");
            }
            DIGITOS();
        
        } else if (cmd.equals("5")) {
            if (resultado == operandoA) {
                CLEAN();
                texto.setText("5");
                DIGITOS();
            } else {
                texto.setText(receptor + "5");
            }
            DIGITOS();
        
        } else if (cmd.equals("6")) {
            if (resultado == operandoA) {
                CLEAN();
                texto.setText("6");
                DIGITOS();
            } else {
                texto.setText(receptor + "6");
            }
            DIGITOS();
        
        } else if (cmd.equals("7")) {
            if (resultado == operandoA) {
                CLEAN();
                texto.setText("7");
                DIGITOS();
            } else {
                texto.setText(receptor + "7");
            }
            DIGITOS();
        
        } else if (cmd.equals("8")) {
            if (resultado == operandoA) {
                CLEAN();
                texto.setText("8");
                DIGITOS();
            } else {
                texto.setText(receptor + "8");
            }
            DIGITOS();
        
        } else if (cmd.equals("9")) {
            if (resultado == operandoA) {
                CLEAN();
                texto.setText("9");
                DIGITOS();
            } else {
                texto.setText(receptor + "9");
            }
            DIGITOS();
        
        } else if (cmd.equals("0")) {
            if (resultado == operandoA) {
                CLEAN();
                texto.setText("0");
                DIGITOS();
            } else {
                texto.setText(receptor + "0");
            }
            DIGITOS();
        
        } else if (cmd.equals("PONTO")) {
            if (resultado == operandoA) {
                CLEAN();
                texto.setText(".");
                DIGITOS();
            } else {
                texto.setText(receptor + ".");
            }
            DIGITOS();
        
        } else if (cmd.equals("MS")) {
            m.ms(Float.parseFloat(texto.getText()));
            receptor = "";
            operandoA = 0;
            operandoB = 0;
        } else if (cmd.equals("MR")) {
            texto.setText("" + m.mr());
            receptor = "";
            operandoA = 0;
            operandoB = 0;

        } else if (cmd.equals("MADD")) {

            texto.setText("" + m.mplus(Float.parseFloat(texto.getText())));
        
        } else if (cmd.equals("MSUB")) {

            texto.setText("" + m.msub(Float.parseFloat(texto.getText())));
        } else if (cmd.equals("FILE")) {
            filesave();
        }
    }

}//()
