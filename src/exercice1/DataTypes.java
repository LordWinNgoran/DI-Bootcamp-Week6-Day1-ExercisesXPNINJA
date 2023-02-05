//Exercise 1 : Data Types
/*
 * @author: N'goran Kouadio Jean Cyrille
 * @description: Write a Java program that implements the Class diagram given below:
 * Date : 29/01/2023
 */
package exercice1;

public class DataTypes {
	// 1 Create a program that declares and initializes variables of different data types:
	int age;
	double weight;
	boolean isStudent;
	char gender;
	String name;
	// A constructor with 5 parameters
	public DataTypes(String name,int age,char gender, double weight, boolean isStudent) {
	    this.age = age;
	    this.weight = weight;
	    this.isStudent = isStudent;
	    this.gender = gender;
	    this.name = name;
	  }

	// A methode to display all attributes
	public void displayInfo() {
		System.out.println("Name: " + name + ", Age: " + age + ", Gender: " + gender + ", Weight: " + weight
				+ ", IsStudent: " + isStudent);
	}

	public static void main(String[] args) {
DataTypes info = new DataTypes("LordWin James",25,'M', 70.0, false);
        
        info.displayInfo();

	}

}
