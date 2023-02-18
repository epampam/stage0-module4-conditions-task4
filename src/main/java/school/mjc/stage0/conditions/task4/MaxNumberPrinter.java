package school.mjc.stage0.conditions.task4;

public class MaxNumberPrinter {
    public void printGreatest(int first, int second, int third) {
        int greatest = (first > second && first > third) ? first :
                (second > first && second > third) ? second :
                        third;
        System.out.println(greatest);
    }
    public static void main(String[] args) {
        MaxNumberPrinter maxNumberPrinter = new MaxNumberPrinter();
        maxNumberPrinter.printGreatest(2,2,1);
    }
}

