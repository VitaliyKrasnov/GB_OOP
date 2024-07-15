package less7.service;

import less7.model.Complex;

public class ComplexCalc implements Calc<Complex>{

    private Operation<Complex> add = new ComplexAddition();
    private Operation<Complex> sub = new ComplexSubtraction();

    @Override
    public Complex addOperation(Complex op1, Complex op2) {
        return add.eval(op1, op2);
    }

    @Override
    public Complex subOperation(Complex op1, Complex op2) {
        return sub.eval(op1, op2);
    }

    
}
