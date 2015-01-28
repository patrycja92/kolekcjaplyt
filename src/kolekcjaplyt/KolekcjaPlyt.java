/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kolekcjaplyt;

/**
 *
 * @author Patrycja
 */
public class KolekcjaPlyt {
<<<<<<< HEAD

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Kolekcja kol =  new Kolekcja();
        Muzyka myz = new Muzyka();
        myz.setNazwaplyty("test");
        System.out.println(myz.getNazwaplyty());
=======
    
    public static void main(String[] args) 
    {
        Zdjecia zdjecia = new Zdjecia();
        System.out.print(zdjecia.ustawWartosciZdjecia(1994, "Rodzinne", "NadMorzem", "jpeg"));
        Filmy film = new Filmy();
        System.out.print(film.ustawWartosci(1997, 1200000,"horror" ,"Zejscie" , "Robert de nito"));
    
>>>>>>> 912baf8f044182d46a9a4c9662d93f401acbcafe
    }
        
    
}
