
import static java.lang.System.exit;
import java.util.ArrayList;
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author clack
 */
public class Store {
    
    //Fields
    private static double bookPrice = new Item(1).getPrice(); //stores the price of the book
    private static double cdPrice = new Item(2).getPrice(); //stores the price of a cd
    private static double dvdPrice = new Item(3).getPrice(); //stores the price of a dvd
    
    //Keeps track of the amount of items that the store has in stock
    private  static int cdAmount = 0; 
    private static int bookAmount = 0;
    private static int dvdAmount=0;
    
    private static String name = "";
    Scanner scn = new Scanner(System.in);
    
    /**
     *
     * @param initCD
     * @param initBook
     * @param initDVD
     * @param initName
     */
    public Store(int initCD, int initBook, int initDVD, String initName){
        this.cdAmount = initCD;
        this.bookAmount = initBook;
        this.dvdAmount = initDVD;
        this.name = initName;
    }
    
    /**
     *
     * @return
     */
    public static int getCD(){
        return cdAmount;
    }
    
    /**
     *
     * @return
     */
    public static int getBook(){
        return bookAmount;
    }
    
    /**
     *
     * @return
     */
    public static int getDVD(){
        return dvdAmount;
    }
    
    /**
     *
     * @return
     */
    public static String getName(){
        return name;
    }
    
    /**
     *
     * @param amount
     */
    public void removeCD(int amount){
        cdAmount -= amount;
    }
    
    /**
     *
     * @param amount
     */
    public void removeBook(int amount){
        bookAmount -= amount;
    }
    
    /**
     *
     * @param amount
     */
    public void removeDVD(int amount){
        dvdAmount -= amount;
    }
    
    /**
     *
     * @param cust
     */
    //Displays the list of options that the customer can do. Acts as a sort of home page
    public void displayOptions(Customer cust) throws InterruptedException{
        System.out.println("==========" + name + "==========\n");
        System.out.println("Welcome to " + name + " please take a look at our menu.\n");
        System.out.println("**Please note that members get an extra $10 in credit and 20% off every purchase \nat the low price of $5.99 per month! Sign up below!**\n");
        
        System.out.println("1. Become a member!");
        System.out.println("2. Browse our inventory.");
        System.out.println("3. Check your balance.");
        System.out.println("4. Add to your balance.");
        System.out.println("5. Checkout.");
        
        System.out.print("\nEnter your choice: ");
        int choice = scn.nextInt();
        
        switch (choice){
            case 1: becomeMember(cust);
            break;
            
            case 2: browse(cust);
            break;
            
            case 3: checkBal(cust);
            break;
            
            case 4: addBal(cust);
            break;
            
            case 5: checkout(cust);
                
                
        }
    }
        
    /**
     *
     * @param cust
     */
   // Is called if someone wants to become a member
    public void becomeMember(Customer cust) throws InterruptedException{
            if (cust.getMember())
                System.out.println("You are already a member!");
            else
            {
                System.out.println("Becoming a member will cost you $5.99 per month, is this ok? Type (0 for no and 1 for yes)");
                int choice = scn.nextInt();
                if (choice == 0)
                {
                    System.out.println("Ok, no problem!");
                }
                else if (choice == 1)
                {
                    System.out.println("You are now a member! Congratulations!");
                    cust.setBalance(cust.getBalance() + 10);
                    cust.setMember(true);
                }
                
            }
           Thread.sleep(850);
            displayOptions(cust);
            }
        
    /**
     *
     * @param cust
     */
    //Is called when the customer wants to add an item to their shopping list
    public void browse(Customer cust) throws InterruptedException{
            System.out.println("==========INVENTORY==========\n");
            System.out.println("0. Nevermind");
            System.out.println("1. Book  STOCK QTY: " + getBook());
            System.out.println("2. CD  STOCK QTY: " + getCD());
            System.out.println("3. DVD  STOCK QTY: " + getDVD());
            
            System.out.print("\nPlease enter what you would like to purchase.");
            
            int choice = scn.nextInt();
            int amount =0;
            if (choice != 0)
            {
                System.out.print("How many would you like to buy:");
                 amount = scn.nextInt();
            }
            
            switch (choice){
                case 0: break;
                
                case 1 : cust.addBook(amount);
                break;
                
                case 2 : cust.addCD(amount);
                break;
                
                case 3: cust.addDVD(amount);
                break;
                default : break;
            }
            Thread.sleep(850);
            displayOptions(cust);
        }
        
    /**
     *
     * @param cust
     */
    //Is called when the customer wants to check their store credit
    public void checkBal(Customer cust) throws InterruptedException{
            System.out.println("Your current balance is: " + String.format("%.2f",cust.getBalance()));
            Thread.sleep(850);
            displayOptions(cust);
        }
        
    /**
     *
     * @param cust
     */
    public void addBal(Customer cust) throws InterruptedException{
            System.out.println("How much would you like to add?");
            double amount = scn.nextDouble();
            cust.addBalance(amount);
         System.out.println("Your current balance is: " + String.format("%.2f",cust.getBalance()));
         Thread.sleep(850);
            displayOptions(cust);
        }
        
    /**
     *
     * @param cust
     */
    // Is called when the customer is ready to check out
    //Makes sure they have sufficient funds, adds the discount if they are a member
    //Subtracts the items from the shopping cart from the stores inventory stock
    //And clears the shopping cart and adds the items to the customers inventory.
    public void checkout(Customer cust) throws InterruptedException{
            double priceBooks = cust.getCurrBooks() * this.bookPrice;
            double priceCDs = cust.getCurrCDs() * this.cdPrice;
            double priceDVDs = cust.getCurrDVDs() * this.dvdPrice;
            
            double subTotal = (priceBooks + priceCDs + priceDVDs);
            double total = 0;
            
            System.out.println("==========CHECKOUT==========\n");
            System.out.println("Books x " + cust.getCurrBooks() + "------" + priceBooks);
           System.out.println("CDs x " + cust.getCurrCDs()+ "------" + priceCDs);
            System.out.println("DVDs x " + cust.getCurrDVDs()+ "------" + priceDVDs);
            System.out.println("----------------------------");
            System.out.println("Subtotal: " + String.format("%.2f", subTotal));
            if (cust.getMember())
            {
                total = (subTotal - (subTotal * 0.20));
                
                System.out.println("Total with member discount: " + String.format("%.2f", total));
            }
            else{
                total = subTotal;
            }
            System.out.println("----------------------------");
            
            System.out.println("Total: " + String.format("%.2f", total) + "\n");
              Thread.sleep(850);
            if(cust.getBalance() < total){
                System.out.println("I'm Sorry but your balance has insufficient funds.");
               System.exit(0);
            }
            else
            {
                cust.setBalance(cust.getBalance() - total);
                cust.setInventory(cust.getShoppingCart());
                
                System.out.println("Transaction successfull! Thank you for shopping at " + name);
                
                cdAmount -= cust.getCurrCDs();
                bookAmount -= cust.getCurrBooks();
                dvdAmount -= cust.getCurrBooks();
                        
            cust.setShoppingCart(new ArrayList<Item>());
            }
        }
        
        }//end Class
    

        

