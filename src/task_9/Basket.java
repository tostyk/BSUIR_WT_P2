package task_9;

import java.util.ArrayList;

public class Basket {
    private ArrayList<Ball> ballList = new ArrayList<>();
    public void addBall(Ball ball) {
        ballList.add(ball);
    }
    public int getBlueNum() {
        int num = 0;
        for (Ball ball : ballList) {
            if (ball.getColor() == Color.Blue) {
                num++;
            }
        }
        return num;
    }
    public double getBallsWeight() {
        double weight = 0;
        for (Ball ball : ballList) {
            weight += ball.getWeight();
        }
        return weight;
    }
    public void printBallsInfo() {
        for (Ball ball : ballList) {
            System.out.format("Weight: %7.2f Color: %s\n", ball.getWeight(), ball.getColor().toString());
        }
    }
}
