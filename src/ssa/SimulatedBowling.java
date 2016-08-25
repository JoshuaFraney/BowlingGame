package ssa;

public class SimulatedBowling {
	//declare variables and array
	int bowlingScores[][] = new int[3][10];
	int frame[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
	int totalScoreGame1;
	int totalScoreGame2;
	int totalScoreGame3;
	private String title;
	
	//main bowl method for running the game and printing the output
	public void bowl() {
		for (int game = 0; game < bowlingScores.length; game++){
			for(int frame = 0; frame < bowlingScores[game].length; frame++){
				bowlingScores[game][frame] = getPinsKnockedDown();
			}
			}
		System.out.println(print());
	}
	
	//cumulative print method to print the desired score card
	private String print() {
		return printTitle() + "\n" + printGame1() + "\n" + printGame2() + "\n" 
				+ printGame3() + "\n" + printTotal();
		
	}
	
	//method to generate a random number for one frame
	int getPinsKnockedDown() {
		int mathRandomInt = (int)(Math.random() * 10);
		int pinsKnockedDown = mathRandomInt;
		//to bowl a second ball if the first ball is not 10
		if(mathRandomInt != 10) {
			int remainingPins = 10 - mathRandomInt;
			pinsKnockedDown += (int)(Math.random() * remainingPins);
			}
		return pinsKnockedDown;
	}
	
	//method to print the top line with Frames 1 through 10 and Total
	private String printTitle() {
		String title = "";
		for(int i = 0; i < frame.length; i++) {
			title += frame[i] + "\t";
			}
			return "Frames" + "\t\t" + title + "Total";
			
	}
	
	//method to print game 1 line in the scorecard
	private String printGame1() {
		String gameScore = "Game 1\t\t";
		for(int game = 0; game < bowlingScores[0].length; game++) {
			totalScoreGame1 += bowlingScores[0][game];
			gameScore += bowlingScores[0][game] + "\t";
		}
		return gameScore + totalScoreGame1;
		
	}
	
	//method to print game 2 line in the scorecard
	private String printGame2() {
		String gameScore = "Game 2\t\t";
		for(int game = 0; game < bowlingScores[1].length; game++) {
			totalScoreGame2 += bowlingScores[1][game];
			gameScore += bowlingScores[1][game] + "\t";
		}
		return gameScore + totalScoreGame2;
		
	}
	
	//method to print game 3 line in the scorecard
	private String printGame3() {
		String gameScore = "Game 3\t\t";
		for(int game = 0; game < bowlingScores[2].length; game++) {
			totalScoreGame3 += bowlingScores[2][game];
			gameScore += bowlingScores[2][game] + "\t";
		}
		return gameScore + totalScoreGame3;
		
	}
	
	//method to print the bottom total line in the scorecard
	private String printTotal() {
		String totalTitle = "Total Series \t\t\t\t\t\t\t\t\t\t\t";
		return totalTitle + (totalScoreGame1 + totalScoreGame2 + totalScoreGame3);
	}
	
	
	}
