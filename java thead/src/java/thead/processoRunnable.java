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
public class processoRunnable implements Runnable{

    private String a;
    private boolean stop;
    
    public processoRunnable(String a) {
        stop=false;
        this.a=a;
    }
    
public void run(){
      while(!stop){
            System.out.println(a);
}    
}
public void stoppa(){
    stop=true;
}
}
