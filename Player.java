/**
 * @(#)Player.java
 *
 *
 * @author
 * @version 1.00 2018/5/9
 */


public class Player {

   //private variables
   private String name;
   private String position;
   private int goalsScored;
   private boolean cleanSheet;
   private int savePenalties;
   private int missedPenalties;
   private int points;

   //constructors
   public Player(){
   }
   public Player(boolean c, String n, String p, int g, int sp, int mp){
   	setName (n);
   	setCleanSheet (c);
   	setPosition (p);
   	setGoalsScored (g);
   	setSavePenalties (sp);
   	setMissedPenalties (mp);
   }

   // get and set
   public void setPosition (String p){
   	position = p;
   }
   public String getPosition (){
   	return position;
   }
   public void setName (String n){
    name = n;
   }
   public String getName (){
   	return name;
   }
   public void setCleanSheet(boolean c){
   	cleanSheet = c;
   }
   public boolean getCleanSheet(){
   	return cleanSheet;
   }

   public void setGoalsScored(int g){
	   	goalsScored = g;
	   }
   public int getGoalsScored(){
	   	return goalsScored;
	   }

   public void setSavePenalties(int sp){
	   	savePenalties = sp;
	   }
  public int getSavePenalties(){
	   	return savePenalties;
	   }
  public void setMissedPenalties(int mp){
	   	missedPenalties = mp;
	   }
  public int getMissedPenalties(){
	   	return missedPenalties;
	   }
  public void setpoints(int ps) {
	  points = ps;
  }
  public int getpoints() {
	  return points;
  }
   //methods
    public void print (){
    	//prints information that user has entered
  	System.out.println("The Players Name is " + name);
  	System.out.println("The Players Position is " + position);
  	System.out.println("The players clean sheet status is " + cleanSheet );
  	System.out.println("The Player scored this many goals " + goalsScored );
  	System.out.println("The Player saved this many goals " + savePenalties );
  	System.out.println("The Player missed this many goals " + missedPenalties );
  	System.out.println("The players points earned " + points);
  }
  //methods for calculations
     public int calcDefender(int g, boolean s, int sp){
    	  	if (g > 0){
    	  		points = g * 6;
    	  	}
    	  	if (s == true) {
    	  		points = (g * 6) + 4;
    	  	}
    	  	if (sp > 0 ) {
    	  		points = ((sp * 3) + points);
    	  	}
    	  	return points;
    	  }
     public int calcMidfielder(int g, boolean s){
 	  	if (g > 0){
 	  		points = g * 5;
 	  	}
 	  	if (s == true) {
 	  		points = (g * 5) + 1;
 	  	}
 	  	return points;
 	  }
     public int calcForward(int g, int mp){
  	  	if (g > 0){
  	  		points = g * 4;
  	  	}
  	  	if (mp > 0) {
  	  		points = ((mp * -2) + points);
  	  	}
  	  	return points;
  	  }
}



