package LineComparison;

import java.util.Scanner;

public class LineComparison {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input and creation of the first line
        System.out.println("Enter x1, y1, x2, y2 for the first line:");
        Line line1 = new Line(new Point(sc.nextDouble(), sc.nextDouble()), new Point(sc.nextDouble(), sc.nextDouble()));

        // Input and creation of the second line
        System.out.println("Enter x1, y1, x2, y2 for the second line:");
        Line line2 = new Line(new Point(sc.nextDouble(), sc.nextDouble()), new Point(sc.nextDouble(), sc.nextDouble()));

        // Using equals and compareTo methods
        if (line1.equals(line2)) {
            System.out.println("Both lines are of equal length");
        } else if (line1.compareTo(line2) > 0) {
            System.out.println("First line is longer");
        } else {
            System.out.println("Second line is longer");
        }
    }
}
