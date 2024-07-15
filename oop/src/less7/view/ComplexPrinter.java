package less7.view;

import less7.model.Complex;

public class ComplexPrinter {

    public static void printComplex(Complex z) {
        boolean imgSign = z.getImg() < 0;
        System.out.println(z.getReal() + " "  + (imgSign ? "-" : "+") + " " + Math.abs(z.getImg()) + "i");
    }

}
