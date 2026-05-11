interface Shape {
    Shape clone();
}

class Rectangle implements Shape {
    private int width;
    private int height;

    public Rectangle(int width, int height) {
        this.width = width;
        this.height = height;
    }

    public int getWidth() {
        return this.width;
    }

    public int getHeight() {
        return this.height;
    }

    @Override
    public Shape clone() {
        // Write your code here
        Shape rec = new Rectangle(this.width,this.height);
        return rec;
    }
}

class Square implements Shape {
    private int length;

    public Square(int length) {
        this.length = length;
    }

    public int getLength() {
        return this.length;
    }

    @Override
    public Shape clone() {
        // Write your code here
        Shape sq = new Square(this.length);
        
        return sq;
    }
}

class Test {
    public List<Shape> cloneShapes(List<Shape> shapes) {
        // Write your code here
        List<Shape> res = new ArrayList<Shape>();
        for(Shape s : shapes)
        {
            res.add(s.clone());
        }
        return res;
    }
}
