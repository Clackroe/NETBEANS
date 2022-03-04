/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author clack
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        System.out.println("****PART A****");
        
        Person p = new Person("Raya", "Whitaker", 800555555);
        p.display();
        
        System.out.println("****PART B****");
        Student s1 = new Student("Xavier", "Cato", 900111222, "CS", 3.5, 75);
        s1.setTransfer(true);
        s1.setBalance(100);
        s1.addCourse("Java Programming");
        s1.addCourse("Calculus");
        
        s1.display();
        
         System.out.println("****PART C****");
         Student s2 = new Student("Kathrine", "Johnson", 900, "CS", 4.0, 100);
         Student s3 = new Student("Roy", "Clay", 901, "Biology", 3.2, 85);
         Student s4 = new Student("Kimberly", "Bryant", 902, "Electrical Engineering", 3.0, 80);
         Professor prof1 = new Professor("Mary", "Castro", 300, "CS", 80000);
         prof1.addAdvisee(s2);
         prof1.addAdvisee(s3);
         prof1.addAdvisee(s4);
         prof1.display();
         if (prof1.removeAdvisee(902)) {
             System.out.println("The advisee has been removed");
         }
         else {
             System.out.println("This student is not an advisee of Professor " + prof1.getFirstName()
             + " " + prof1.getLastName());
         }
         
        
    }
    
}
