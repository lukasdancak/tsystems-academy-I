package shapes;

public class Square extends Shape {
    private int size;

    public Square(int size) {
        this.size = size;
    }

    public Square( int size, char color) {
        super(color);
        this.size = size;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    @Override
    public String toString() {
        String s ="";
        for(int i=0;i<this.getSize();i++){
            for(int j=0;j<this.getSize();j++){
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
