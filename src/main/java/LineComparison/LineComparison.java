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
    }
}

