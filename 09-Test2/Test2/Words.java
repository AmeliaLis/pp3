public class Words {
    private String[] words;

    Words(String[] words){
        this.words = words;
    }

    public boolean m() {
        for (String word1 : this.words) {
            int i = 0;
            for (String word2 : this.words) {
                if (word1.equals(word2)) {
                    i+=1;
                }
            }
            if (i == 2) {
                return true;
            }
        }

        return false;
    }

    public static void main(String[] args) {
        Words w = new Words(new String[] {"mouse","computer","mouse","printer"});
        Words w1 = new Words(new String[] {"university","semester","student"});
        System.out.println(w1.m());
        System.out.println(w.m());
    }
}
