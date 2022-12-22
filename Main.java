package oop.fikt.vezbi09;
public class Main {
    public static void main(String[] args){
        Vraboten vraboten=new Vraboten();
        vraboten.SetIme("Stefan");
        vraboten.SetPrezime("Stefanovski");
        vraboten.SetPlata("10000");
        XML xml=new XML();
        xml.createXMLFile("vraboten.xml", vraboten);
    }
}
