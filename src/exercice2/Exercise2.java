//Exercise 2 : Intermediate Data Type
/*
 * @author: N'goran Kouadio Jean Cyrille
 * @description: Write a Java program that implements the Class diagram given below:
 * Date : 29/01/2023
 */
package exercice2;

public class Exercise2 {

	 public static void main(String[] args) {
	        
	        /* 1 Create a program that declares several variables of different data types, 
		 	including at least one variable of each of the following types: int, double, char, and boolean
		 	*/
		 
		 	//2 Assign values to each of the variables.
	        boolean IsTaller = true;
	        double price =450.9;
	        String name = "Lordwin james";
	        char Sex = 'F';
	        boolean isStudent = false;
	        
	        
	        // 3 Print the value of each variable to the console using the appropriate method

	        System.out.println("Name: " + name);
	        System.out.println("Taller: " + IsTaller);
	        System.out.println("Price: " + price);
	        System.out.println("Sex: " + Sex);
	        System.out.println("IsStudent: " + isStudent);
	        
	        // 4 Modify the values of the variables and print the new values to the console
	        IsTaller = false;
	        price = 255;
	        Sex = 'M';
	        isStudent = false;
	        name = "ST patrick";
	        // Print
	        System.out.println("Name: " + name);
	        System.out.println("Taller: " + IsTaller);
	        System.out.println("Price: " + price);
	        System.out.println("Sex: " + Sex);
	        System.out.println("IsStudent: " + isStudent);
	    
	        // 5 casting operation
	        int priceLess = (int) (price / 1.2);
	        System.out.println("\n The price of iphone: " + priceLess + " kg");
	    
	        //6 Use at least one mathematical operation
	        double sum = price + price;
	        System.out.println("\nSum of weight and age: " + sum);
	    
	        //7 Use at least one comparison operato
	        if (price > 20) {
	            System.out.println("\nAge is greater than 20");
	        }else {
	            System.out.println("\nAge is less than or equal to 20");
	        }
	    
	        // 8 Use at least one control flow statement
	        switch (priceLess) {
	        case 200 :
	            System.out.println("\n Too expensive");
	            break;
	        case 300:
	            System.out.println("\n Not bad");
	            break;
	        default:
	            System.out.println("\n out of range");
	            break;
	        }
	    }

}
