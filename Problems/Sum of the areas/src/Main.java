class Sum {
    public static int sumOfAreas(Shape[] array) {
        int areaSum = 0;

        for (Shape shape : array) {
            switch (shape.getClass().getName()) {
                case "Square":
                    Square square = (Square) shape;
                    areaSum += square.getSide() * square.getSide();
                    break;
                case "Rectangle":
                    Rectangle rectangle = (Rectangle) shape;
                    areaSum += rectangle.getWidth() * rectangle.getHeight();
                    break;
            }
        }

        return areaSum;
        // write your code here
    }
}

//Don't change the code below
class Shape {
}

class Square extends Shape {
    private int side;

    public int getSide() {
        return side;
    }

    public void setSide(int side) {
        this.side = side;
    }
}

class Rectangle extends Shape {
    private int width;
    private int height;

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }
}