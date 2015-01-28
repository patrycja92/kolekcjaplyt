package kolekcjaplyt;

/**
 * Klasa służy do reprezentowania Muzyki
 */
public class Muzyka extends Kolekcja{
    
    private String wykonawca;
    private String nazwaAlbumu;
    private String nazwaPiosenki;
    private int pozycjaWAlbumie;
    private int gatunekMuzyki;

    /**
     *  Metoda poebirająca Wykonawca
     * @return wykonawca
     */
    public String getWykonawca() {
        return wykonawca;
    }

    /**
     *  Metoda pobierająca NazwaAlbumu
     * @return nazwaAlbumu
     */
    public String getNazwaAlbumu() {
        return nazwaAlbumu;
    }

    /**
     *  Metoda pobierająca NazwaPiosenki
     * @return nazwaPiosenki
     */
    public String getNazwaPiosenki() {
        return nazwaPiosenki;
    }

    /**
     *  Metoda pobierająca PozycjaWAlbumie
     * @return pozycjaWAlbumie
     */
    public int getPozycjaWAlbumie() {
        return pozycjaWAlbumie;
    }

    /**
     *  Metoda pobierająca GatunekMuzyki
     * @return gatunekMuzyki
     */
    public int getGatunekMuzyki() {
        return gatunekMuzyki;
    }

    /**
     *  Metoda ustawiająca Wykonawca
     * @param wykonawca
     */
    public void setWykonawca(String wykonawca) {
        this.wykonawca = wykonawca;
    }

    /**
     *  Metoda ustawiająca NazwaAlbumu
     * @param nazwaAlbumu
     */
    public void setNazwaAlbumu(String nazwaAlbumu) {
        this.nazwaAlbumu = nazwaAlbumu;
    }

    /**
     *  Metoda ustawiająca NazwaPiosenki
     * @param nazwaPiosenki
     */
    public void setNazwaPiosenki(String nazwaPiosenki) {
        this.nazwaPiosenki = nazwaPiosenki;
    }

    /**
     *  Metoda ustawiajaca PozycjaWAlbumie
     * @param pozycjaWAlbumie
     */
    public void setPozycjaWAlbumie(int pozycjaWAlbumie) {
        this.pozycjaWAlbumie = pozycjaWAlbumie;
    }

    /**
     *  Metoda ustawiająca GatunekMuzyki
     * @param gatunekMuzyki
     */
    public void setGatunekMuzyki(int gatunekMuzyki) {
        this.gatunekMuzyki = gatunekMuzyki;
    }

    /**
     *  Metoda ustawiająca wykonawca, nazwaAlbumu, nazwaPiosenki, pozycja WAlbumie, gatunekMuzyki
     * @param wykonwaca
     * @param nazwaAlbumu
     * @param nazwaPiosenki
     * @param pozycjaWAlbumie
     * @param gatunekMuzyki
     */
    public void setAll(String wykonwaca, String nazwaAlbumu, String nazwaPiosenki, int pozycjaWAlbumie, int gatunekMuzyki){
        this.gatunekMuzyki = gatunekMuzyki;
        this.nazwaAlbumu = nazwaAlbumu;
        this.nazwaPiosenki = nazwaPiosenki;
        this.pozycjaWAlbumie = pozycjaWAlbumie;
        this.wykonawca = wykonwaca;
    }
}
