package factorymethod;

import Henkilo.Opettaja;
import Henkilo.Opettaja2;
import Henkilo.opiskelija;

public class Main {

    public static void main(String[] args) {
        AterioivaOtus opettaja = new Opettaja();
        opettaja.aterioi();
        
        AterioivaOtus opettaja2 = new Opettaja2();
        opettaja2.aterioi();
        
        AterioivaOtus opiskelija = new opiskelija();
        opiskelija.aterioi();

    }
}
