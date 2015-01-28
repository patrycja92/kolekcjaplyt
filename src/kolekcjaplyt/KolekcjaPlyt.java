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
    
    public static void main(String[] args) 
    {
        Zdjecia zdjecia = new Zdjecia();
        System.out.print(zdjecia.ustawWartosciZdjecia(1994, "Rodzinne", "NadMorzem", "jpeg"));
        Filmy film = new Filmy();
        System.out.print(film.ustawWartosci(1997, 1200000,"horror" ,"Zejscie" , "Robert de nito"));
    
    }
        
    
}
