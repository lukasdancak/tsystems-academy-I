public class ArrayCopyDemoDomaca {
    public static void main(String[] args) {
        int[] copyFrom = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 133, 14};
        int[] copyTo = new int[7];
        int[] copyFrom2 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 133, 14};
        int[] copyTo2 = new int[7];
        int[] random1 = {1, 12, 7, 4, 21, 6, 55, 8, 4, 10, 33, 12, 133, 14};



 /*       ProcessTimer test1 = new ProcessTimer("Javovsky array copy"); // start merania casu
        test1.startTimer();

        System.arraycopy(copyFrom, 2, copyTo, 0, 7); // systemovy JAVA array copy

        test1.stopTimerPrintResult(); // koniec merania casu

        for (int i : copyTo) {                         // vypis array
            System.out.print(i + ",");
        }
           System.out.println();

        ProcessTimer test2 = new ProcessTimer("Moj array copy"); // start merania casu
        test2.startTimer();


        arraycopy(copyFrom2, 2, copyTo2, 0, 7); // moj array copy
        test2.stopTimerPrintResult(); // koniec merania casu

        for (int i : copyTo) {                  //vypis array
            System.out.print(i + ",");
        }
        System.out.println();
        */

//*************** uloha Bubble Sort *********************

        for (int i : random1) {                  //vypis array
            System.out.print(i + ",");          //
        }                                       //
        System.out.println();                   //

        bubbleSort(random1); // bubble sort funkcia

        for (int i : random1) {                  //vypis array
            System.out.print(i + ",");           //
        }                                        //
        System.out.println();                    //

//*************** uloha Bubble Sort *********************

    }

    // bubble sort
    private static void bubbleSort(int[] array) {
        int limit = array.length;
        int nextLimit = 0;
        boolean noSwap = false;
        while (limit > 1) {
            for (int j = 0; j < limit - 1; j++) {
                if (swapArraysCells(array, j)) {
                    noSwap = false;
                } else {
                    if (noSwap == false) {
                        noSwap = true;
                        nextLimit = j + 1;
                    }
                }
            }
            if (noSwap == true) {
                limit = nextLimit;
                noSwap = false;
            } else {
                limit = limit - 1;
            }


        }

    }

    // metoda vymeni dva susedne bunky ak cislo v lavej je vacsie ako v pravej
    // pri pouziti pozor na null pointer exception, nie je riesena
    private static boolean swapArraysCells(int[] array, int i) {
        if (array[i] > array[i + 1]) {
            int temp = 0;
            temp = array[i];
            array[i] = array[i + 1];
            array[i + 1] = temp;
            return true;
        }
        return false;
    }


    // metoda pre cisla - pre int
    private static boolean arraycopy(int[] source, int srcIndex,
                                     int[] dest, int destIndex, int length) {
        if (srcIndex + length <= source.length
                && destIndex + length <= dest.length) {

            for (int i = 0; i < length; i++) {
                dest[destIndex] = source[srcIndex];
            }
            return true;
        } else {
            System.out.println("Malo miesta");
            return false;
        }
    }

    // metoda pre znaky - pre char


}