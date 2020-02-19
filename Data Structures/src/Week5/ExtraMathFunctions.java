package Week5;

public class ExtraMathFunctions {

    public static void main(String[] args) {
        ExtraMathFunctions percent1 = new ExtraMathFunctions();
        System.out.println(percentOf(20,115));
        ExtraMathFunctions percent2 = new ExtraMathFunctions();
        System.out.println(findPercent(100,200));
    }

    public static double percentOf(int percentage, double calculatePercent){
        return (percentage * .01) * calculatePercent;
    }

    public static double findPercent(double num1, double num2){
        return (num1 / num2) * 100;
    }
}
