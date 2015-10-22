/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package entermembers;


import java.util.Scanner;

/**
 *
 * @author rwalker
 */
public class EnterMembers {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner input = new Scanner(System.in);
        
        String studentName;
       
        System.out.println("Enter Name");
        studentName = input.nextLine();            
            
        while (studentName.equals("")) {
            System.out.println("Enter Name");
            studentName = input.nextLine();
        }
        
        System.out.println("You entered the name "+studentName);
    }
 }
        
        
        
        
   