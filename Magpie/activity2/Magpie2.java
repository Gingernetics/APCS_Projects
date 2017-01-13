/*
***NOTICE***
This version of activity 2 includes the edded methods asked for in activity 3
Answers:
-When multiple keywords appear in a string, priority is assigned according to the 
order keywords are checked for in the code.
-If a keyword is imbedded in a word, the current version(Prior to act. 3 update)
will still catch it as a stand alone. Good for plurals (cheese and cheeses), bad for logic
(no and another)

*/
public class Magpie2
{
	/**
	 * Get a default greeting 	
	 * @return a greeting
	 */
	public String getGreeting()
	{
		return "Hello, let's talk.";
	}
	
	/**
	 * Gives a response to a user statement
	 * 
	 * @param statement
	 *            the user statement
	 * @return a response based on the rules given
	 */
	public String getResponse(String statement)
	{
		String response = "";
		if (findKeyword(statement, "no") >= 0)
		{
			response = "Fine then.";
		}
		else if (findKeyword(statement, "mother") >= 0
				|| findKeyword(statement, "father") >= 0
				|| findKeyword(statement, "sister") >= 0
				|| findKeyword(statement, "brother") >= 0)
		{
			response = "Do they have jobs?";
		}
		else if (findKeyword(statement, "dog") >= 0
				|| statement.indexOf("cat") >= 0)
		{
			response = "I don't have any pets.";
		}
		else if (findKeyword(statement, "Platek") >= 0)
		{
			response = "He sounds like a wonderful teacher.";
		}
		else if (statement.trim().length() == 0)
		{
			response = "Say something, please.";
		}
		else if (findKeyword(statement, "Stuy") >= 0)
		{
			response = "Hey, I know that school!";
		}
		else if (findKeyword(statement, "yes") >= 0)
		{
			response = "That's the spirit!";
		}
		else
		{
			response = getRandomResponse();
		}
		return response;
	}
	

	private int findKeyword(String statement, String goal,
			int startPos)
	{
		String phrase = statement.trim().toLowerCase();
		goal = goal.toLowerCase();

		// The only change to incorporate the startPos is in
		// the line below
		int psn = phrase.indexOf(goal, startPos);

		// Refinement--make sure the goal isn't part of a
		// word
		while (psn >= 0)
		{
			// Find the string of length 1 before and after
			// the word
			String before = " ", after = " ";
			if (psn > 0)
			{
				before = phrase.substring(psn - 1, psn);
			}
			if (psn + goal.length() < phrase.length())
			{
				after = phrase.substring(
						psn + goal.length(),
						psn + goal.length() + 1);
			}

			// If before and after aren't letters, we've
			// found the word
			if (((before.compareTo("a") < 0) || (before
					.compareTo("z") > 0)) // before is not a
											// letter
					&& ((after.compareTo("a") < 0) || (after
							.compareTo("z") > 0)))
			{
				return psn;
			}

			// The last position didn't work, so let's find
			// the next, if there is one.
			psn = phrase.indexOf(goal, psn + 1);

		}

		return -1;
	}


	private int findKeyword(String statement, String goal)
	{
		return findKeyword(statement, goal, 0);
	}


	/**
	 * Pick a default response to use if nothing else fits.
	 * @return a non-committal string
	 */
	private String getRandomResponse()
	{
		final int NUMBER_OF_RESPONSES = 4;
		double r = Math.random();
		int whichResponse = (int)(r * NUMBER_OF_RESPONSES);
		String response = "";
		
		if (whichResponse == 0)
		{
			response = "Interesting, tell me more.";
		}
		else if (whichResponse == 1)
		{
			response = "Hmmm.";
		}
		else if (whichResponse == 2)
		{
			response = "Do you really think so?";
		}
		else if (whichResponse == 3)
		{
			response = "You don't say.";
		}

		return response;
	}
}
