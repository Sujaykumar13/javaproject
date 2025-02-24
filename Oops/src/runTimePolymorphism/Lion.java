package runTimePolymorphism;

public class Lion extends Animal {
    public void noise()
    {
        System.out.println("Lion makes roar");
    }

    @Override
    public void animalType() {
        System.out.println("Lion is Carnivorous");
    }
}
