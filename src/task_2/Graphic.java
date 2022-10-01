package task_2;

public class Graphic {
    private double top = 5;
    private double bottom = -3;
    private double rightTop = 4;
    private double rightBottom = 6;
    private double leftTop = -4;
    private double leftBottom = -6;
    private boolean isPointIn = false;
    public boolean CheckPoint(double x, double y) {
        if (y > 0) {
            isPointIn = (y <= top && x <= rightTop && x>=leftTop);
        } else {
            isPointIn = (y >= bottom && x <= rightBottom && x>=leftBottom);
        }
        return isPointIn;
    }
}
