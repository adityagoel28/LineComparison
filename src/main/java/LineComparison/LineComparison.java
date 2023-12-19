package LineComparison;

import java.util.Scanner;

public class LineComparison {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input for first line
        System.out.println("Enter x1, y1, x2, y2 for the first line:");
        double x1 = sc.nextDouble();
        double y1 = sc.nextDouble();
        double x2 = sc.nextDouble();
        double y2 = sc.nextDouble();

        // Calculating distance for the first line
        double distance1 = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
        System.out.printf("Distance of the first line: %.2f\n", distance1);

        // Input for second line
        System.out.println("Enter x1, y1, x2, y2 for the second line:");
        double x3 = sc.nextDouble();
        double y3 = sc.nextDouble();
        double x4 = sc.nextDouble();
        double y4 = sc.nextDouble();

        // Calculating distance for the second line
        double distance2 = Math.sqrt(Math.pow(x4 - x3, 2) + Math.pow(y4 - y3, 2));
        System.out.printf("Distance of the second line: %.2f\n", distance2);

        // Comparing the two distances using equals method
        boolean eq = Double.valueOf(distance1).equals(Double.valueOf(distance2));

        if(eq) {
            System.out.println("Both lines are equal");
        } else {
            System.out.println("Both lines are not equal");
        }
    }
}

