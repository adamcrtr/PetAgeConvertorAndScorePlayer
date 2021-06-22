/**
 * @(#)AgeConversion.java
 *
 *
 * @author
 * @version 1.00 2018/5/9
 */
import java.util.Scanner;
public class AgeConversion {

    /**
     * Creates a new instance of <code>AgeConversion</code>.
     */

    public AgeConversion() {
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        menu ();

        	//create scanner object
        	Scanner scan = new Scanner(System.in);

        	System.out.println("Do you wish to convert dog or cat ages?");

        	//get data
        	String animal = scan.nextLine();

        	//validation
        	if (!animal.equals("dog")&& !animal.equals("cat")){
        		System.out.println("Invalid input, program ends");
        		return;
        	}
        	System.out.println("You have entered " + animal);

        	//code for dog
        	if (animal.equals("dog")){
        		//get age
        		System.out.println("Enter your dog age in years");
        		int myDogAge = scan.nextInt();

        		//creat dog object
        		Pet d1 = new Pet(animal, myDogAge);


        		//uses method in other class to calculate age
        		d1.calcDogHumanAge(myDogAge);
        		d1.print();
        	}

        	//main code for cat
        	if (animal.equals("cat")){
        		//get cat age
        		System.out.println("Enter your cat age in years ");
        		int myCatAge = scan.nextInt();

        		//create cat object
        		Pet c1 = new Pet(animal, myCatAge);

        		c1.calcCatHumanAge(myCatAge);
        		c1.print();
        	}


    }
    private static void menu(){
        		Scanner scan = new Scanner(System.in);

        		//introduction and help for menu
        		System.out.println("Welcome to the Animal Age Converter Program");
        		System.out.println("Do you want to view help with this program?");
        		System.out.println("Answer with Y or N");

        		String help = scan.nextLine();

        		if(help.equals("y")){
        			System.out.println("-----------------HELP--------------------");
        			System.out.println("Call this number 0151893934939");
        			System.out.println("-----------------------------------------");
        		}
        	}
}
