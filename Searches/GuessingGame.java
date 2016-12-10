import java.util.Scanner;

public class GuessingGame{


    // instance variables
    // the bounds of a guess (inclusive).
    private Integer _lowerBound = 1, _upperBound = 10; 
    private Integer _numGuesses = 0, _guessLimit = _upperBound; // _numGuesses is the # of guesses made
                                              // _guessLimit is the maximum # of guesses needed.
    private Integer _currentGuess;            // _currentGuess is the most recent guess
    private String _response;                 // _reponse is either "", "c","l","h" provided by the player
                                              //  "" is the initial value
                                              //  "c" if the _currentGuess is correct
                                              //  "l" if the _currentGuess is too low
                                              //  "h" if the _currentGuess is too high
  
    // precondition: lower >= 0, upper >= lower
    // postcondition: All instance variables are defined. 
    public GuessingGame(int lower, int upper){
        
    }


    // accessor methods

    // postcondition: returns true if the _currentGuess is correct or the _numGuess exceeds the _guessLimit
    //                otherwise returns false
    private boolean gameOver(){
        boolean ans = false;
        if (_responce == "c" || _numGuesses > _guessLimit)
            ans = false;
	    return ans;
    }
    

    // modifiers
    // postcondition: Purpose is to calculate a guess.
    //                Both _currentGuess and _numGuesses are updated.
    //                returns the guess.
    private int guess( ){
	return 0;
    }


    // precondition: _response is either "l" or "h"
    // postcondition : updates either _lowerBound or _upperBound depending on the value
    //                 of _response
    private void updateBounds(){
	
    }

    // postcondition: calls the guess() method and displays the information.
    private void makeGuess(){
	int g = guess();
	System.out.println("guess # " + _numGuesses + " : " + g);
    }



    // postcondition: Prompts user for either  "c", "l" or "h"
    //                reads a string from the input Stream
    //                ensures _response receives either "c","l", or "h"
    //               
    private void getResponse(){
	Scanner s = new Scanner(System.in);
	System.out.print("Is it correct(c), low(l), or high(h): ");
	_response = s.next();
	while ("clh".indexOf(_response) == -1)
	    getResponse();
    }


    // precondition: game is over
    // postcondition: Determines if player lied. If so prints "YOU LIED!", otherwise
    //                prints "Thanks for playing."
    private void endGame(){
    }
    
    public void play(){
	intro();
	while (!gameOver()){
	    makeGuess();
	    getResponse();
	    updateBounds();
	}
	endGame();
    }


    // NON-AP method
    
    private void intro() {
	System.out.println("Pick a # from " + _lowerBound + " to " + _upperBound);
	System.out.println("I'll give you 3 seconds.");
	try {
	    Thread.sleep(3000);                 //1000 milliseconds is one second.
	} catch(InterruptedException ex) {
	    Thread.currentThread().interrupt();
	}
    }

    
    public static void main(String [] args){
	int N = Integer.parseInt(args[0]);
	GuessingGame g = new GuessingGame(1,N);
	g.play();
    }

}
