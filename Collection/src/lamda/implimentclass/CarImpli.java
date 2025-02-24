package lamda.implimentclass;

import lamda.inter.Car;

public class CarImpli implements Car {
    @Override
    public int carPrice(int a) {
        int tax=20;
        return a*tax;
    }
}
