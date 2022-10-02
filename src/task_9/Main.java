package task_9;

public class Main {
    public static void main(String[] args) {
        Basket basket = new Basket();
        for (int i = 0; i < 10; i++) {
            basket.addBall(new Ball());
        }
        basket.printBallsInfo();
        System.out.println("Number of blue balls: " + basket.getBlueNum());
        System.out.format("Weight of balls:  %7.2f\n", basket.getBallsWeight());
    }
}
