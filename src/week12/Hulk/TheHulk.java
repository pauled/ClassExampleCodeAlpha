package week12.Hulk;

public class TheHulk implements State {
    private BruceBanner banner;
    public TheHulk(BruceBanner banner){
        this.banner=banner;
    }
    public void makeAngry(){
        System.out.println("already angry");
    }
    public void calmDown(){
        banner.setState(new DrBanner(banner));
    }
    public void useCar(Car car){
        car.smash();
    }
    public void fight(){
        System.out.println("Hulk Smash!");
    }
}
