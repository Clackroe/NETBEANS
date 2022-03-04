/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package fastfoodkitchen;
import java.util.ArrayList;

/**
 *
 * @author clack
 */
public class FastFoodKitchen {

    //initial values
    private ArrayList<BurgerOrder> orderList = new ArrayList<BurgerOrder>();
        
    private static int nextOrderNum = 0; //Must be static so that all versions of the class can utilize the same variable value.
    
    //Construcor(s)

    /**
     *
     */
    public FastFoodKitchen(){
        BurgerOrder order1 = new BurgerOrder(3, 5, 4, 10, 1, false);
        BurgerOrder order2 = new BurgerOrder(0, 0, 3, 3, 2, true);
        BurgerOrder order3 = new BurgerOrder(1, 1, 0, 2, 3, false);
        
        orderList.add(order1);
        incrementNextOrderNum();
        orderList.add(order2);
        incrementNextOrderNum();
        orderList.add(order3);
        incrementNextOrderNum();
        
    }
    
    //getter for nextOrderNum

    /**
     *
     * @return
     */
    public int getNextOrderNum(){
        return this.nextOrderNum;
    }

    /**
     *
     * @return
     */
    @Override
    public String toString() {
        return "FastFoodKitchen{" + "orderList=" + orderList + '}';
    }
    
    
    
    //increment order number by one
    private static void incrementNextOrderNum(){
        nextOrderNum ++;
    }
    
    //add burger to order

    /**
     *
     * @param ham
     * @param cheese
     * @param veggie
     * @param soda
     * @param toGo
     * @return
     */
    public int addOrder(int ham, int cheese, int veggie, int soda, boolean toGo){
        BurgerOrder init = new BurgerOrder(ham, cheese, veggie, soda, this.nextOrderNum, toGo);
        orderList.add(init);
        incrementNextOrderNum();
        return nextOrderNum;
    }
    //cancels last order in the list

    /**
     *
     * @return
     */
    public boolean cancelLastOrder(){
        if(!orderList.isEmpty())
        {
            orderList.remove(orderList.size()-1);
            nextOrderNum --;
            return true;
        }
        return false;
    }
    
    /**
     *
     * @return
     */
    public ArrayList<BurgerOrder> getOrderList(){
        return this.orderList;
    }
    
//Returns the amount of orders in the list currently

    /**
     *
     * @return
     */
    public int getNumOrdersPending(){
        return orderList.size();
        
    }
    
    //Checks if there is a pending order

    /**
     *
     * @param orderID
     * @return
     */
    public int isOrderDone(int orderID){
        for (BurgerOrder var : orderList)
            if (var.getOrderNum() == orderID)
                return 1;
        return 0;
    }
    
    /**
     *
     * @param orderID
     * @return
     */
    public boolean cancelOrder(int orderID){
        for (BurgerOrder var : orderList)
            if (var.getOrderNum() == orderID)
            {
              orderList.remove(var);
              return true;
            }
        return false;
    }
    
    /**
     *
     * @param orderID
     * @return
     */
    public int findOrderSeq(int orderID){
        for (int i = 0; i < orderList.size(); i++){
            if (orderID == orderList.get(i).getOrderNum())
                return i;
        }
        return -1;        
    }
    
    /**
     *
     */
    public void selectionSort(){
        ArrayList<BurgerOrder> output = new ArrayList<BurgerOrder>();
    
    int length = this.orderList.size();

    for (int j = 0; j < length; j++){

        int min = this.orderList.get(0).getHamburgers() +
                this.orderList.get(0).getCheeseburgers()+
                this.orderList.get(0).getVeggieburgers();

        int index = 0;

        for (int i = 0; i < this.orderList.size(); i++){

            if (this.orderList.get(i).getHamburgers() +
                this.orderList.get(0).getCheeseburgers()+
                this.orderList.get(0).getVeggieburgers() < min){

                min = this.orderList.get(i).getHamburgers() +
                this.orderList.get(0).getCheeseburgers()+
                this.orderList.get(0).getVeggieburgers();
                
                index = i;
            }
        }
        output.add(j, this.orderList.remove(index));
    }
    orderList = output;
    }
    
    /**
     *
     */
    public void insertionSort(){
        
        for (int i = 1; i < orderList.size(); i++){
            int pointer = i;
            while(pointer > 0 && (orderList.get(pointer).getHamburgers() +
                this.orderList.get(0).getCheeseburgers()+
                this.orderList.get(0).getVeggieburgers() < orderList.get(pointer-1).getHamburgers() +
                this.orderList.get(0).getCheeseburgers()+
                this.orderList.get(0).getVeggieburgers())){
                
                BurgerOrder temp = orderList.remove(pointer-1);
                
                orderList.add(pointer, temp);
                
                pointer--;
                
            }
        }
    }
    
    /**
     *
     * @param orderID
     * @return
     */
    public int findOrderBin(int orderID){
        int front = 0;
        int end = orderList.size()-1;
        
        while (front <= end){
            int mid = ((front + end)/2);
            
            if (orderList.get(mid).getOrderNum() == orderID)
                return mid;
            else if (orderList.get(mid).getOrderNum() < orderID)
                front = mid+1;
            else
                end = mid-1;
            
        }
        return -1;
        
    }
    
    
    
}
