package lamda.implimentclass;

import lamda.inter.Multiplication;

public class MultiplicationImpli implements Multiplication {
    @Override
    public int mul(int a, int b, int c) {
        int d=a*b*c;
        return d;
    }
}
