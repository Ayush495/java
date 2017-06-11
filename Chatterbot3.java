//
// Program Name: chatterbot3
// Description: this is an improved version of the previous chatterbot program "chatterbot1"
// this one will try a littlebit more to understand what the user is trying to say and will also
// try to avoid repeating himself too much. 
//
// Author: Gonzales Cenelia
//
import java.io.*;
import java.util.*;

public class Chatterbot3 {

	static String KnowledgeBase[][] = {
			{"WHAT IS YOUR NAME", 
			 "MY NAME IS CHATTERBOT2.",
			 "YOU CAN CALL ME CHATTERBOT2.",
			 "WHY DO YOU WANT TO KNOW MY NAME?"
			},

			{"HI", 
			 "HI THERE!",
			 "HOW ARE YOU?",
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
			 "ACTUALY,I'M VERY INTELLIGENT!"
			},

			{"ARE YOU REAL",
			 "DOES THAT QUESTION REALLY MATERS TO YOU?",
			 "WHAT DO YOU MEAN BY THAT?",
			 "I'M AS REAL AS I CAN BE."
			}
		};
	
	final static String puncs = "?!.;,";
	
	final static int inputNum = 1;
	final static int respNum = 3;
	
	
	static boolean isPunc(char ch) {
		return puncs.indexOf(ch) != -1;
	}
	
	static Vector findMatch(String str) {
		Vector<String> result = new Vector<String>(respNum);
		for(int i = 0; i < KnowledgeBase.length; ++i) {
			if(KnowledgeBase[i][0].equalsIgnoreCase(str)) {
				for(int j = inputNum; j <= respNum; ++j) {
					result.add(KnowledgeBase[i][j]);
				}
				break;
			}
		}
		return result;
	}
	
	// removes punctuation and redundant
	// spaces from the user's input
	static String cleanString(String str) {
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
		return temp.toString();
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		String sResponse = "";
		while(true) {
			System.out.print(">");
			BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
			String sInput = in.readLine();
			sInput = cleanString(sInput);
			Vector<String> responses = new Vector<String>(respNum);
			responses = findMatch(sInput);
			if(sInput.equalsIgnoreCase("BYE")) {
				System.out.println("IT WAS NICE TALKING TO YOU USER, SEE YOU NEXT TIME!");
				break;
			} else if(responses.size() == 0) {
				System.out.println("I'M NOT SURE IF I UNDERSTAND WHAT YOU ARE TALKING ABOUT.");
			} else {
				Random generator = new Random();
				int nSelection = generator.nextInt(respNum);
				String sPrevResponse = sResponse;
				sResponse = responses.elementAt(nSelection);
				if(sResponse == sPrevResponse) {
					responses.removeElementAt(nSelection);
					nSelection = generator.nextInt(respNum);
					sResponse = responses.elementAt(nSelection);
				}
				System.out.println(sResponse);
			}
		}
	}
}