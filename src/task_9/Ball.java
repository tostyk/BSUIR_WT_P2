package task_9;

import java.util.Random;

public class Ball {
    private Color color;
    private Random random = new Random();
    private double weight;
    public Ball() {
        Color[] colors = Color.values();
        int colorNum = random.nextInt(0, Color.values().length);
        color = colors[colorNum];
        weight = random.nextDouble(10);
    }
    public Ball(Color color, double weight) {
        this.color = color;
        this.weight = weight;
    }
    public Color getColor() {
        return color;
    }
    public double getWeight() {
        return weight;
    }
}
