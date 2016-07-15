class Memoria {  

    private float memoria = 0;
    private  float mplus = 0;
    private float msub = 0;
    

    void ms(float n) {
        debug();
        memoria = n;
    }

    float mr() {
        debug();
        return memoria;
    }

    void mc() {
        debug();
        memoria = 0;
    }

    float mplus(float n) {
        debug();
        mplus = n + memoria;
        return  mplus;
    }
    float msub(float n) {
        debug();
        msub =  n - memoria;
        return  msub;
    }

    private boolean debug = true;

    void debug() {
        if (debug) {
            System.out.println("m = " + memoria);
        }
    } 
}//
