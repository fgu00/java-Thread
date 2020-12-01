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
    public static void main(String[] args) throws InterruptedException {
//        processo T1=new processo("T1");
////          processo p3=new processo("3");
////        T1.start();
//////        p3.start();
//////         processo2 p2=new processo2();
//////        p2.start();
////try{
////            Thread.sleep(5000);
////            
////}catch(SecurityException e){
////    
////}
//processoRunnable p1=new processoRunnable("p1");
//Thread t1=new Thread(p1);
//t1.start();
// p1.run();
//Thread.sleep(5000);
//  p1.stoppa();

   conto c=new conto(2000);
   sportello sport1=new sportello(c);
   sportello sport2=new sportello(c);
   Thread mamma=new Thread(new sportello(sport1));
   Thread papa=new Thread(new sportello(sport2));
   mamma.start();
   papa.start();
//   sport1.versa(500);
//   sport2.versa(800);
}
        
    }
    


