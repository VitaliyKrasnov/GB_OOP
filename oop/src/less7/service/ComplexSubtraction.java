package less7.service;

import less7.model.Complex;
import less7.model.ComplexImpl;

public class ComplexSubtraction implements Operation<Complex> {

    @Override
    public Complex eval(Complex op1, Complex op2) {
        double realResult = op1.getReal() - op2.getReal();
        double imgResult = op1.getImg() - op2.getImg();
        return new ComplexImpl(realResult, imgResult);
    }

    
}
