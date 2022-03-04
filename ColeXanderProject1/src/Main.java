/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author clack
 */
import java.util.Scanner;
public class Main {
    
    /**
     *
     * @param args
     */
    public static void main(String[] args) throws InterruptedException {
        // TODO code application logic here
        
        Scanner scn = new Scanner(System.in);
        
        //Lets the user decide on the initial values of the program
        System.out.println("Hi! Welcome to the prototype store system. Please enter the name of your store!");
        String strName = scn.nextLine();
        System.out.println("Great! Now what how many CDs would you like this store to have in stock?");
        int CDs = scn.nextInt();
         System.out.println("Great! Now what how many Bookss would you like this store to have in stock?");
        int Books = scn.nextInt();
         System.out.println("Great! Now what how many DVDs would you like this store to have in stock?");
        int DVDs = scn.nextInt();
        
       System.out.println("======================================");
       
        System.out.println("Now let's create a customer! What would you like their name to be?");
        String custName = scn.next();

        System.out.print("Great! Now what would you like their initial store credit balance to be($0.00)? $");
        double bal = scn.nextDouble();

        
        //creates the objects usint the data collected
         Store str = new Store(CDs, Books, DVDs, strName);
         Customer cstm = new Customer(bal, custName, false);
    
    //displays the initial home screen.
          str.displayOptions(cstm);
            
    }
    
}
