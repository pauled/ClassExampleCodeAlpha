package week14.blame;

public class CSE116 {
    private Blameable professor;

    public CSE116(){
        this.professor=new Jesse();
    }
    public void taskIssue(){
        this.professor=this.professor.taskIssue();
    }
    public void quizIssue(){
        this.professor=this.professor.quizIssue();
    }
    public void interviewIssue(){
        this.professor=this.professor.interviewIssue();
    }
    public void applyBlame(){
        this.professor.applyBlame();
    }

    public static void main(String[] args) {
        CSE116 course=new CSE116();
        course.applyBlame();
        course.taskIssue();
        course.applyBlame();
        course.quizIssue();
        course.applyBlame();
    }
}
