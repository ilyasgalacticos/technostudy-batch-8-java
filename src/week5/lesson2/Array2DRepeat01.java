package week5.lesson2;

public class Array2DRepeat01 {
    public static void main(String[] args) {
        String [][] country = {
                {"Abay str.", "Satpayev str.", "Raimbek str.", "Al Farabi str."}, // Almaty
                {"Bernard Buffet", "Trocadero", "Charles De Gaulle"}, // Paris
                {"Wall Street", "Empire State Building str."} // New York
        };

        for(int i = 0; i < country.length; i++){
            for(int j = 0; j < country[i].length; j++){
                System.out.print(country[i][j] + " | ");
            }
            System.out.println();
        }
    }
}
