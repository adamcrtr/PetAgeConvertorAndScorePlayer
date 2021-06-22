/**
 * @(#)Pet.java
 *
 *
 * @author
 * @version 1.00 2018/5/9
 */


public class Pet {

  //attributes
  private String type;
  private int age;
  private int humanAge;

  //constructors
  public Pet(){
  }
  public Pet(String t, int age){
  	setType(t);
  	setAge(age);
  }
  //get and set methods
  public void setType(String t){
  	type = t;
  }
  public void setAge(int a){
  	age = a;
  }
  public String getType(){
  	return type;
  }
  public int getAge(){
  	return age;
  }
  public int getHumanAge(){
  	return humanAge;
  }

  //methods
  public void print (){
  	System.out.println("PET TYPE " + type);
  	System.out.println("PET AGE " + age);
  	System.out.println("PET HUMAN AGE " + humanAge);
  }
  public int calcDogHumanAge(int a){
  	if (a == 1){
  		humanAge = 11;
  	}
  	if (a == 2){
  		humanAge = 22;
  	}
  	if (a >= 3 ){
  		humanAge = (22 + ((a - 2) * 4));
  	}
  	return humanAge;
  }

  public int calcCatHumanAge(int a){
  	if (a == 1){
  		humanAge = 15;
  	}
  	if (a == 2){
  		humanAge = 25;
  	}
  	if (a >= 3){
  		humanAge = (25 + ((a - 2)*4));
  	}
  	return humanAge;
  }



}