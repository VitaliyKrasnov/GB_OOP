package less7.service;

import less7.model.Complex;
import less7.model.ComplexImpl;

public class ComplexCalc implements Calc<Complex>{

    @Override
    public Complex addOperation(Complex op1, Complex op2) {
        double realResult = op1.getReal() + op2.getReal();
        double imgResult = op1.getImg() + op2.getImg();
        return new ComplexImpl(realResult, imgResult);
    }

    @Override
    public Complex subOperation(Complex op1, Complex op2) {
        double realResult = op1.getReal() - op2.getReal();
        double imgResult = op1.getImg() - op2.getImg();
        return new ComplexImpl(realResult, imgResult);
    }


}
