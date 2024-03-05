public class Point2D {
    private float x;
    private float y;

    public Point2D(float x, float y) {
        this.x = x;
        this.y = y;
    }

    public float getX() {
        return x;
    }

    public void setX(float x) {
        this.x = x;
    }

    public float getY() {
        return y;
    }

    public void setY(float y) {
        this.y = y;
    }

    public Point2D() {

    }

    public void setXY(float x, float y) {
        this.x = x;
        this.y = y;
    }

    public float[] getXY() {
        float[] Array = {x, y};
        return Array;
    }

    @Override
    public String toString() {
        return "Point2D{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }
}

    class Point3D extends Point2D {
        private float z;

        public Point3D(float x, float y, float z) {
            super(x, y);
            this.z = z;
        }

        public Point3D() {

        }

        public float getZ() {
            return z;
        }

        public void setZ(float z) {
            this.z = z;
        }

        public void setXYZ(float x, float y, float z) {
            setXY(x, y);
            this.z = z;
        }

        public float[] getXYZ() {
            float[] Array = {getX(), getY(), z};
            return Array;
        }

        @Override
        public String toString() {
            return "Point3D{" +
                    "x=" + getX() +
                    ", y=" + getY() +
                    ", z=" + z +
                    '}';
        }
    }
 class Test {
    public static void main(String[] args) {

        Point2D point2D = new Point2D(3.5f, 4.2f);
        System.out.println( point2D.toString());
        point2D.setX(2.1f);
        point2D.setY(5.8f);
        System.out.println( point2D.toString());


        Point3D point3D = new Point3D(1.2f, 2.3f, 3.4f);
        System.out.println( point3D.toString());
        point3D.setXYZ(4.5f, 5.6f, 6.7f);
        System.out.println(point3D.toString());
        point3D.setZ(7.8f);
        System.out.println(  point3D.toString());
    }
}