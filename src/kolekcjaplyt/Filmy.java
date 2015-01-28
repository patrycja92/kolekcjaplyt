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
public class Filmy extends Kolekcja{
    /*
    Pola jakie zawiera klasa Filmy
    */
    private String typfilmu;
    private String nazwafilmu;
    private String rezyser;
    private int naklad;
    private int rok;

    /*
    Settery i gettery podanych pól
    */
    public String getTypfilmu() {
        return typfilmu;
    }

    public String getNazwafilmu() {
        return nazwafilmu;
    }

    public String getRezyser() {
        return rezyser;
    }

    public int getNaklad() {
        return naklad;
    }

    public int getRok() {
        return rok;
    }

    public void setTypfilmu(String typfilmu) {
        this.typfilmu = typfilmu;
    }

    public void setNazwafilmu(String nazwafilmu) {
        this.nazwafilmu = nazwafilmu;
    }

    public void setRezyser(String rezyser) {
        this.rezyser = rezyser;
    }

    public void setNaklad(int naklad) {
        this.naklad = naklad;
    }

    public void setRok(int rok) {
        this.rok = rok;
    }
    
    /*
    Metoda ustawiająca wartości dotyczące danego filmu. 
    Zwraca wartości ustawione przez użytkownika.
    */
    public String ustawWartosci(int rok , int naklad, String typfilmu, String nazwafilmu , String rezyser)
    {
        return rok + " " +naklad + " " + typfilmu + " " + nazwafilmu + " " + rezyser;
    }
    
    
}
