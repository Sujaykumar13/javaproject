package runTimePolymorphism;

public class AnimalRunner {
    public static void main(String[] args)
    {
        Animal lion=new Lion();
        lion.noise();
        lion.animalType();

        Animal animal=new Animal();
        animal.noise();
        animal.animalType();
    }
}
