package shapes;

public class Triangle extends Shape{
    private int height;

    public Triangle(int height) {
        this.height = height;
    }

    public Triangle(int height, char color) {
        super(color);
        this.height = height;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    @Override
    public String toString() {
        String s ="";
        for(int i=0;i<this.getHeight();i++){
            for(int j=0;j<i;j++){
                s+=(char)this.getColor();
                s+="  ";
            }
            s+="%n";
        }


        return s;
    }

    @Override
    public void print() {
        System.out.printf(this.toString());
    }
}
