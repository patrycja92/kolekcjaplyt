/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kolekcjaplyt;

/**
 * Ta klasa dziedziczy po klasie Kolekcja
 * Zawiera settery i gettery podanych pól
 */
public class Zdjecia extends Kolekcja {
    /*
    Pola klasy Zdjęcia
    */
    private String format;
    private String nazwamiejsca;
    private int rok;
    private String typ;
    
    /*
    Settery i gettery klasy Zdjęcia
    */
    public void setFormat(String format) {
        this.format = format;
    }

    public void setNazwamiejsca(String nazwamiejsca) {
        this.nazwamiejsca = nazwamiejsca;
    }

    public void setRok(int rok) {
        this.rok = rok;
    }

    public String getFormat() {
        return format;
    }

    public String getNazwamiejsca() {
        return nazwamiejsca;
    }

    public int getRok() {
        return rok;
    }

    public String getTyp() {
        return typ;
    }

    public void setTyp(String typ) {
        this.typ = typ;
    }
    /*
        Metoda ustawiająca Wartości danego zdjecia.
        Zwraca wartości ustawione przez użytkownika 
    */
   
    public String ustawWartosciZdjecia(int rok , String typ , String nazwamiejsca , String format )
    {
        return rok + " " + typ + " "+ nazwamiejsca + " " + format ; 
    } 
}
