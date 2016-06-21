
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class Memoria {

  

    private String memoria = "0";
    private String mplus = "0";
     private String msub = "0";
    

    void ms(String n) {
        debug();
        memoria = n;
    }

    String mr() {
        debug();
        return memoria;
    }

    void mc() {
        debug();
        memoria = "0";
      
    }

    String mplus() {
        debug(); 
        mplus =  Float.toString(Float.parseFloat(mplus) + Float.parseFloat(memoria));
         return  mplus;
    }
    String msub() {
        
  msub =  Float.toString(Float.parseFloat(msub) - Float.parseFloat(memoria));
         return  msub;
    }

    private boolean debug = true;

    void debug() {
        if (debug) {
            System.out.println("m = " + memoria);
        }
    }

 
}//
