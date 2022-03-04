
import java.util.ArrayList;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author clack
 */
public class Student extends Person {
    //Fields
    private String major = "";
    private double gpa = 0.00;
    private int credits = 0;
    private double balance = 0.00;
    private boolean transfer = false;
    private ArrayList<String> enrolledCourses;
    
    //Costructor

    /**
     *
     * @param first
     * @param last
     * @param ID
     * @param maj
     * @param GPA
     * @param cred
     */
    public Student(String first, String last, int ID, String maj, double GPA, int cred){
        
       super(first, last, ID);
       this.major = maj;
       this.gpa = GPA;
       this.credits = cred;
       this.enrolledCourses = new ArrayList<String>();
       
    }
    
    /**
     *
     * @return
     */
    public String getMajor(){
        return this.major;
    }
    
    /**
     *
     * @return
     */
    public double getGPA(){
        return this.gpa;
    }

    /**
     *
     * @return
     */
    public int getCredits(){
        return this.credits;
    }
    
    /**
     *
     * @return
     */
    public boolean isTransfer(){
        return this.transfer;
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
     * @return
     */
    public ArrayList<String> getEnrolledClasses(){
        return this.enrolledCourses;
    }

    /**
     *
     * @param v
     */
    public void setMajor(String v){
        this.major = v;
    }

    /**
     *
     * @param v
     */
    public void setGPA(double v){
        this.gpa = v;
    }

    /**
     *
     * @param v
     */
    public void setCredits(int v){
        this.credits = v;
    }

    /**
     *
     * @param v
     */
    public void setTransfer(boolean v){
        this.transfer = v;
    }

    /**
     *
     * @param v
     */
    public void setBalance(double v){
        this.balance = v;
    }
    
    /**
     *
     * @param v
     */
    public void addCourse(String v){
        this.enrolledCourses.add(v);
    }
    
    /**
     *
     * @param v
     * @return
     */
    public boolean dropCourse(String v){
     int len = this.enrolledCourses.size();
    
     for (int i = 0; i < len; i++){
        if (v.equals(this.enrolledCourses.get(i)))
        {
           this.enrolledCourses.remove(i);
           return true;
        }
     }
        return false;
    }
    
}//End class
    
    
