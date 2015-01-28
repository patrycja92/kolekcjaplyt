package kolekcjaplyt;

/**
 * Klasa służy do reprezentowania Kolekcji Płyt
 */
public class KolekcjaPlyt {

    /**
     * Tworzy obiekt klasy KolekcjaPlyt
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Kolekcja kol =  new Kolekcja();
        Muzyka myz = new Muzyka();
        myz.setNazwaplyty("test");
        System.out.println(myz.getNazwaplyty());
        Zdjecia zdjecia = new Zdjecia();
        System.out.println(zdjecia.ustawWartosciZdjecia(1994, "Rodzinne", "NadMorzem", "jpeg"));
        Filmy film = new Filmy();
        System.out.println(film.ustawWartosci(1997, 1200000,"horror" ,"Zejscie" , "Robert de niro"));
        Gry g = new Gry();
    }  
}
