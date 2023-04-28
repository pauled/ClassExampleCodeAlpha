package week12.blame;

public class CSE116Simplified {
    public CSE116Simplified(){}
    public void taskIssue(){}
    public void quizIssue(){}
    public void interviewIssue(){}
    public void applyBlame(){
        System.out.println("It's always Jesse's fault.");
    }

    public static void main(String[] args) {
        CSE116Simplified course=new CSE116Simplified();
        course.applyBlame();
        course.taskIssue();
        course.applyBlame();
        course.quizIssue();
        course.applyBlame();
    }
}
