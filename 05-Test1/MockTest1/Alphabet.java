public class Alphabet {


    public static boolean isAlphabet(String t) {
        for (int i = 1; i<t.length(); i++){
            System.out.println((int) t.charAt(i));
            if (t.charAt(i-1) > t.charAt(i)) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(Alphabet.isAlphabet("abegsw"));
        System.out.println(Alphabet.isAlphabet("abcmhsw"));
        System.out.println(Alphabet.isAlphabet("zabcd"));
    }
}
