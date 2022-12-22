package oop.fikt.vezbi09;
public class Vraboten{
    private String ime;
    private String prezime;
    private String plata;
    public void SetIme(String ime){
        this.ime=ime;
    }
    public void SetPrezime(String prezime){
        this.prezime=prezime;
    }
    public void SetPlata(String plata){
        this.plata=plata;
    }
    public String getIme(){
        return ime;
    }
    public String getPrezime(){
        return prezime;
    }
    public String getPlata(){
        return plata;
    }
}