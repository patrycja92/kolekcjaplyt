/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package kolekcjaplyt;

/**
 *
 * @author Spooky
 */
public class Muzyka extends Kolekcja{
    
    private String wykonawca;
    private String nazwaAlbumu;
    private String nazwaPiosenki;
    private int pozycjaWAlbumie;
    private int gatunekMuzyki;

    public String getWykonawca() {
        return wykonawca;
    }

    public String getNazwaAlbumu() {
        return nazwaAlbumu;
    }

    public String getNazwaPiosenki() {
        return nazwaPiosenki;
    }

    public int getPozycjaWAlbumie() {
        return pozycjaWAlbumie;
    }

    public int getGatunekMuzyki() {
        return gatunekMuzyki;
    }

    public void setWykonawca(String wykonawca) {
        this.wykonawca = wykonawca;
    }

    public void setNazwaAlbumu(String nazwaAlbumu) {
        this.nazwaAlbumu = nazwaAlbumu;
    }

    public void setNazwaPiosenki(String nazwaPiosenki) {
        this.nazwaPiosenki = nazwaPiosenki;
    }

    public void setPozycjaWAlbumie(int pozycjaWAlbumie) {
        this.pozycjaWAlbumie = pozycjaWAlbumie;
    }

    public void setGatunekMuzyki(int gatunekMuzyki) {
        this.gatunekMuzyki = gatunekMuzyki;
    }

    public void setAll(String wykonwaca, String nazwaAlbumu, String nazwaPiosenki, int pozycjaWAlbumie, int gatunekMuzyki){
        this.gatunekMuzyki = gatunekMuzyki;
        this.nazwaAlbumu = nazwaAlbumu;
        this.nazwaPiosenki = nazwaPiosenki;
        this.pozycjaWAlbumie = pozycjaWAlbumie;
        this.wykonawca = wykonwaca;
    }
}
