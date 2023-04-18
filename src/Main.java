import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println(Alarmstufe (anzahlKunden("grün"), 65));

    }
    public static String Alarmstufe (int maxKunden, int kundenLaden){
        String str;
        if ( maxKunden > kundenLaden){
            str = "Ja";
        } else if (maxKunden < kundenLaden) {
            str = "Nein";
        }else {
            str = "Passt";
        }
        return str;
    }

    public static int anzahlKunden (String farbe){

        switch (farbe){
//            case "rot":
//               return 0;
            case "gelb":
                return 30;
            case "grün":
                return 60;
            default:
                return 0;
        }
    }
}