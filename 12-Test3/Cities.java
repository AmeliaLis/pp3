/*public class Cities {
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
*/
import java.util.ArrayList;

public class Cities {
    String[] cities;

    public Cities(String[] cities) {
        this.cities = cities;
    }

    Cities filter(char c) {
        ArrayList<String> cityList = new ArrayList<String>();
        for (String city : cities){
            if (c == city.charAt(0)){
                cityList.add(city);
            }
        }

        return new Cities(cityList.toArray(new String[cityList.size()]));
    }

    String cities (){
        String cityString= "";
        for (String city : cities){
            cityString += city;
        }
        return cityString;
    }

    public static void main(String[] args) {
        String[] myCities = {"Warszawa","Sopot","Kielce","Szczecin"};
        Cities cities = new Cities(myCities);
        System.out.println(cities.filter('S').cities());
    }
}