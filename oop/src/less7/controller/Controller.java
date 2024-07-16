package less7.controller;

import java.util.Map;

import less7.model.Complex;
import less7.service.ComplexCalcOperationsConfigurator;
import less7.service.ComplexCreator;
import less7.service.Operation;
import less7.view.ComplexPrinter;
import less7.view.EnterDouble;
import less7.view.EnterString;
import less7.view.UserEnter;

public class Controller {

    private static Map<String, Operation<Complex>> complexCalcOperationsConfig = ComplexCalcOperationsConfigurator.getComplexOperationsConfig();
    private final UserEnter<Double> enterDouble = new EnterDouble();
    private final UserEnter<String> enterOperation = new EnterString();

    public void run() throws EndProgramException {
        String operation = enterOperation.enter("Введите операцию:\n" + 
        "'+' - сложение комплексных чисел\n" +
        "'-' - вычитание комлексных чисел\n" + 
        "Для выхода из калькулятора введите 'q'");
        if ("q".equals(operation)) {
            throw new EndProgramException();
        } else if (complexCalcOperationsConfig.get(operation) == null) {
            throw new UnsupportedOperationException("Введена неподдерживаемая операция: " + operation);
        }

        Double real = enterDouble.enter("Введите действительную часть 1го комплексного числа:");
        Double img = enterDouble.enter("Введите мнимую часть 1го комплексного числа:");
        Complex z1 = ComplexCreator.create(real, img);

        real = enterDouble.enter("Введите действительную часть 2го комплексного числа:");
        img = enterDouble.enter("Введите мнимую часть 2го комплексного числа:");
        Complex z2 = ComplexCreator.create(real, img);

        Operation<Complex> complexCalcOperation = complexCalcOperationsConfig.get(operation);
        Complex z = complexCalcOperation.eval(z1, z2);
        System.out.println("Результат операции '" + operation + "':");
        ComplexPrinter.printComplex(z);    
    }


}
