/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java.thead;

/**
 *
 * @author russo.salvatore
 */
public class sportello implements Runnable{

    conto conto;

    public sportello(conto conto) {
        this.conto = conto;
    }

    sportello(sportello sport1) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    @Override
    public void run() {
       this.versa(500);
    }
    public void versa(int somma){
      conto.versa(somma);
        System.out.println("conto: "+conto.saldo());
    }
    
}
