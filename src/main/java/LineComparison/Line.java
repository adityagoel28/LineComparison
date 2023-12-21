package LineComparison;

public class Line {
    private Point start; // start point
    private Point end; // end point

    public Line(Point start, Point end) { // constructor
        this.start = start;
        this.end = end;
    }

    public double length() {
        return Math.sqrt(Math.pow(end.getX() - start.getX(), 2) + Math.pow(end.getY() - start.getY(), 2)); // calculating length
    }

    @Override
    public boolean equals(Object obj) {
        Line line2 = (Line) obj;
        System.out.printf("Length of 1st line: %.2f\n ", this.length());
        System.out.printf("Length of 2nd line: %.2f\n ", line2.length());
        return Double.compare(line2.length(), this.length()) == 0;
    }

    public int compareTo(Line otherLine) {
        return Double.compare(this.length(), otherLine.length());
    }
}
