package week14.blame;

public class Jesse implements Blameable{
    public Jesse(){}

    public Blameable taskIssue() {
        return this;
    }
    public Blameable quizIssue(){
        return new Paul();
    }
    public Blameable interviewIssue(){
        return new Paul();
    }
    public void applyBlame(){
        System.out.println("It's Jesse's fault");
    }
}
