package week12.student;

public class Panic extends MentalState{
    public Panic(Student brain){
        super(brain);
    }
    public void study(){
        this.brain.setState(new Calm(this.brain));
    }
    public void getCloserToExam(){
        System.out.println("all of my drinks are shaken and not stirred");
    }
    public void expressFeelings(){
        System.out.println("I AM FREAKING OUT MAN");
    }
}
