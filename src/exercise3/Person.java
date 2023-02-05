//Intermediate-Level Constructors
/*
 * @author: N'goran Kouadio Jean Cyrille
 * @description: Write a Java program that implements the Class diagram given below:
 * Date : 29/01/2023
 */
package exercise3;

public class Person {


    String name;
    int age;
    char gender;
  
    //Default constructor
    public Person() {
        this.name = "Unknown";
        this.age = 0;
        this.gender = 'U';
    }
  
    // second Constructor with parameters
    public Person(String name, int age, char gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }
  

    // Third Constructor with parameters
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
        this.gender = 'U';
    }
  
    //A method to display all attr
    public void displayInfo() {
        System.out.println("Name: " + this.name + ", Age: " + this.age + ", Gender: " + this.gender);
    }
    
    public static void main(String[] args) {
    	//create 3 objects of Person
        Person person1 = new Person();
        Person person2 = new Person("NigthWalker", 27, 'M');
        Person person3 = new Person("Lordwin James", 25);
        
        //print out 
        person1.displayInfo();
        person2.displayInfo();
        person3.displayInfo();
	}
}
