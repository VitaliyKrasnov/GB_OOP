package less7.service;

import less7.model.Complex;
import less7.model.ComplexImpl;

public class ComplexCreator {

    public static Complex create(Double real, Double img) {
        return new ComplexImpl(real, img);
    }


}
