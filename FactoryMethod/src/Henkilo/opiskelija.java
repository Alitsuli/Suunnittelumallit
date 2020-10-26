package Henkilo;

import Juoma.EnergiaJuoma;
import Juoma.Juoma;
import factorymethod.AterioivaOtus;

public class opiskelija extends AterioivaOtus {

	@Override
    public Juoma createJuoma(){
        return new EnergiaJuoma();
    };
}
