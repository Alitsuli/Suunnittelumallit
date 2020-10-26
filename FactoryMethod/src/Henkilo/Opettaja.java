package Henkilo;

import Juoma.Juoma;
import Juoma.Vesi;
import factorymethod.AterioivaOtus;

public class Opettaja extends AterioivaOtus {


    public Juoma createJuoma(){
        return new Vesi();
    };
    
}
