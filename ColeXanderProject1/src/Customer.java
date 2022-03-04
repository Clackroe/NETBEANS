/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author clack
 */
import java.util.ArrayList;

/**
 *
 * @author clack
 */
public class Customer {
    
    private double balance = 0.00;
    private String name = "";
    private ArrayList<Item> shoppingCart = new ArrayList<Item>();
    private ArrayList<Item> inventory = new ArrayList<Item>();
    private boolean isPremium = false;
    
    /**
     *
     * @param initBal
     * @param initName
     * @param initPrem
     */
    public Customer(double initBal, String initName, boolean initPrem){
        this.balance = initBal;
        this.name = initName;
        
        if(initPrem){
          this.balance += 10;
          this.isPremium = true;
        }
    }

    /**
     *
     * @return
     */
    public ArrayList<Item> getShoppingCart(){
        return this.shoppingCart;
    }

    /**
     *
     * @param var
     */
    public void setShoppingCart(ArrayList<Item> var){
        this.shoppingCart = var;
    }
    
    /**
     *
     * @param var
     */
    public void setInventory(ArrayList<Item> var){
        this.inventory = var;
    }
    
    /**
     *
     * @param var
     */
    public void setMember(boolean var){
        isPremium = var;
    }
    
    /**
     *
     * @return
     */
    public boolean getMember(){
        return this.isPremium;
    }
    
    /**
     *
     * @return
     */
    public double getBalance(){
        return this.balance;
    }
   
    /**
     *
     * @param amount
     */
    public void setBalance(double amount){
        this.balance = amount;
    }
    
    /**
     *
     * @param amount
     */
    public void addBalance(double amount){
        this.balance += amount;
    }
        
    /**
     *
     * @return
     */
    //calculates the number of CDs in the customer's shopping cart
    public int getCurrCDs(){

        int output = 0;
        for (int i = 0; i < shoppingCart.size(); i++){
          if(shoppingCart.get(i).getName().equals("CD")) 
              output++;
        }
        return output;
    }
    
    /**
     *
     * @return
     */
    //calculates the number of Bookss in the customer's shopping cart
    public int getCurrBooks(){

        int output = 0;
        for (int i = 0; i < shoppingCart.size(); i++){
          if(shoppingCart.get(i).getName().equals("Book")) 
              output++;
        }
        return output;
    }
    
    /**
     *
     * @return
     */
    //calculates the number of DVDs in the customer's shopping cart
    public int getCurrDVDs(){

        int output = 0;
        for (int i = 0; i < shoppingCart.size(); i++){
          if(shoppingCart.get(i).getName().equals("DVD")) 
              output++;
        }
        return output;
    }
    
    /**
     *
     * @param amount
     */
    //Adds a specified number of books to the shopping cart if the store has the avaliable stock.
    public void addBook(int amount){
        int total = getCurrCDs() + amount;
        
        if (total > Store.getBook())
                System.out.println("Store does not have enough stock to facilitate this amount of Books");
        else
            for (int i = 0; i < amount; i++)
            {
                System.out.println("Successfully added to cart!");
                shoppingCart.add(new Item(1));
            }
       }
    
    /**
     *
     * @param amount
     */
     //Adds a specified number of CDs to the shopping cart if the store has the avaliable stock.
    public void addCD(int amount){
        int total = getCurrCDs() + amount;
        
        if (total > Store.getCD())
                System.out.println("Store does not have enough stock to facilitate this amount of CDs");
        else
            for (int i = 0; i < amount; i++)
            {
                System.out.println("Successfully added to cart!");
                shoppingCart.add(new Item(2));
            }
        
       }
    
    /**
     *
     * @param amount
     */
     //Adds a specified number of DVDs to the shopping cart if the store has the avaliable stock.
    public void addDVD(int amount){
        int total = getCurrCDs() + amount;
        
        if (total > Store.getDVD())
                System.out.println("Store does not have enough stock to facilitate this amount of DVDs");
        else
            for (int i = 0; i < amount; i++)
            {
                System.out.println("Successfully added to cart!");
                shoppingCart.add(new Item(3));
            }
        
       }
        
        
}


    

