package Henkilo;

import Juoma.Juoma;
import Juoma.Kahvi;
import factorymethod.AterioivaOtus;

public class Opettaja2 extends AterioivaOtus {

	@Override
    public Juoma createJuoma(){
        return new Kahvi();
    };

}
