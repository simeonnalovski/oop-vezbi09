package oop.fikt.vezbi09;

import java.util.ArrayList;
import java.util.List;

public class Main2 {
    public static void main(String[] args){
        List<Vraboten> v= new ArrayList<Vraboten>();
        Vraboten Stefan=new Vraboten();
        Stefan.SetIme("Stefan");
        Stefan.SetPrezime("Stefanovski");
        Stefan.SetPlata("10000");
        v.add(Stefan);
        Vraboten Aleksandar=new Vraboten();
        Aleksandar.SetIme("Aleksandar");
        Aleksandar.SetPrezime("Ristevski");
        Aleksandar.SetPlata("15000");
        XML2 xml2=new XML2();
        xml2.CreateXMLfile("vraboteni.xml",v);
    }
}
