package task_2;

public class Main {
    public static void main(String[] args) {
        Graphic graphic = new Graphic();
        System.out.println(graphic.checkPoint(5,5)); // false
        System.out.println(graphic.checkPoint(3,3)); // true
        System.out.println(graphic.checkPoint(-5,0)); // true
    }
}