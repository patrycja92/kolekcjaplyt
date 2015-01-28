/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kolekcjaplyt;

/**
 * Ta klasa do reprezentowania filmow
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

    /**
     *  Metoda pobierająca Typfilmu
     * @return typfilmu
     */
    public String getTypfilmu() {
        return typfilmu;
    }

    /**
     *  Metoda pobierająca Nazwafilmu
     * @return nazwafilmu
     */
    public String getNazwafilmu() {
        return nazwafilmu;
    }

    /**
     *  Metoda pobierająca Rezyser
     * @return rezyser
     */
    public String getRezyser() {
        return rezyser;
    }

    /**
     *  Metoda pobierająca Naklad
     * @return naklad
     */
    public int getNaklad() {
        return naklad;
    }

    /**
     * Metoda pobierająca Rok
     * @return rok
     */
    public int getRok() {
        return rok;
    }

    /**
     *  Metoda ustawiająca Typfilmu
     * @param typfilmu
     */
    public void setTypfilmu(String typfilmu) {
        this.typfilmu = typfilmu;
    }

    /**
     *  Metoda ustawiająca Nazwafilmu
     * @param nazwafilmu
     */
    public void setNazwafilmu(String nazwafilmu) {
        this.nazwafilmu = nazwafilmu;
    }

    /**
     *  Metoda ustawiająca Rezyser
     * @param rezyser
     */
    public void setRezyser(String rezyser) {
        this.rezyser = rezyser;
    }

    /**
     *  Metoda ustawiająca Naklad
     * @param naklad
     */
    public void setNaklad(int naklad) {
        this.naklad = naklad;
    }

    /**
     *  Metoda ustawiająca Rok
     * @param rok
     */
    public void setRok(int rok) {
        this.rok = rok;
    }
    
    /**
     *  Metoda ustawiająca wartości dotyczące danego filmu. 
     *  Zwraca wartości ustawione przez użytkownika.
     * @param rok
     * @param naklad
     * @param typfilmu
     * @param nazwafilmu
     * @param rezyser
     * @return
     */
    
    public String ustawWartosci(int rok , int naklad, String typfilmu, String nazwafilmu , String rezyser)
    {
        return rok + " " +naklad + " " + typfilmu + " " + nazwafilmu + " " + rezyser;
    }
    
    
}
