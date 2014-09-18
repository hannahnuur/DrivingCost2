/*
 * Hannah Nuur
 * 9/15/2014
 * COMP 2243 Programming and Problem Solving
 * Assignment #2 DrivingCost2.java
 * Calculates driving cost by using user inputs and displays driving cost and user input.
 */
   
import javax.swing.JOptionPane;
   
public class DrivingCost2{
   
   public static void main (String[] args){
   
     String firstName, lastName;
     String totalMilesStr, costGalStr, avgMilesStr, drivingCostStr, outputStr;
     int totalMiles;
     double costGal, avgMiles, drivingCost;
   
     firstName = JOptionPane.showInputDialog("Enter first name:");
     lastName = JOptionPane.showInputDialog("Enter last name:");
     
     totalMilesStr = JOptionPane.showInputDialog("Enter total miles driven per day:");
     totalMiles = Integer.parseInt(totalMilesStr);  
     
     costGalStr = JOptionPane.showInputDialog("Enter the cost per gallon of gasoline:");
     costGal = Double.parseDouble(costGalStr);
     
     avgMilesStr = JOptionPane.showInputDialog("Enter the average miles per gallon:");
     avgMiles = Double.parseDouble(avgMilesStr);
   
     drivingCost = (totalMiles/avgMiles)*costGal;
     
     outputStr = String.format("Hello, %s %s.%n", firstName, lastName) 
               + String.format("Your total miles driven "
                               + "per day is %d.%n", totalMiles)
               + String.format("The cost per gallon of "
                               + "gasoline is $%.2f.%n", costGal)
               + String.format("The average miles per gallon "
                               + "is %.0f.%n", avgMiles)
               + String.format("Your daily driving cost "
                               + "is $%.2f.%n", drivingCost);         
  
     JOptionPane.showMessageDialog(null, outputStr, "Daily Driving Cost", JOptionPane.INFORMATION_MESSAGE);
  
     System.exit(0);        
   }//end main  
}//end class