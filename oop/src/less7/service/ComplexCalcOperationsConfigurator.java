package less7.service;

import java.util.HashMap;
import java.util.Map;

import less7.model.Complex;

public class ComplexCalcOperationsConfigurator {

    public static Map<String, Operation<Complex>> complexCalcOperationsConfig = new HashMap<>();
    static {
        complexCalcOperationsConfig.put("+", new ComplexAddition());
        complexCalcOperationsConfig.put("-", new ComplexSubtraction());
    }

    public static Map<String, Operation<Complex>> getComplexOperationsConfig() {
        return complexCalcOperationsConfig;
    }

    public static String getListOfAvailableOperations() {
        return  "'+' - сложение комплексных чисел\n" +
                "'-' - вычитание комлексных чисел\n";
    }

}
