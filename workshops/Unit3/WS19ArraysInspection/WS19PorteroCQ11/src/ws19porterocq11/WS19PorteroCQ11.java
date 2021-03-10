/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ws19porterocq11;

import java.util.Scanner;

/**
 *
 * @author Kyara Lizeth
 */
public class WS19PorteroCQ11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        int add = 0;

        int [] array = new int [5];
        Scanner ent = new Scanner (System.in);
        for (int i = 0; i <5; i ++) {

            System.out.println ("Enter the" + i + "num:");
            array [i] = ent.nextInt ();
            add  = array [i];
        }
        for (int i = 0; i <5; i ++) {

            System.out.println ("In position" + (i + 1) + "was saved:" + array [i]);
            System.out.println ("The total sum is:" + add);
            Scanner sc = new Scanner (System.in);
        }

        int i;
        float s = 0, p = 3;
        int [] a = new int [3];

        for (i = 0; i <3; i ++) {
            System.out.println ("enter the integer in position:" + (i + 1));

            a [i] = input.nextInt ();
        }
        for (i = 0; i <a.length; i ++) {
            s = s + a [i];

            p = s / a.length;
        }
        System.out.println ("the average is:" + p);
    }

}