package less7.model;

public class ComplexImpl implements Complex {

    private final double real;
    private final double img;

    public ComplexImpl(double real, double img) {
        this.real = real;
        this.img = img;
    }

    @Override
    public double getReal() {
        return real;
    }

    @Override
    public double getImg() {
       return img;
    }

}
