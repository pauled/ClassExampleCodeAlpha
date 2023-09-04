package week14.hulk;

public class ProfessorHulk implements State{
    private BruceBanner banner;

    public ProfessorHulk(BruceBanner banner){
        this.banner=banner;
    }
    public void makeAngry(){
        System.out.println("no problem");
    }
    public void calmDown(){
        System.out.println("already calm");
    }
    public void useCar(Car car){
        car.drive(true);
    }
    public void fight(){
        System.out.println("smash carefully");
    }
}
