package week14.student;

public class Calm extends MentalState{
    public Calm(Student brain){
        super(brain);
    }
    public void study(){
        System.out.println("remaining calm and not panicking");
    }
    public void getCloserToExam(){
        this.brain.setState(new Panic(this.brain));
    }
    public void expressFeelings(){
        System.out.println("I am a leaf on the wind");
    }
}
