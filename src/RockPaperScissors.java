
import java.util.Scanner;
import java.util.Random;
public class RockPaperScissors {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
        
		 int userChoice, computerChoice, rock, paper, scissors;
		 int counter;
	      
	      //create input object so as to use it's methods for geting use input
	      Scanner input = new Scanner (System.in);
	      
	      //create random input for the computer
	      Random rnd = new Random();  
	      
	      //Assigning values to each variables
	      rock = 1;
	      paper = 2;
	      scissors = 3;
	      ///int track;
	     
	      //user input
	      System.out.println("Please enter the round (1=rock, 2=paper, 3= scissors)");
	      userChoice = input.nextInt();
	               //if user chooses above 3
	              while (userChoice > 3) {
	            System.out.println("this is error, try next round");
	           userChoice = input.nextInt();
	          //System.exit(0);
	        }
	       //user selections
	       if (userChoice == rock)
	       {
	         System.out.println("User chose ROCK");
	       }
	      else
	      {
	        if(userChoice== paper)
	        {
	          System.out.println("User chose PAPER");
	        }
	        else
	        {
	        	if(userChoice==scissors)
	        	{
	          System.out.println("User chose SCISSORS");
	        	}
	        }
				}
	      //computer input (random)
	      computerChoice = rnd.nextInt(3);
	      
	      //computer selection
	      if(computerChoice == rock)
	      {
	        System.out.println("Computer chose ROCK");
	      }
	      else
	      {
	        if(computerChoice == paper)
	        {
	          System.out.println("Computer chose PAPER");
	        }
	        else
	        {
	          System.out.println("Computer chose SCISSORS");
	        }
	      }
	      
	      //Results section
	      
	      //Draw
	      while (userChoice == computerChoice) {
	            System.out.println("tie");
	            
	            // if user chooses above 3
	            userChoice = input.nextInt();
	                          while (userChoice > 3) {
	                            System.out.println("this is error, please go next");
	                            userChoice = input.nextInt();
	                            }
	            computerChoice = rnd.nextInt(3);
	                       // DRAW user selections
	                        if (userChoice == rock)
	                            {
	                                System.out.println("User chose ROCK");
	                            }
	                        else
	                        {
	                            if(userChoice== paper)
	                            {
	                                System.out.println("User chose PAPER");
	                            }
	                            else
	                            {
	                                System.out.println("User chose SCISSORS");
	                            }
				}      
	                       //DRAW computer selection
	                        if(computerChoice == rock)
	                            {
	                                System.out.println("Computer chose ROCK");
	                            }
	                        else
	                            {
	                                if(computerChoice == paper)
	                                {
	                                    System.out.println("Computer chose PAPER");
	                                }
	                                else
	                                {
	                                if(computerChoice==scissors)
	                                    System.out.println("Computer chose SCISSORS");
	                                }
	                            }
	                        } //END DRAW
	      
	//RESULTS
	      if (computerChoice==rock)
	        {
	            if (userChoice==paper)
	            {  
	                System.out.println("User wins!");
	            }
	            else 
	            {
	                System.out.println("Computer Wins");
	            }
	        }
	      else if (computerChoice==paper)
	      {
	        if (userChoice==rock)
	            {
	                System.out.println("Computer wins");
	            }
	        else
	            {
	                System.out.println("User Wins!");
	            }
	      }
	      else if (userChoice==rock)
	      {
	        System.out.println("User Wins");
	      }
	      else
	      {
	          System.out.println("Computer Wins");
	      } //END RESULTS
	    }//END main
	    
	}//END class
     
	

		