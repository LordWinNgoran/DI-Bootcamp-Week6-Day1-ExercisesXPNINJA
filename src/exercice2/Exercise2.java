package exercice2;

public class Exercise2 {

	 public static void main(String[] args) {
	        
	        // Déclarez et initialisez les variables
	        int age = 25;
	        double weight = 70.5;
	        char gender = 'M';
	        boolean isStudent = false;
	        String name = "Lordwin james";
	        
	        // Afficher les valeurs des variables
	        System.out.println("Age: " + age);
	        System.out.println("Weight: " + weight);
	        System.out.println("Gender: " + gender);
	        System.out.println("IsStudent: " + isStudent);
	        System.out.println("Name: " + name);
	        
	        // Modifiez les valeurs des variables
	        age = 27;
	        weight = 75;
	        gender = 'M';
	        isStudent = false;
	        name = "Lordwin James";
	        
	        // Imprimez les nouvelles valeurs des variables
	        System.out.println("\nNew Values:");
	        System.out.println("Age: " + age);
	        System.out.println("Weight: " + weight);
	        System.out.println("Gender: " + gender);
	        System.out.println("IsStudent: " + isStudent);
	        System.out.println("Name: " + name);
	    
	        // Conversion de type
	        int weightInKg = (int) (weight / 2.2);
	        System.out.println("\nWeight in kilograms: " + weightInKg + " kg");
	    
	        // Opération mathématique
	        double sum = weight + age;
	        System.out.println("\nSum of weight and age: " + sum);
	    
	        // Opérateur de comparaison
	        if (age > 20) {
	            System.out.println("\nAge is greater than 20");
	        }else {
	            System.out.println("\nAge is less than or equal to 20");
	        }
	    
	        // Instruction de flux de contrôle
	        switch (gender) {
	        case 'M':
	            System.out.println("\nGender is Male");
	            break;
	        case 'F':
	            System.out.println("\nGender is Female");
	            break;
	        default:
	            System.out.println("\nInvalid gender");
	            break;
	        }
	    }

}
