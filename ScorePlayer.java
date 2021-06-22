/**
 * @(#)ScorePlayer.java
 *
 *
 * @author
 * @version 1.00 2018/5/9
 */
 //import scanner for user input
import java.util.Scanner;
public class ScorePlayer {

    /**
     * Creates a new instance of <code>ScorePlayer</code>.
     */
    public ScorePlayer() {
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         //method for menu
         menu ();

        	//create scanner object
        	Scanner scan = new Scanner(System.in);

        	System.out.println("Please enter players name");

        	//get data
        	String name = scan.nextLine();

        	System.out.println("Please Enter position of the player, d = defender or goalie, m = midfielder or f = forward");
        	String position = scan.nextLine();
			//validation
        	if (!position.equals("d")&& !position.equals("m")&& !position.equals("f")){
        		System.out.println("Invalid input, program ends");
        		return;
        	}
        	//asks for user input to use in calculation of players score
        	System.out.println("Please enter goals scored");
        	int goalsscored = scan.nextInt();
        	System.out.println("Please enter goals saved");
        	int goalssaved = scan.nextInt();
        	System.out.println("Please enter goals missed");
        	int goalsmissed = scan.nextInt();
        	System.out.println("Please enter if they have a clean sheet true or false");
        	boolean sheet = scan.nextBoolean();






			//if statement to dertermine what calculation should be done depending on position
        	if (position.equals("d")){

        		System.out.println("You have slected defender");


        		//create player object
        		Player d1 = new Player(sheet, name, position, goalsscored, goalssaved, goalsmissed);


        		//uses method in other class to calculate
        		d1.calcDefender(goalsscored, sheet, goalssaved);
        		d1.print();
        	}
        	if (position.equals("m")){

        		System.out.println("You have slected midfielder");


        		//create player object
        		Player a1 = new Player(sheet, name, position, goalsscored, goalssaved, goalsmissed);


        		//uses method in other class to calculate score
        		a1.calcMidfielder(goalsscored, sheet);
        		a1.print();
        	}
        	if (position.equals("f")){

        		System.out.println("You have slected forward");


        		//create player object
        		Player b1 = new Player(sheet, name, position, goalsscored, goalssaved, goalsmissed);


        		//uses method in other class to calculate score
        		b1.calcForward(goalsscored, goalsmissed);
        		b1.print();
        	}

    }
//menu for program with help if needed
 private static void menu(){

				Scanner scan = new Scanner(System.in);

        		//introduction and help for menu
        		System.out.println("Welcome to the Fantasy Football Calculator");
        		System.out.println("Do you want to view help with this program?");
        		System.out.println("Answer with Y or N");
				//scans users input to determine if help is needed
        		String help = scan.nextLine();
				//option for help
        		if(help.equals("y")){
        			System.out.println("---------------------------HELP------------------------------------------");
        			System.out.println("Call this number 0151893934939 or read each message before entering input");
        			System.out.println("-------------------------------------------------------------------------");
        		}
        	}
}



