package array;

public class AdharRunner {
    Adhar[] adhars = new Adhar[10];
    public static void main(String[] args)
    {
       AdharRunner runner=new AdharRunner();
       System.out.println("adhar 1");
       Adhar adhar1= new Adhar(12326546,"xyz",465546635,15);
       System.out.println(runner.saveDetails(adhar1));
       Adhar a1=runner.fetchDetailsByNumber(12326546);
       System.out.println(a1.toString());
       System.out.println(runner.updateNameByNumber(12326546,"sneha"));
       System.out.println(a1.toString());
       System.out.println(runner.deleteDetails(12326546));

        System.out.println("adhar 2");
        Adhar adhar2= new Adhar(123456846,"sujay",454512525,27);
        System.out.println(runner.saveDetails(adhar2));
        Adhar a2=runner.fetchDetailsByNumber(123456846);
        System.out.println(a1.toString());

        System.out.println("adhar 3");
        Adhar adhar3= new Adhar(123456845,"rahul",454512555,32);
        System.out.println(runner.saveDetails(adhar3));
        Adhar a3=runner.fetchDetailsByNumber(123456845);
        System.out.println(a3.toString());

        System.out.println("adhar 4");
        Adhar adhar4= new Adhar(123456846,"virat",454512555,35);
        System.out.println(runner.saveDetails(adhar4));
        Adhar a4=runner.fetchDetailsByNumber(123456846);
        System.out.println(a4.toString());

        System.out.println("adhar 5");
        Adhar adhar5= new Adhar(123456815,"pant",454513555,22);
        System.out.println(runner.saveDetails(adhar5));
        Adhar a5=runner.fetchDetailsByNumber(123456815);
        System.out.println(a5.toString());

        System.out.println("adhar 6");
        Adhar adhar6= new Adhar(123456841,"gill",454512655,22);
        System.out.println(runner.saveDetails(adhar6));
        Adhar a6=runner.fetchDetailsByNumber(123456841);
        System.out.println(a6.toString());

        System.out.println("adhar 7");
        Adhar adhar7= new Adhar(123456812,"smith",454512289,35);
        System.out.println(runner.saveDetails(adhar7));
        Adhar a7=runner.fetchDetailsByNumber(123456812);
        System.out.println(a7.toString());

        System.out.println("adhar 8");
        Adhar adhar8= new Adhar(123456813,"root",454512123,36);
        System.out.println(runner.saveDetails(adhar8));
        Adhar a8=runner.fetchDetailsByNumber(123456813);
        System.out.println(a8.toString());

        System.out.println("adhar 9");
        Adhar adhar9= new Adhar(123456814,"starc",454514563,34);
        System.out.println(runner.saveDetails(adhar9));
        Adhar a9=runner.fetchDetailsByNumber(123456814);
        System.out.println(a9.toString());

        System.out.println("adhar 10");
        Adhar adhar10= new Adhar(123456816,"maxi",454512155,40);
        System.out.println(runner.saveDetails(adhar10));
        Adhar a10=runner.fetchDetailsByNumber(123456816);
        System.out.println(a10.toString());
    }
    public boolean saveDetails(Adhar adhar)
    {
        boolean flag=false;
        for(int i=0;i< adhars.length;i++)
        {
            if(adhars[i]==null)
            {
                adhars[i]=adhar;

                flag=true;
                break;
            }
        }
        return flag;
    }
    public Adhar fetchDetailsByNumber(int num)
    {
        for(int i=0;i<adhars.length;i++)
        {
            if(adhars[i].getNum()==num)
            {
                return adhars[i];
            }
        }
        return null;
    }
    public boolean updateNameByNumber(int num,String name)
    {
        for(int i=0;i< adhars.length;i++)
        {
            if(adhars[i].getNum()==num)
            {
                adhars[i].setName(name);
                return true;
            }
        }
        return false;
    }
    public boolean deleteDetails(int num)
    {
        for(int i=0;i< adhars.length;i++)
        {
            if(adhars[i].getNum()==num)
            {
                adhars[i] = null;
                return true;
            }
        }
        return false;
    }
}
