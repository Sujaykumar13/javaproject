package exception;

public class Bag {
    int bagWeight;

    public void setBagWeight(int bagWeight) {
        this.bagWeight = bagWeight;
    }

    public int getBagWeight() {
        return bagWeight;
    }

    public void exceptionCallMethod()//caller method
    {
        int maxWeight=25;
      if(bagWeight<maxWeight)
      {
          System.out.println("bag will withstand the weight");
      }
      else {
          throw new BagDamageException("bag will not able to withstand the weight");
      }
    }
    public static void main(String[] args)//called method
    {
        Bag bag= new Bag();
        System.out.println("the maximum weight of the bag is 25");
        bag.setBagWeight(30);
        try {
            bag.exceptionCallMethod();

        }catch(BagDamageException e)
        {
            e.printStackTrace();
        }
        finally
        {
            System.out.println("we can store upto 25kgs in bag");
        }
        System.out.println("Exception is handle in called method");
    }
}
