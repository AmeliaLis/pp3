import java.util.Arrays;

public class Competition {
    private int[] oceny;
    public int wynik;

    Competition(int[] oceny)  {
        this.oceny = oceny;
    }

    public int m() {
        Arrays.sort(this.oceny);

        for(int ocena : this.oceny) {
            wynik += ocena;
        }
        return wynik - this.oceny[0] - this.oceny[this.oceny.length-1];
    }

    public static void main(String[] args) {
        Competition c = new Competition(new int[]{1,3,2,4});

        System.out.println(c.m());
    }
}
