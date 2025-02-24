package lamda.implimentclass;

import lamda.inter.Division;

public class DivisonImpli implements Division {
    @Override
    public float divison(int a, int b) {

        float c=a/b;
        return c;
    }
}
