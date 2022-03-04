/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author clack
 */
public class Item {
    
    private String name = "";
    private double price = 0.0;
    
    /**
     *
     * @param type
     */
    //Determins the type of itemit is and it's price
    public Item(int type){
        switch (type){
            case 1:
            {
                this.name = "Book";
                this.price = 5.99;
                break;
            }
            case 2: 
            {
                this.name = "CD";
                this.price = 1.99;
                break;
            }
            case 3:
            {
                this.name = "DVD";
                this.price = 4.99;
                break;
            }
            default:
            {
                this.name = "null";
                this.price = 0.00;
            }
            }
        }
    
    /**
     *
     * @return
     */
    public String getName(){
        return this.name;
    }
    
    /**
     *
     * @return
     */
    public double getPrice(){
        return this.price;
    }
        
    }
    
    

