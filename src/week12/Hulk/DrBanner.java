package week12.Hulk;

public class DrBanner implements State{
    BruceBanner banner;
    public DrBanner(BruceBanner banner){
        this.banner=banner;
    }
    public void makeAngry(){
        banner.setState(new TheHulk(this.banner));
    }
    public void calmDown(){
        System.out.println("already calm");
    }
    public void useCar(Car car){
        car.drive(false);
    }
    public void fight(){
        System.out.println("this won't end well");
    }
}
