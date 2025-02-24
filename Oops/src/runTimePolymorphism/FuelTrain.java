package runTimePolymorphism;

public class FuelTrain extends Train{
    @Override
    public void engineType() {
        System.out.println("engines are completly update to diesel engine");
    }

    @Override
    public void speed() {
        System.out.println("top speed of  fuel engine train is 100");
    }
}
