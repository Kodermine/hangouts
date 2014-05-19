import java.util.ArrayList;
import java.util.Scanner;

class Quiz {

	//Comment
	
	/*
	 * Multi-line comment
	 * 
	 */
	
	public void start(){
	
		System.out.println("Loading...");
		
		DAO.questions = new ArrayList<Question>();//Initialize the objects , we cannot use null stuff...
		DAO.scanner = new Scanner(System.in);
		
		loadQuestions();//load the questions
		
		System.out.println("Hello and welcome to the quiz of D00M");
		
		int tempAnswer;//variable to store the user input
		
		for(int i = 0; i < DAO.questions.size() ;i++){//perform a loop of each question inside the list
		
			System.out.println("Question " + (i + 1));
			
			System.out.println(DAO.questions.get(i).question);
			
			System.out.println();
			
			System.out.println("1 - " + DAO.questions.get(i).answer1);
			System.out.println("2 - " + DAO.questions.get(i).answer2);
			System.out.println("3 - " + DAO.questions.get(i).answer3);
			System.out.println("4 - " + DAO.questions.get(i).answer4);
			
			System.out.print("You choose : ");
			
			tempAnswer = DAO.scanner.nextInt();//get user input
			
			if(tempAnswer == DAO.questions.get(i).rightAnswer){//if right
				
				System.out.println("Congrantulations , you answered the question correctly! +1 Point");
				DAO.points += 1;
				
			}else{//if wrong
				
				System.out.println("Oh no , you answered the question wrong!");
				System.out.println("Total points : " + DAO.points);
				
				System.exit(0);
			}
			
		}
		//if all questions are right , the loop will break and the program will end here
		System.out.println("Well done , you finished the quiz with a total of " + DAO.points + " points");
		//System.exit(0);
	}

	private void loadQuestions() {
		
		String input;//variables to store inputs
		
		String question;
		
		String answer1;
		String answer2;
		String answer3;
		String answer4;
		
		int rightAnswer;
		
		for(;;){
			
			if(DAO.questions.size() != 0){//if the user has already submitted a question
				
			System.out.println("Do you want to load another question? [y/*]");
			
			input = DAO.scanner.next();//get input
			
			if(!input.equalsIgnoreCase("y")){//if its not equal to 'y', start the actual quiz
				break;
			}
			
			}
			
			System.out.println("Question : ");//Question-related info
			question = DAO.scanner.next();
			
			System.out.println("Answer 1 : ");
			answer1 = DAO.scanner.next();
			
			System.out.println("Answer 2 : ");
			answer2 = DAO.scanner.next();
			
			System.out.println("Answer 3 : ");
			answer3 = DAO.scanner.next();
			
			System.out.println("Answer 4 : ");
			answer4 = DAO.scanner.next();
			
			System.out.println("Right Answer : ");
			rightAnswer = DAO.scanner.nextInt();
			
			DAO.questions.add(new Question(question , answer1, answer2, answer3, answer4, rightAnswer));//add a question to the list - passing data through the constructor
			
		}
	}
	
}
