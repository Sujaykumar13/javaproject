package runTimePolymorphism;

public class Trainrunner {
    public static void main(String[] args)
    {
        Train train=new Train();
        train.engineType();
        train.speed();
        Train train1=new FuelTrain();
        train1.engineType();
        train1.speed();
        Train train2=new ElectricTrain();
        train2.engineType();
        train2.speed();
        //train2.pollution();
    }
}

