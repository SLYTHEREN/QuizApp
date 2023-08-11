package com.slyther.quizApp;

public class quizMainRunner {

   


	public QuizApp(List<Question> questions) {
        this.questions = questions;
        currentQuestionIndex = 0;
    }

    public void startQuiz() {
        Scanner scanner = new Scanner(System.in);

        for (Question question : questions) {
            System.out.println(question.getQuestionText());

            // Display multimedia content if available

            List<String> options = question.getOptions();
            for (int i = 0; i < options.size(); i++) {
                System.out.println((i + 1) + ". " + options.get(i));
            }

            int userAnswer = scanner.nextInt();
            if (userAnswer - 1 == question.getCorrectOptionIndex()) {
                System.out.println("Correct!");
            } else {
                System.out.println("Incorrect. The correct answer was: " +
                                   options.get(question.getCorrectOptionIndex()));
            }
        }
    }

    public static void main(String[] args) {
        // Create questions using Question class
        // Create Admin instance to add questions
        // Pass the list of questions to QuizApp
        // Call startQuiz method to begin the quiz
   
	



	


		/* we need to create a constructor as well so that we can input the question and the options while declaring the object*/

		quizMain question1 = new quizMain();
		question1.setQuestion("First question");
		questions1.setMCQ1("A");
		questions1.setMCQ2("B");
		questions1.setMCQ3("C");
		questions1.setMCQ4("C");
		// still unsure about what to start with
		



		
		}
		/*
		 * JFrame frame = new JFrame("My First GUI");
		 * frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); frame.setSize(300,
		 * 300); JButton button = new JButton("Press");
		 * frame.getContentPane().add(button); // Adds Button to content pane of frame
		 * frame.setVisible(true);
		 * 
		 * 
		 * this is just a sample of a program in JFRam and java swing ( Need to work
		 * more on that )
		 */

	}
    public class QUESTION(){
        private int numberOfQuestions;


        }
