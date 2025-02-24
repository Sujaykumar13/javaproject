package lamda.implimentclass;

import lamda.inter.Sumation;

public class SumationImpli implements Sumation {
    @Override
    public int sum(int a, int b, int c) {
        return a+b+c;
    }
}
