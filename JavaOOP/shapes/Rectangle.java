package shapes;

public class Rectangle extends Shape{
    private int width;
    private int height;

    public Rectangle(int width, int height) {
        this.width = width;
        this.height = height;
    }

    public Rectangle( int width, int height,char color) {
        super(color);
        this.width = width;
        this.height = height;
    }

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

    @Override
    public String toString() {
        StringBuilder s=new StringBuilder("");
        for(int i=0;i<this.getHeight();i++){
            for(int j=0;j<this.getWidth();j++){
                s.append((char)this.getColor());
                s.append("  ");
            }
            s.append("%n");
        }

        return s.toString();
    }

    @Override
    public void print() {
        System.out.printf(this.toString());
    }
}
