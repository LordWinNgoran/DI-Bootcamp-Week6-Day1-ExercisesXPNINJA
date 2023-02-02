package exercice1;

public class DataTypes {

	int age;
	double weight;
	boolean isStudent;
	char gender;
	String name;

	public DataTypes(String name,int age,char gender, double weight, boolean isStudent) {
	    this.age = age;
	    this.weight = weight;
	    this.isStudent = isStudent;
	    this.gender = gender;
	    this.name = name;
	  }

	public void displayInfo() {
		System.out.println("Name: " + name + ", Age: " + age + ", Gender: " + gender + ", Weight: " + weight
				+ ", IsStudent: " + isStudent);
	}

	public static void main(String[] args) {
DataTypes info = new DataTypes("LordWin James",25,'M', 70.0, false);
        
        info.displayInfo();

	}

}
