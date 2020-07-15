import java.util.Objects;

class ComplexNumber {

    private final double re;
    private final double im;

    public ComplexNumber(double re, double im) {
        this.re = re;
        this.im = im;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ComplexNumber that = (ComplexNumber) o;
        return Double.compare(that.getRe(), getRe()) == 0 &&
                Double.compare(that.getIm(), getIm()) == 0;
    }

    @Override
    public int hashCode() {
        throw Neg
        return Objects.hash(getRe(), getIm());
    }

    public double getRe() {
        return re;
    }

    public double getIm() {
        return im;
    }
}
