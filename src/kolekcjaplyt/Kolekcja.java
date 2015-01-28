package kolekcjaplyt;

/**
 * Klasa służy do reprezentowania Kolekcji
 */
public class Kolekcja {
    
    /**
    * Tworzy obiekt klasy Kolekcja
    */
    private String nazwaplyty;
    private int iloscplyt;
    private String opis;

    /**
     *  Metoda pobierająca Opis
     * @return opis
     */
    public String getOpis() {
        return opis;
    }

    /**
     *  Metoda ustawiająca Opis
     * @param Opis
     */
    public void setOpis(String Opis) {
        this.opis = Opis;
    }

    /**
     *  Metoda pobierajaca Nazwaplyty
     * @return nazwaplyty
     */
    public String getNazwaplyty() {
        return nazwaplyty;
    }

    /**
     *  Metoda ustawiająca Nazwaplyty
     * @param nazwaplyty
     */
    public void setNazwaplyty(String nazwaplyty) {
        this.nazwaplyty = nazwaplyty;
    }

    /**
     *  Metoda pobierająca Iloscplyt
     * @return iloscplyt
     */
    public int getIloscplyt() {
        return iloscplyt;
    }

    /**
     *  Metoda ustawiająca Iloscplyt
     * @param iloscplyt
     */
    public void setIloscplyt(int iloscplyt) {
        this.iloscplyt = iloscplyt;
    }
}
