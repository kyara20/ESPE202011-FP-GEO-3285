/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ws21functions;

import java.util.Scanner;

/**
 *
 * @author Kyara Lizeth
 */
public class WS21Functions {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        double distance;
        double minutes;
        double seconds;
        double hundredths;
        double timeInSeconds;
        double speed;
        double speedKmH;
        
        System.out.println("AUTHOR: KYARA LIZETH PILATAXI SARABIA");
        // The speed traveled of a 4x4 vehicle in kilometers / hour
        System.out.println("Enter the distance traveled in meters : ");
        distance = input.nextDouble();
        System.out.println("Enter the minutes : ");
        minutes = input.nextDouble();
        System.out.println("Enter the seconds : ");
        seconds = input.nextDouble();
        System.out.println("Enter the hundredths : ");
        hundredths = input.nextDouble();
        speedKmH = calculateSpeedTraveled(minutes, seconds, hundredths, distance);
        printTheResult(speedKmH);
    }

    private static void printTheResult(double speedKmH) {
        System.out.println("The speed equals to -> " + speedKmH + " Km/h ");
    }

    private static double calculateSpeedTraveled(double minutes, double seconds, double hundredths, double distance) {
        double timeInSeconds;
        double speed;
        double speedKmH;
        timeInSeconds = (minutes * 60) + seconds + (hundredths / 100);
        speed = distance / timeInSeconds;
        speedKmH = (speed * 3600)/1000;
        return speedKmH;
    }
}


