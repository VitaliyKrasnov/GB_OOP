package less7.service;

import less7.model.Complex;

public class ComplexAddition implements Operation<Complex> {

    private final ComplexCalc complexCalc = new ComplexCalc();

    @Override
    public Complex eval(Complex op1, Complex op2) {
        return complexCalc.addOperation(op1, op2);
    }

    
}
