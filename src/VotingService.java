public class VotingService {
	
	// vars for answer choices
    public int A;
    public int B;
    public int C;
    public int D;
    // getters and setters for each option
    public int getA() {
        return A;
    }
    public void setA(int A) {
        this.A = A;
    }
    public int getB() {
        return B;
    }
    public void setB(int B) {
        this.B = B;
    }
    public int getC() {
        return C;
    }
    public void setC(int C) {
        this.C = C;
    }
    public int getD() {
        return D;
    }
    public void setD(int D) {
        this.D = D;
    }
    // default constructor 
    public VotingService() {
        
    }
    // paramaterized constructor 
    public VotingService(int A, int B, int C, int D) {
        this.A = A;
        this.B = B;
        this.C = C;
        this.D = D;
    }
    // resets all values to 0
    public void newQuestion(){
        this.A = 0;
        this.B = 0;
        this.C = 0;
        this.D = 0;
    }
    // printing out answer ammounts
    public void answers() {
        System.out.print("Answers:" + "\n" + "[A: " + A + ", B: " + B +  ", C: " + C +  ", D: " + D + "]\n");
    }
    // adds each time option is selected
    public void totalAnswers(char answer){
        if(answer == 'A'){
            A++;
        }
        else if(answer == 'B'){
            B++;
        }
        else if(answer == 'C'){
            C++;
        }
        else if(answer == 'D'){
            D++;
        }
    }

}