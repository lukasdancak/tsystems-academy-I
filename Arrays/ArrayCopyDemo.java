public class ArrayCopyDemo {
    public static void main(String[] args) {
        char[] copyFromIII = { 'd', 'e', 'c', 'a', 'f', 'f', 'e',
			    'i', 'n', 'a', 't', 'e', 'd' };
        char[] copyTo = new char[7];

        System.arraycopy(copyFromIII, 2, copyTo, 0, 7);
        System.out.println(new String(copyTo));
    }
}
