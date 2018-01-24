import java.util.Scanner;
import java.lang.Math;
import java.text.NumberFormat;

public class testScoreApp {
	
	public static void main(String[] args)
	{
		System.out.println("This program will evaluate test scores.");
		System.out.println("Enter scores from 0 to 100.");
		
		Scanner userInput = new Scanner(System.in);
		
		int score = 0;
		int scoreTotal=0;
		double avgScore=0.0;
		int scoreCount=0;
		double maxScore=0.0;
		double minScore=100.0;
		String choice="y";
		int num_of_scores=0;
		
		do 
		{
			System.out.print("Enter the number of test scores to be entered: ");
			num_of_scores= userInput.nextInt();
			for(int i=1; i<=num_of_scores; i++)
			{
				System.out.print("Enter Score " + i + " : ");
				score=userInput.nextInt();
				if(score >=0 && score <= 100)
				{
					scoreTotal+= score;
					scoreCount+=1;
					//Evaluates min and max scores
					maxScore= Math.max(maxScore, score);
					minScore=Math.min(minScore, score);
				}
				else
				{
					System.out.println("Invalid entry. Score will not be counted.");
					i--;
					
				}
				
			}
			avgScore = Math.round(scoreTotal/scoreCount);
			System.out.println("");
			System.out.println("Number of Scores: " +  scoreCount);
			System.out.println("Score total: " +  scoreTotal);
			System.out.println("Score Average: " +  avgScore);
			System.out.println("Minimum Score: " + minScore);
			System.out.println("Maximum Score: " + maxScore);
			
			System.out.print("Enter more test scores? (y/n)  ");
			choice=userInput.next();
			while(!choice.equalsIgnoreCase("n") && !choice.equalsIgnoreCase("y"))
			{
				System.out.print("Invalid Entry. Please enter \'y\' for yes or \'n\' for no:   ");
				choice=userInput.next();
				
			}
				
		}while(!choice.equalsIgnoreCase("n"));
		/*public static getTestScores(int score)
		{
			
		}
		*/
	
		/*NumberFormat avg_score_format = NumberFormat.getNumberInstance();
		avg_score_format.setMaximumFractionDigits(2);
		String finalAvg= avg_score_format.format(avgScore);
		*/
		
	}
}