package frc.robot.util;

class Vector {
    public double x;
    public double y;
    public double z;
    
    public Vector() {
        this(0, 0, 0);
    }
    
    public Vector(double x, double y) {
        this(x, y, 0);
    }

    public Vector(double x, double y, double z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public void add(Vector B)
    {
        x+=B.x;
        y+=B.y;
        z+=B.z;
    }

    public void subtract(Vector B)
    {
        x-=B.x;
        y-=B.y;
        z-=B.z;
    }
    
    public void scale(double scalar) {
        x*=scalar;
        y*=scalar;
        z*=scalar;
    }
    
    public void reverse() {
        scale(-1);
    }

    public static Vector addVectors(Vector A, Vector B)
    {
        return new Vector(A.x+B.x, A.y+B.y, A.z+B.z);
    }

    public static Vector subtractVectors(Vector A, Vector B)
    {
        return new Vector(A.x-B.x, A.y-B.y, A.z-B.z);
    }

    public static Vector scaleVector(Vector vector, double scalar) {
        return new Vector(vector.x * scalar, vector.y * scalar, vector.z * scalar);
    }

    public static Vector reverseVector(Vector vector) {
        return scaleVector(vector, -1);
    }
}