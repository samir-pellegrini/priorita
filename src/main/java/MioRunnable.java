
import java.util.logging.Level;
import java.util.logging.Logger;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author samir pellegrini
 */
public class MioRunnable implements Runnable{
    public int c;
    boolean b=true;

    public void MioRunnable(Integer c,boolean b)
    {
        this.c=c;
        this.b=b;
    }
    
    public void run()
    {
       /*while(2==2)
       {
           c++;
         System.out.println("il trhead: " + Thread.currentThread() + "il conto è: " + c);
       }*/
        while(b == true)
        {
            c++;
        }
        
            try { 
                Thread.sleep(5000);
            } catch (InterruptedException ex) {
                Logger.getLogger(MioRunnable.class.getName()).log(Level.SEVERE, null, ex);
            }
            
        b=false;
        
    }
}
