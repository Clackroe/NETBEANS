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
public class Professor extends Person{
    private String department = "";
    private double salary = 0.00;
    private ArrayList<Student> advisees = new ArrayList<Student>();
    
    //Constructor

    /**
     *
     * @param first
     * @param last
     * @param ID
     * @param dpt
     * @param sal
     */
    public Professor(String first, String last, int ID, String dpt, double sal){
        super(first, last, ID);
        this.department = dpt;
        this.salary = sal;        
    }
    
    /**
     *
     * @return
     */
    public String getDepartment(){
        return this.department;
    }

    /**
     *
     * @return
     */
    public double getSalary(){
        return this.salary;
    }

    /**
     *
     * @return
     */
    public ArrayList<Student> getAdvisees(){
        return this.advisees;
    }

    /**
     *
     * @param v
     */
    public void setDepartment(String v){
        this.department = v;
    }

    /**
     *
     * @param v
     */
    public void setSalart(double v){
        this.salary = v;
    }

    /**
     *
     * @param v
     */
    public void addAdvisee(Student v){
        this.advisees.add(v);
    }

    /**
     *
     * @param v
     * @return
     */
    public boolean removeAdvisee(int v){
         int len = this.advisees.size();
    
     for (int i = 0; i < len; i++){
        if (v == (this.advisees.get(i).getId()))
        {
           this.advisees.remove(i);
           return true;
        }
     }
        return false;
    }
    
}
