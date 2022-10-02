package task_1;

public class Equation {
    public static double solve(double x, double y) {
        return (1 + Math.sin(x + y)*Math.sin(x + y)) / (2 + Math.abs(x - 2 * x / (1 + x * x * y * y))) + x;
    }
}
