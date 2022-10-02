package task_3;

public class Function {
    private double start;
    private double finish;
    private double step;
    private int steps = 0;
    private double[][] table = {};
    private void createTable() {
        steps = (int)((finish - start) / step);
        table = new double[2][steps];
        for (int i = 0; i < steps; i++) {
            table[0][i] = start + i*step;
            table[1][i] = Math.tan(start + i*step);
        }
    }
    public void setArgs(double start, double finish, double step) {
        this.start = start;
        this.finish = finish;
        this.step = step;
    }
    public void printTable()  {
        createTable();
        System.out.println("|---------|---------|");
        System.out.println("|    x    |   F(x)  |");
        System.out.println("|---------|---------|");
        for (int i = 0; i < steps; i++) {
            System.out.format("| %7.3f | %7.3f |\n", table[0][i], table[1][i]);
        }
        System.out.println("|---------|---------|");
    }
}
