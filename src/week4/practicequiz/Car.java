package week4.practicequiz;

public class Car{
    private int maxSpeed;
    private int year;

    public Car(int maxSpeed, int year){
        this.maxSpeed = maxSpeed;
        this.year = year;
    }

    public int getYear(){
        return this.year;
    }

    public int currentMaxSpeed(int currentYear){
        int year = this.getYear();
        int dif = currentYear - year;
        return this.maxSpeed - dif;
    }

    public static void main(String[] args){
        Car car1 = new Car(100, 2010);
        Car car2 = new Car(90, 2020);
        int speed = car2.currentMaxSpeed(2023);
        System.out.println(speed);
    }
}