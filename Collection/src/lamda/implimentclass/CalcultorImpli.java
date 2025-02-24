package lamda.implimentclass;

import lamda.inter.Calculator;

public class CalcultorImpli implements Calculator {
    @Override
    public float cal(int a, int b, int c) {
        return a*b/c*b;
    }
}
