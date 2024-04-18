public class Point {

    double x;
    double y;
    boolean selectable;

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }
    public Point()
    {
        
    }

    public Point(double x, double y, boolean selectable) {
        this.x = x;
        this.y = y;
        this.selectable = selectable;
    }

    public double getX() {
        return this.x;
    }

    public double getY() {
        return this.y;
    }

    public void setSelectable(boolean selectable)
    {
        this.selectable = selectable;
    }
    public boolean isSelectable()
    {
        return this.selectable;
    }
}
