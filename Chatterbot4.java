//
// Program Name: chatterbot4
// Description: the goal of the current version of this program is to extend the previous chatterbot,
// actualy to make it more flexible in the way it treats the inputs from the different users.
// Also this version will try controling repetions that are made by the user.
//
// Author: Gonzales Cenelia
//
import java.io.*;
import java.util.*;

public class Chatterbot4 {
	
	final static int maxInput = 1;
	final static int maxResp = 3;
	final static String delim = "?!.;";
	
	static String[][] KnowledgeBase = {
			{"WHAT IS YOUR NAME", 
			 "MY NAME IS CHATTERBOT3.",
			 "YOU CAN CALL ME CHATTERBOT3.",
			 "WHY DO YOU WANT TO KNOW MY NAME?"
			},

			{"HI", 
			 "HI THERE!",
			 "HII,HOW ARE YOU?",
			 "HI!"
			},
			
			{"HOW ARE YOU",
			 "I'M DOING FINE!",
			 "I'M DOING WELL AND YOU?",
			 "WHY DO YOU WANT TO KNOW HOW AM I DOING?"
			},

			{"WHO ARE YOU",
			 "I'M AN A.I PROGRAM.",
			 "I THINK THAT YOU KNOW WHO I'M.",
			 "WHY ARE YOU ASKING?"
			},

			{"ARE YOU INTELLIGENT",
			 "YES,OFCORSE.",
			 "WHAT DO YOU THINK?",
			 "ACTUALY,I'M VERY INTELLIENT!"
			},

			{"ARE YOU REAL",
			 "DOES THAT QUESTION REALLY MATERS TO YOU?",
			 "WHAT DO YOU MEAN BY THAT?",
			 "I'M AS REAL AS I CAN BE."
			}
		};
	
	static boolean isPunc(char ch) {
		return delim.indexOf(ch) != -1;
	}
	
	// removes punctuation and redundant
	// spaces from the user's input
	static StringBuffer cleanString(String str) {
		StringBuffer temp = new StringBuffer(str.length());
		char prevChar = 0;
		for(int i = 0; i < str.length(); ++i) {
			if(str.charAt(i) == ' ' && prevChar == ' ' ) {
				continue;
			} else if(!isPunc(str.charAt(i))) {
				temp.append(str.charAt(i));
			}
			prevChar = str.charAt(i);
		}
		return temp;
	}
	
	static String preProcessInput(String str) {
		StringBuffer temp = new StringBuffer(str.toUpperCase());
		temp = cleanString(temp.toString());
		return temp.toString();
	}
	
	static Vector<String> findMatch(String str) {
		Vector<String> result = new Vector<String>(maxResp);
		for(int i = 0; i < KnowledgeBase.length; ++i) {
			// there has been some improvements made in
			// here in order to make the matching process
			// a littlebit more flexible
			//takes the user input and in it checks the predefined sentences.
			//e.g again tell me what is your name :gives answer
			if(str.indexOf(KnowledgeBase[i][0]) != -1) {
				for(int j = maxInput; j <= maxResp; ++j) {
					result.add(KnowledgeBase[i][j]);
				}
				break;
			}
		}
		return result;
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		String sResponse = "";
		String sInput = "";
		while(true) {
			System.out.print(">");
			String sPrevInput = sInput;
			String sPrevResponse = sResponse;
			BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
			sInput = in.readLine();
			sInput = preProcessInput(sInput);
			Vector<String> responses = new Vector<String>(maxResp);
			responses = findMatch(sInput);
			if(sPrevInput.equalsIgnoreCase(sInput) && sPrevInput.length() > 0) {
				// controling repetitions made by the user
				System.out.println("YOU ARE REPEATING YOURSELF.");
			} else if(sInput.equalsIgnoreCase("BYE")) {
				System.out.println("IT WAS NICE TALKING TO YOU USER, SEE YOU NEXT TIME!");
				break;
			} else if(responses.size() == 0) {
				// handles the case when the program doesn't understand what the user is talking about	
				System.out.println("I'M NOT SURE IF I UNDERSTAND WHAT YOU ARE TALKING ABOUT.");
			} else {
				Random generator = new Random();
				int nSelection = generator.nextInt(maxResp);
				sResponse = responses.elementAt(nSelection);
				// avoids repeating the same response
				if(sResponse == sPrevResponse) {
					responses.removeElementAt(nSelection);
					nSelection = generator.nextInt(maxResp);
					sResponse = responses.elementAt(nSelection);
				}
				System.out.println(sResponse);
			}
		}
	}
}