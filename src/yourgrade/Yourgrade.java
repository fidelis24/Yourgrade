/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package yourgrade;

import java.util.Scanner;

/**
 *
 * @author joieee
 */
public class Yourgrade {

   
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
   
        {
             Scanner inp = new Scanner(System.in);
           double q1,q2,q3,qr,qr1,qr2,Prelim,percent,percent1,grade;
            
             System.out.println("Name:");
             String Name=inp.next();
             System.out.println("Quiz 1:");
       q1=inp.nextDouble();
       System.out.println("Quiz 2:");
        q2=inp.nextDouble();
      System.out.println ("Quiz 3:");
       //quizzes over 10 each suppose.
       q3=inp.nextDouble();
       
       qr=q1+q2+q3;
       qr1=qr/30;
       qr2=qr1*10;
//10 percent for quizzes
       System.out.println("Quiz percent results:"+qr2);


//which is over 50 suppose. and 90 percent.
System.out.println("Prelim exam:");
       Prelim=inp.nextDouble();
percent=Prelim/50;
percent1=percent*90;


       
System.out.println("percent of prelim:"+percent1);


grade=qr2+percent1;
System.out.println("Your prelim overall is:"+grade);


if (grade>=75){
      System.out.println("PASS");
}   else 
      System.out.println("Failed");
        }
    }

    




        }
    
    

   
      