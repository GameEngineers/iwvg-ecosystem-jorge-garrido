package es.upm.miw.iwvg.ecosystem.core;

public class Point {

    private int x;

    private int y;

    private int z;

    public Point(int x, int y, int z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public Point(int xyz) {
        this(xyz, xyz, xyz);
    }

    public Point() {
        this(0, 0, 0);
    }

    public double module() {
        return Math.sqrt((double) (this.x * this.x) + (this.y * this.y) + (this.z * this.z));
    }

    public double phase() {
        return Math.atan((double) this.y / this.x);
    }

    public void translateOrigin(Point origin) {
        this.x -= origin.getX();
        this.y -= origin.getY();
        this.z -= origin.getZ();
    }

    public int getZ() {
        return this.z;
    }

    public int getX() {
        return this.x;
    }

    public int getY() {
        return this.y;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public void setZ(int z) {
        this.z = z;
    }

    @Override
    public String toString() {
        return "Point{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }
}