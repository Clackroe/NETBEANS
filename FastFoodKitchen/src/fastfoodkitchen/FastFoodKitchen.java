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
    
    
    
}
