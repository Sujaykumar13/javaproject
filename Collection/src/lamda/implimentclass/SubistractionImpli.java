package lamda.implimentclass;

import lamda.inter.Substraction;

public class SubistractionImpli implements Substraction {

    @Override
    public int sub(int a, int b) {
        int c= a-b;
        return c;
    }
}
