package runTimePolymorphism;

public class ElectricTrain extends Train {
    @Override
    public void engineType() {
        System.out.println("engine is copletly updated to electric currently");
    }

    @Override
    public void speed() {
        System.out.println("top speed of electric train is 180");
    }

    public void pollution() {
        System.out.println("In electric engine we get less air pollution");
    }
}
