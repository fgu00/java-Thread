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
public class processo extends Thread {
    String a;
    public processo(String h){
        a=h;
    }
    public void run(){
        for(;;)
            System.out.println(a);
    }
     
}
