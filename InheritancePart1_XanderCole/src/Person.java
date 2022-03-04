/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author clack
 */
public class Person {
    //Fields
    private String firstName = "";
    private String lastName = "";
    private int id;
    
    //Constructor

    /**
     *
     */
    public Person(){
        this.firstName = "N/A";
        this.lastName = "N/A";
        this.id = 0;
    }
    
    /**
     *
     * @param first
     * @param last
     * @param ID
     */
    public Person(String first, String last, int ID){
        this.firstName = first;
        this.lastName = last;
        this.id = ID;
    }
    
    /**
     *
     * @return
     */
    public String getFirstName(){
        return this.firstName;
    }

    /**
     *
     * @return
     */
    public String getLastName(){
        return this.lastName;
    }

    /**
     *
     * @return
     */
    public int getId(){
        return this.id;
    }
    
    /**
     *
     */
    public void display(){
        System.out.println("Name: " + firstName + " " + lastName);
        System.out.println("ID: " + id);
    }
}
