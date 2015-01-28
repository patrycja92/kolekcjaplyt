package kolekcjaplyt;

/**
 * Klasa służy do reprezentowania Zdjęć
 */
public class Zdjecia extends Kolekcja {
   
    private String format;
    private String nazwamiejsca;
    private int rok;
    private String typ;
    
    /**
     *  Metoda ustawiająca Format
     * @param format
     */
    public void setFormat(String format) {
        this.format = format;
    }

    /**
     *  Metoda ustawiająca Nazwamiejsca
     * @param nazwamiejsca
     */
    public void setNazwamiejsca(String nazwamiejsca) {
        this.nazwamiejsca = nazwamiejsca;
    }

    /**
     *  Metoda ustawiająca Rok
     * @param rok
     */
    public void setRok(int rok) {
        this.rok = rok;
    }

    /**
     *  Metoda pobierająca Format
     * @return format
     */
    public String getFormat() {
        return format;
    }

    /**
     *  Metoda pobierająca Nazwamiejsca
     * @return nazwamiejsca
     */
    public String getNazwamiejsca() {
        return nazwamiejsca;
    }

    /**
     *  Metoda pobierająca Rok
     * @return rok
     */
    public int getRok() {
        return rok;
    }

    /**
     *  Metoda pobierająca Typ
     * @return typ
     */
    public String getTyp() {
        return typ;
    }

    /**
     *  Metoda ustawiająca Typ
     * @param typ
     */
    public void setTyp(String typ) {
        this.typ = typ;
    }
    
    /**
     *  Metoda ustawiająca rok, typ, nazwamiejsca, format
     * @param rok
     * @param typ
     * @param nazwamiejsca
     * @param format
     * @return
     */
    public String ustawWartosciZdjecia(int rok , String typ , String nazwamiejsca , String format )
    {
        return rok + " " + typ + " "+ nazwamiejsca + " " + format ; 
    } 
}
