import java.util.Random;

public class Student {
	// vars
    private char studentanswer;
    private String studentID;
    
    // default constructor
    public Student() {
        
    }
    // paramaterized constructor 

    public Student(String studentID, char studentanswer) {
        this.studentanswer = studentanswer;
        this.studentID = studentID;
    }
    // getting student id
    public String getID(){
        return studentID;
    }
    // setting student id by randomizing
    public void setID() {
        String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        StringBuilder sb = new StringBuilder();
        Random random = new Random();
        
        // length of id that includes 5 chars and 5 integers for ID value
        int idLength = 5;
        // creating random string with letters and numbers for student ID's
        for(int i = 0; i < idLength; i++) {
          int rand = random.nextInt(10 - 1 + 1) + 1;
          int index = random.nextInt(alphabet.length());
          char randomChar = alphabet.charAt(index);
          sb.append(randomChar);
          sb.append(rand);
        }
        String randomString = sb.toString();
        
        this.studentID = randomString;
    }
    // getting the answers of each student
    public char getAnswer(){
        return studentanswer;
    }
    // sets answer for each student 
    public void setAnswer(char studentanswer) {
        this.studentanswer = studentanswer;
    }
    
    // random answer gen to get user inputs
    public void randomAnswer(){
        Random random = new Random();
        studentanswer = (char)(random.nextInt(4) + 65);
    }
}