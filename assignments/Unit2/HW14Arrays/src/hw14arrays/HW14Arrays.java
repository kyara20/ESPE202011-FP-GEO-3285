/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hw14arrays;

/**
 *
 * @author Kyara Lizeth
 */
public class HW14Arrays {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String [] Name = {"Xavier", "Sebastian", "Daniel", "Andres", "Ricardo", "Alejandro"};
        
        System.out.println("Number of names : " + Name.length);
        
        System.out.println("The name at position 0 is -> " + Name[0]);
        
        for(int index = 0; index < Name.length; index++){
            System.out.println("Position : " + index + " Name -> " + Name[index]);
        }
    }    
}
