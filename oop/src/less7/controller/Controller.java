package less7.controller;

import less7.model.Complex;
import less7.service.Calc;
import less7.service.ComplexCalc;
import less7.service.ComplexCreator;
import less7.view.ComplexPrinter;
import less7.view.EnterDouble;
import less7.view.EnterString;
import less7.view.UserEnter;

public class Controller {

    private final Calc<Complex> complexCalc = new ComplexCalc();
    private final UserEnter<Double> enterDouble = new EnterDouble();
    private final UserEnter<String> enterOperation = new EnterString();

    public void run() throws EndProgramException{
        String operation = enterOperation.enter("Введите операцию:\n" + 
        "'+' - сложение комплексных чисел\n" +
        "'-' - вычитание комлексных чисел\n" + 
        "Для выхода из калькулятора введите 'q'");
        if ("+".equals(operation)) {
            runComplexAddition();
        } else if ("-".equals(operation)) {
            runComplexSubstraction();
        } else if ("q".equals(operation)) {
            throw new EndProgramException();
        } else {
            throw new UnsupportedOperationException("Введена неподдерживаемая операция: " + operation);
        }
    }

    public void runComplexAddition() {
        Double real = enterDouble.enter("Введите действительную часть 1го комплексного числа:");
        Double img = enterDouble.enter("Введите мнимую часть 1го комплексного числа:");
        Complex z1 = ComplexCreator.create(real, img);

        real = enterDouble.enter("Введите действительную часть 2го комплексного числа:");
        img = enterDouble.enter("Введите мнимую часть 2го комплексного числа:");
        Complex z2 = ComplexCreator.create(real, img);

        Complex z = complexCalc.addOperation(z1, z2);
        System.out.println("Результат сложения комплексных чисел:");
        ComplexPrinter.printComplex(z);
    }

    public void runComplexSubstraction() {
        Double real = enterDouble.enter("Введите действительную часть 1го комплексного числа:");
        Double img = enterDouble.enter("Введите мнимую часть 1го комплексного числа:");
        Complex z1 = ComplexCreator.create(real, img);

        real = enterDouble.enter("Введите действительную часть 2го комплексного числа:");
        img = enterDouble.enter("Введите мнимую часть 2го комплексного числа:");
        Complex z2 = ComplexCreator.create(real, img);

        Complex z = complexCalc.subOperation(z1, z2);
        System.out.println("Результат вычитания комплексных чисел:");
        ComplexPrinter.printComplex(z);
    }


}
