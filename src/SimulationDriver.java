import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class SimulationDriver {
    private static VotingService service = new VotingService();
	private static Random random = new Random();
    private static int numOfStudents = random.nextInt(5) + 1;

    // single choice question sim
    public static void singleChoice() {
    	Student student = new Student();
        SingleChoiceQuestion SQ = new SingleChoiceQuestion();
        
        // for loop for num of students to generate each students id and answers
        for(int i = 0; i < numOfStudents; i++){
            student.setID();
            System.out.println("Student ID: " + student.getID());
            
            // setting question 
            SQ.setQuestion("How many states in the USA?");
            System.out.println(SQ.getQuestion());
            
            // setting the question choice
            for (int j = 0; j < 4; j++) {
                String arr[] = { "A. 49", "B. 50", "C. 51", "D. 13" };
                SQ.setQuestionChoice(arr[j]);
                System.out.println(arr[j]);
            }
            // random answer for each student
            student.randomAnswer();
            System.out.println("\nStudent picked: " + student.getAnswer() + "\n");
            service.totalAnswers(student.getAnswer());

        }
        // printing out answers
        System.out.print("Single Choice Question ");
        service.answers();
    }
    // multiple choice question sim
    public static void multipleChoice() {
    	Student student = new Student();
        MultipleChoiceQuestion MQ = new MultipleChoiceQuestion();
        
        // for loop for num of students to generate each students id
        for(int i = 0; i < numOfStudents; i++){
            List<Character> list = new ArrayList<Character>();
            
            // setting student id
        	student.setID();
            System.out.println("Student ID: " + student.getID());
            
            // setting the question
            MQ.setQuestion("Which shapes have 3+ sides?");
            System.out.println(MQ.getQuestion());
            
            // for loop for answers with 4 possible choices
            for (int j = 0; j < 4; j++) {
                String arr[] = { "A. Triangle", "B. Square", "C. Circle", "D. Oval" };
                MQ.setQuestionChoice(arr[j]);
                System.out.println(arr[j]);
                student.randomAnswer();
                
                // student answers
                if(list.contains(student.getAnswer()) == false){
                    list.add(student.getAnswer());
                    service.totalAnswers(student.getAnswer());
                }
            }
            // print out list with the answers
            System.out.println("\nStudent picked: " + list + "\n");
        }
        System.out.print("Multiple Choice Question ");
        service.answers();
    }
    // main that tests single and multiple choice questions
    public static void main(String[] args) {
        System.out.println("Number of students: " + numOfStudents + "\n");
        singleChoice();

        service.newQuestion();

        System.out.println("Number of students: " + numOfStudents + "\n");
        multipleChoice();
    }

}