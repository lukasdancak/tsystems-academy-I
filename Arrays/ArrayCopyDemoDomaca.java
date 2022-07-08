public class ArrayCopyDemoDomaca {
    public static void main(String[] args) {
        int[] copyFrom = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 133, 14};
        int[] copyTo = new int[7];
        int[] copyFrom2 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 133, 14};
        int[] copyTo2 = new int[7];

        System.arraycopy(copyFrom, 2, copyTo, 0, 7);
        for (int i : copyTo) {
            System.out.print(i + ",");
        }
        System.out.println();

        arraycopy(copyFrom2, 2, copyTo2, 0, 7);
        for (int i : copyTo) {
            System.out.print(i + ",");
        }
        System.out.println();
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