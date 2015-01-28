package kolekcjaplyt;

/**
 * Klasa służy do reprezentowania Gry
 */
public class Gry extends Kolekcja{
    
    private String nazwaGry;
    private String gatunekGry;
    private String dataWydaniaGry;

    /**
     *  Metoda pobierająca NazwaGry
     * @return nazwaGry
     */
    public String getNazwaGry() {
        return nazwaGry;
    }

    /**
     *  Metoda ustawiająca NazwaGry
     * @param nazwaGry
     */
    public void setNazwaGry(String nazwaGry) {
        this.nazwaGry = nazwaGry;
    }

    /**
     *  Metoda pobierająca GatunekGry
     * @return  gatunekGry
     */
    public String getGatunekGry() {
        return gatunekGry;
    }

    /**
     *  Metoda ustawiająca GatunekGry
     * @param gatunekGry
     */
    public void setGatunekGry(String gatunekGry) {
        this.gatunekGry = gatunekGry;
    }

    /**
     *  Metoda pobierająca DataWydaniaGry
     * @return dataWydaniaGry
     */
    public String getDataWydaniaGry() {
        return dataWydaniaGry;
    }

    /**
     *  Metoda ustawiająca DataWydaniaGry
     * @param dataWydaniaGry
     */
    public void setDataWydaniaGry(String dataWydaniaGry) {
        this.dataWydaniaGry = dataWydaniaGry;
    }
}
