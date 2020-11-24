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
public class JavaThead {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        processo p=new processo("3");
          processo p3=new processo("3");
        p.start();
        p3.start();
         processo2 p2=new processo2();
        p2.start();
    }
    
}
