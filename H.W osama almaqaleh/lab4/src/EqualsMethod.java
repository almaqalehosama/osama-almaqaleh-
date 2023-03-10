public class EqualsMethod {
    private double re, im;

    public EqualsMethod(double re, double im) {
        this.re = re;
        this.im = im;
    }
    @Override
    public boolean equals(Object o) {

        if (o == this) {
            return true;
        }

        if (!(o instanceof EqualsMethod)) {
            return false;
        }

        EqualsMethod c = (EqualsMethod) o;

        return Double.compare(re, c.re) == 0
                && Double.compare(im, c.im) == 0;
        }
    }


