public class Palindrome {
    public static void main(String[] args) {
//		String palindrome = "jarko";
//		int len = palindrome.length();
//		StringBuilder dest = new StringBuilder(len);
//		for (int i = (len - 1); i >= 0; i--) {
//			dest.append(palindrome.charAt(i));
//		}
//		System.out.println(dest.toString());

        isPalindrome("Kajak a kajak");
        isPalindrome("Toto saS Otot");
        isPalindrome("Miska (nie je)");


    }


//	public static String getReverseStringCaseSensitive(String input){
//		StringBuilder dest= new StringBuilder(input);
//		return dest.reverse().toString();
//	}

    public static void isPalindrome(String input) {
        if (input.equalsIgnoreCase(new StringBuilder(input).reverse().toString())) {
            System.out.printf("Vyraz \"%s\" je PALINDROME %n", input);
        } else {
            System.out.printf("Vyraz \"%s\" nie je PALINDROME %n", input);
        }
    }
}
