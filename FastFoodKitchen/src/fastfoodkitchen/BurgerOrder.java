/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fastfoodkitchen;

/**
 *
 * @author clack
 */
public class BurgerOrder {
    
    //Part A
    
    //Initial values
    private int numHamburgers = 0;
    private int numCheeseburgers = 0;
    private int numVeggieburgers = 0;
    private int numSodas = 0;
    private boolean orderToGo = false;
    private int orderNum = 1;
    
    //Constructor(s)

    /**
     *
     * @param ham
     * @param cheese
     * @param veg
     * @param sod
     * @param order
     * @param toGo
     */
    
    public BurgerOrder(int ham, int cheese, int veg, int sod,  int order, boolean toGo){
     this.numHamburgers = ham;
     this.numCheeseburgers = cheese;
     this.numVeggieburgers = veg;
     this.numSodas = sod;
     this.orderNum = order;
     this.orderToGo = toGo;
     
    
     
        
    }
    
    
    //Getter for numHamburgers

    /**
     *
     * @return
     */
    public int getHamburgers(){
        return this.numHamburgers;
    }
    //Setter for numHamburgers

    /**
     *
     * @param init
     */
    public void setHamburgers(int init){
        if (init < 0)
            System.out.println("**ERROR VALUE NOT CHANGED**\nPLEASE USE A POSITIVE NUMBER");
        this.numHamburgers = init;
    }
    //Getter for numCheeseburgers

    /**
     *
     * @return
     */
    public int getCheeseburgers(){
        return this.numCheeseburgers;
    }
    //Setter for numCheeseburgers

    /**
     *
     * @param init
     */
    public void setCheeseburgers(int init){
        if (init < 0)
            System.out.println("**ERROR VALUE NOT CHANGED**\nPLEASE USE A POSITIVE NUMBER");
        this.numCheeseburgers = init;
    }
    //Getter for numVeggieburgers

    /**
     *
     * @return
     */
    public int getVeggieburgers(){
        return this.numHamburgers;
    }
    //Setter for numVeggieburgers

    /**
     *
     * @param init
     */
    public void setVeggieburgers(int init){
        if (init < 0)
            System.out.println("**ERROR VALUE NOT CHANGED**\nPLEASE USE A POSITIVE NUMBER");
        this.numVeggieburgers = init;
    }
    
    //Getter for numSodas

    /**
     *
     * @return
     */
    public int getSodas(){
        return this.numSodas;
    }
    //Setter for numSodas

    /**
     *
     * @param init
     */
    public void setSodas(int init){
        if (init < 0)
            System.out.println("**ERROR VALUE NOT CHANGED**\nPLEASE USE A POSITIVE NUMBER");
        this.numSodas = init;
    }
    
    //Getter for orderToGo

    /**
     *
     * @return
     */
    public boolean isOrderToGo(){
        return orderToGo;
    }
    //Setter for orderToGo

    /**
     *
     * @param init
     */
    public void setOrderToGo(boolean init){
        this.orderToGo = init;
    }
    
    //Getter for orderNum

    /**
     *
     * @return
     */
    public int getOrderNum(){
        return this.orderNum;
    }
    //Setter for orderNum

    /**
     *
     * @param init
     */
    public void setOrderNum(int init){
        if (init < 0)
            System.out.println("**ERROR VALUE NOT CHANGED**\nPLEASE USE A POSITIVE NUMBER");
        this.orderNum = init;
    }

    //toString

    /**
     *
     * @return
     */
    @Override
    public String toString() {
        return "BurgerOrder{" + "numHamburgers=" + numHamburgers + ", numCheeseburgers=" + numCheeseburgers + ", numVeggieburgers=" + numVeggieburgers + ", numSodas=" + numSodas + ", orderToGo=" + orderToGo + ", orderNum=" + orderNum + '}';
    }
    
    
    
}
