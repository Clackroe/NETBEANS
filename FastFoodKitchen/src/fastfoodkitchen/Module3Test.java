/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


package fastfoodkitchen;
import java.util.ArrayList;

/**
 *
 * @author clack
 */
public class Module3Test {
    
    /**
     *
     * @param args
     */
    public static void main (String [] args){
        FastFoodKitchen kitchen = new FastFoodKitchen();
        
//        //Part A
//        int orderPosition = kitchen.findOrderSeq(2);
//        System.out.println("Using Sequential Search >> order position is "
//                + orderPosition);


////Part B
//
//    kitchen.selectionSort();
//    ArrayList<BurgerOrder> sortedOrders = kitchen.getOrderList();
//    
//    int orderSize = 0;
//    
//    for(BurgerOrder order : sortedOrders){
//    orderSize = order.getCheeseburgers() +
//            order.getHamburgers() +
//            order.getVeggieburgers();
//    System.out.println(order.getOrderNum() + " has " + orderSize
//    + " burgers.");
//}
//    

//Part C

//       kitchen.insertionSort();
//       
//       int orderSize = 0;
//       
//   ArrayList<BurgerOrder> sortedOrders = kitchen.getOrderList();
//    
//    for(BurgerOrder order : sortedOrders){
//    orderSize = order.getCheeseburgers() +
//            order.getHamburgers() +
//            order.getVeggieburgers();
//    System.out.println(order.getOrderNum() + " has " + orderSize
//    + " burgers.");
//    }

      int orderPositionD = kitchen.findOrderBin(3);
      System.out.println("Uding binary search >> order position is: "
              + orderPositionD);


    }//endmain
    
    
    }
