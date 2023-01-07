public class Isogram {
    public static boolean isogram(String quote){
        char[] charQuote = quote.toCharArray();
        for (char letter1 : charQuote) {
            int counterOfLetters=0;
            for (char letter2 : charQuote){
                if (letter1 == letter2) {
                    counterOfLetters+=1;
                }
            }
            if (counterOfLetters == 2) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(isogram("red sun"));
        System.out.println(isogram("blue water"));
        System.out.println(isogram("BLUE water"));
        System.out.println(isogram("my blue water"));
    }
}
