package codesoft;
import java.util.*;

public class quizgame {
	
	
	    private static final int QUESTION_TIME_LIMIT_SECONDS = 10;

	    private List<Question> questions;
	    private int currentQuestionIndex;
	    private int userScore;

	    public quizgame() {
	        this.questions = initializeQuestions();
	        this.currentQuestionIndex = 0;
	        this.userScore = 0;
	    }

	    private List<Question> initializeQuestions() {
	        // Add your quiz questions with options and correct answers here
	        List<Question> quizQuestions = new ArrayList<>();

	        // Example question
	        Question question1 = new Question("What is the capital of France?", 
	                                          List.of("A. Berlin", "B. Paris", "C. Madrid", "D. Rome"), 
	                                          "B");
	        quizQuestions.add(question1);

	        // Add more questions as needed

	        return quizQuestions;
	    }

	    public void startGame() {
	        System.out.println("Welcome to the Quiz Game!");

	        Timer timer = new Timer();
	        timer.schedule(new TimerTask() {
	            
	            public void run() {
	                System.out.println("Time's up!");
	                displayNextQuestion();
	            }
	        }, QUESTION_TIME_LIMIT_SECONDS * 1000);

	        displayNextQuestion();
	    }

	    private void displayNextQuestion() {
	        if (currentQuestionIndex < questions.size()) {
	            Question currentQuestion = questions.get(currentQuestionIndex);

	            System.out.println("\nQuestion: " + currentQuestion.getQuestion());
	            for (String option : currentQuestion.getOptions()) {
	                System.out.println(option);
	            }

	            System.out.print("Your answer: ");
	            Scanner scanner = new Scanner(System.in);
	            String userAnswer = scanner.nextLine().toUpperCase();

	            if (userAnswer.equals(currentQuestion.getCorrectAnswer())) {
	                System.out.println("Correct!");
	                userScore++;
	            } else {
	                System.out.println("Incorrect. The correct answer is " + currentQuestion.getCorrectAnswer());
	            }

	            currentQuestionIndex++;
	            Timer timer = new Timer();
				timer.cancel(); // Cancel the previous timer
	            startGame();    // Move to the next question
	        } else {
	            endGame();
	        }
	    }

	    private void endGame() {
	        System.out.println("\nGame Over!");
	        System.out.println("Your final score: " + userScore + "/" + questions.size());

	        // Display a summary of correct/incorrect answers if needed

	        System.exit(0);
	    }

	    public static void main(String[] args) {
	        quizgame quizGame = new quizgame();
	        quizGame.startGame();
	    }
	}

	class Question {
	    private String question;
	    private List<String> options;
	    private String correctAnswer;

	    public Question(String question, List<String> options, String correctAnswer) {
	        this.question = question;
	        this.options = options;
	        this.correctAnswer = correctAnswer;
	    }

	    public String getQuestion() {
	        return question;
	    }

	    public List<String> getOptions() {
	        return options;
	    }

	    public String getCorrectAnswer() {
	        return correctAnswer;
	    }
	}


