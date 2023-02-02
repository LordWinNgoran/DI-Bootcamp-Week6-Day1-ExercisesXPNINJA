package exercise3;

public class Person {


    String name;
    int age;
    char gender;
  
    //Constructeur par défaut
    public Person() {
        this.name = "Unknown";
        this.age = 0;
        this.gender = 'U';
    }
  
    //Deuxième constructeur
    public Person(String name, int age, char gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }
  
    //Troisième constructeur
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
        this.gender = 'U';
    }
  
    //Méthode displayInfo
    public void displayInfo() {
        System.out.println("Name: " + this.name + ", Age: " + this.age + ", Gender: " + this.gender);
    }
    
    public static void main(String[] args) {
    	  //Création de trois objets Person
        Person person1 = new Person();
        Person person2 = new Person("NigthWalker", 27, 'M');
        Person person3 = new Person("Lordwin James", 25);
        
        //Affichage des informations des trois objets
        person1.displayInfo();
        person2.displayInfo();
        person3.displayInfo();
	}
}
