
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * Created bu: msteph22
 * Date: 3/21/21
 * 
 */
public class Main {
    public static void main(String[] args) throws Exception {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter your age");

        int age = keyboard.nextInt();
        try{
            double lifeInsuranceCost = calculateLifeInsurance(age);
            System.out.println("Your estimate is " + lifeInsuranceCost);
        }catch(InvalidAgeException ex){
            System.out.println("You entered an invalid number");
        }
    }
    
    public static double calculateLifeInsurance(int age) throws InvalidAgeException  {
        if ((age < 5) || (age > 110)){
            throw new InvalidAgeException("This is not a valid age.");
        }
        
        double insuranceCost = (5 * age) + 300;
        return insuranceCost;
    }
}
