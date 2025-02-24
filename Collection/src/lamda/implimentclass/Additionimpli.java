package lamda.implimentclass;

import lamda.inter.Addition;

public class Additionimpli implements Addition {
    @Override
    public int sum(int a, int b) {
        int c=a+b;
        return c;
    }
}
