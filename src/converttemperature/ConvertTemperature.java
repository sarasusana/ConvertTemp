/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package converttemperature;

/**
 *
 * @author BURGOS
 */
import java.util.Scanner;
public class ConvertTemperature {
    private final static double NINE_FIFTHS = 1.8;
    private final static int CONSTANT = 32;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println();
        System.out.println("This program converts temperature °C to °F");
        
        double tempC, tempF;
        Scanner temp = new Scanner(System.in);
        
        System.out.println("Enter the value in Celcius degree");
        tempC = temp.nextInt();
        
        tempF = NINE_FIFTHS * tempC + CONSTANT;
        System.out.println("The temperature in Fahrenheit degree is " + tempF);
        
        
    }
    
}
