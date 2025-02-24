package lamda.implimentclass;

import lamda.inter.Modulos;

public class ModulosImpli implements Modulos {
    @Override
    public float modulos(int a, int b) {
        float c=a%b;
        return c;
    }
}
