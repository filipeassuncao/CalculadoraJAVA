
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import javax.swing.JOptionPane;


public class File {
    
        void filesave(float operandoAtxt,float operacao,float operandoB,float resultado){   
        
        try{
        FileWriter arq = new FileWriter("/home/filipe/NetBeansProjects/GitHub/CalculadoraJAVA/historico.txt", true);
        PrintWriter gravarArq = new PrintWriter(arq);

        gravarArq.printf("----------------------\n Operando A: " + operandoAtxt + "\n Operação: " + operacao + "\n Operando B: " + operandoB + "\n Resultado: " + resultado + "\n");

        arq.close();
 
        System.out.printf("\n Historico gravado com sucesso em /home/filipe/NetBeansProjects/GitHub/CalculadoraJAVA/historico.txt.\n");
  
        }catch(IOException e){
            JOptionPane.showMessageDialog(null, "Falha ao salvar arquivo");
             e.printStackTrace(); // isso vai exibir as últimas chamadas de método
        }
    }
}
