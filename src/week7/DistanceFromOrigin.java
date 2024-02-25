package week7;

public class DistanceFromOrigin extends Comparator<GameItem> {

    private double distance(GameItem item){
        return Math.sqrt(Math.pow(item.getX(), 2.0) + Math.pow(item.getY(), 2.0));
    }

    @Override
    public boolean compare(GameItem a, GameItem b) {
        return distance(a) < distance(b);
    }
}
