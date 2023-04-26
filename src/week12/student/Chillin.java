package week12.student;

public class Chillin extends MentalState{
    public Chillin(Student brain){
        super(brain);
    }
    public void study(){
        System.out.println("I am such a good student that I still study");
    }
    public void getCloserToExam(){
        System.out.println("I am so good I take exams even when I'm done");
    }
    public void expressFeelings(){
        System.out.println("I am done");
    }
}