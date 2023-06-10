
import java.util.Scanner;
import java.util.Random;
public class RockPaperScissors {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
        
		 int userChoice, computerChoice, rock, paper, scissors;
		 int counter;
		 boolean playAgain = true;
	      
	      //create input object so as to use it's methods for geting use input
	      Scanner input = new Scanner (System.in);
	      
	      //create random input for the computer
	      Random rnd = new Random();  
	      
	      //Assigning values to each variables
	      rock = 1;
	      paper = 2;
	      scissors = 3;
	     
	      int userCounter = 0;
	      int compCounter = 0;
	      int tieCounter = 0;
	      //user input
	      System.out.println("Number of round You want to go?");
	      int numberOfRound = input.nextInt();
	      if(numberOfRound < 1 && numberOfRound > 10) {
	    	  System.out.println("wrong number");
	      }
	      
	      while(playAgain) {
	    	  while (numberOfRound >=1  && numberOfRound <= 10) {
	    	  for(int i=0; i < numberOfRound; i++) {
	    	  System.out.println("Enter your choice(choose 1=rock, 2= paper, 3= scissors)");
	    	  userChoice = input.nextInt();
	    	  computerChoice = rnd.nextInt(3)+1;
	    	  		if((userChoice == 1 && computerChoice == 3) || (userChoice == 2 && computerChoice == 1) || (userChoice == 3 && computerChoice == 2)){
	    	  			userCounter++;
	    	  			System.out.println("USER WIN ");
	    	  			System.out.println("user win for " + userCounter + "times");
	    	  			
	    	  		}
	    	  		if((userChoice ==1 && computerChoice ==1 ) || (userChoice == 2 && computerChoice == 2) || (userChoice == 3 && computerChoice == 3)) {
	    	  			tieCounter++;
	    	  			System.out.println("This Game TIE");
	    	  			System.out.println("Tie for " + tieCounter  + " times");
	    	  			
	    	  		}
	    	  		else if((userChoice == 3 && computerChoice == 1)||(userChoice == 1 && computerChoice == 2 ) || (userChoice == 2 && computerChoice == 3)) {
	    	  			compCounter++;
	    	  			System.out.println("COMPUTER WIN ");
	    	  			System.out.println("computer win for "+ compCounter + "times");
	    	  			
	    	  		}
	    	}
	    	  System.out.println("do you want to play again? yes or no");
	    	  String moreRound = input.next();
	    	  if(moreRound.equalsIgnoreCase("yes")) {
	    		  playAgain = true;
	    	  }
	    	  
	    	  else if(moreRound.equalsIgnoreCase("no")){
	    		  System.out.println("Thanks for playing!");
	    	  }
	    	  }
	      }
	      }
	}

	
	
	      
	      
	      
	      
	     
	

		