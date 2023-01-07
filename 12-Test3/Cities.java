public class Cities {
    private String[] array;

    Cities(String[] array){
        this.array=array;
    }

    public String filter(char letter){
        String cities="";
        
        for (String city:array){
            if (city.startsWith(String.valueOf(letter))){
                cities+=city;
            }
        }

        return cities;
    }

    public static void main(String[] args) {
        Cities c1 = new Cities(new String[] {"Warszawa","Sopot","Kielce","Szczecin"});
        System.out.println(c1.filter('S'));
    }
}
