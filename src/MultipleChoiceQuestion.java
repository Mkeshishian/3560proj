public class MultipleChoiceQuestion implements Question{
    // vars
    private String userQuestion;
    private String questionChoice;
    
    //override methods from question interface
    @Override
    public String getQuestion() {
        return userQuestion;
    }

    @Override
    public String getQuestionChoice() {
        return questionChoice;
    }

    @Override
    public void setQuestion(String userQuestion) {
        this.userQuestion = userQuestion;
    }

    @Override
    public void setQuestionChoice(String questionChoice) {
        this.questionChoice = questionChoice;
    }
}