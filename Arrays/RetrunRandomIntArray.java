import java.util.Random;

public class RetrunRandomIntArray {
    private int[] randomArray;

    public RetrunRandomIntArray(int border) {
        randomArray= new int[border];
        Random r = new Random();
        for (int i=0;i<border;i++){
            randomArray[i]=r.nextInt(border);

        }
    }

    public int[] getRandomArray() {
        return randomArray;
    }
}
