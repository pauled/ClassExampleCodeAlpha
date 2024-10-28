package week10.labpracticequiz;

public class Main {

    public static void main(String[] args) {
        Crew blue = new Crew("blue", 2);
        Crew green = new Crew("green", 2);
        Crew red = new Crew("red", 2);
        Imposter purple = new Imposter("purple", 3);
        String blueTask = blue.completeTask(blue);
        String greenTask = green.completeTask(green);
        String purpleTask = purple.completeTask(blue);
        String redTask = red.completeTask(red);
        red.checkGame(redTask);
        blueTask = blue.completeTask(blue);
        purpleTask = purple.completeTask(green);
        purple.checkGame(purpleTask);
    }

}
