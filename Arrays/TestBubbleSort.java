import java.util.Arrays;

public class TestBubbleSort {

    public static void main(String[] args) {
        int[] nahodna = new RetrunRandomIntArray(10000).getRandomArray();
        int[] nahodna2 = Arrays.copyOf(nahodna,nahodna.length );

      //  System.out.println("array nahodna : "+Arrays.toString(nahodna));
       // System.out.println("array nahodna2: "+Arrays.toString(nahodna2));


        // test mojho bubble sort


        ProcessTimer test1 = new ProcessTimer("test mojho bubble sort");
        test1.startTimer();

        ArrayCopyDemoDomaca.bubbleSort(nahodna);

        test1.stopTimerPrintResult();
       // System.out.println(Arrays.toString(nahodna));


        //test javovskeho sort

        ProcessTimer test2 = new ProcessTimer("test java sort funkcie");
        test2.startTimer();
        Arrays.sort(nahodna2);
        test2.stopTimerPrintResult();
        //System.out.println(Arrays.toString(nahodna2));



    }
}
