package week12.blame;

public class Paul implements Blameable{
    public Paul(){}

    public Blameable taskIssue() {
        return new Jesse();
    }
    public Blameable quizIssue(){
        return this;
    }
    public Blameable interviewIssue(){
        return this;
    }
    public void applyBlame(){
        System.out.println("It's still Jesse's fault");
    }
}
