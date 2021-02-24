/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author samir pellegrini
 */
public class MainPriorita {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws InterruptedException {
        Integer  c=1;
        boolean b = true;
       Runnable r1= new MioRunnable();
       
       Thread t1=new Thread(r1,"contatore 1");
       Thread t2=new Thread(r1,"contatore 2");
       Thread t3=new Thread(r1,"contatore 3");
       
       t1.setPriority(6);
       t2.setPriority(4);
       t3.setPriority(7);
       t1.start();
       t2.start();
       t3.start();
       /*Thread.sleep(10000);
       t1.stop();
       t2.stop();
       t3.stop();*/
       
    }
    
}
