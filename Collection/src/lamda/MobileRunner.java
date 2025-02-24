package lamda;

public class MobileRunner {

    public static void main(String[] args) {
        Mobile mobile =new Mobile() {//it is a bylaptcode/waste code  //it is called anonomyus class
            @Override
            public int mobileId(int number) {
                return number;
            }
        };
        System.out.println(mobile.mobileId(40));

        //Mobile mobile1 =() -> "hello world"; lamda function without parameters
         //lamda experession in order avoid bylapcode or boilerplate code and it is use for functional interface
        //when we have multiple value to return we need to mention in flower bracket
        //System.out.println(mobile1.mobileId());

        Mobile mobile2= (int a)->a+10; // consumer interface which contain atleast 1 parameter
        // Mobile mobile2= int a->a+10;// for 1 parameter
        // Mobile mobile2= (a)->a+10;
        Mobile mobile3= (int a)->a;//without doing any opertion
        int result =mobile2.mobileId(40);
        System.out.println(result);
        System.out.println(mobile3.mobileId(30));
    }
}
