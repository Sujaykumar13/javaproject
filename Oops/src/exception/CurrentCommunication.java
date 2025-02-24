package exception;

public class CurrentCommunication extends Communication {
    String comm;

    public void setComm(String comm) {
        this.comm = comm;
    }

    public String getComm() {
        return comm;
    }
    public void communicationType()
    {
        System.out.println("currently we don't have any letter communication");
        try{if(comm!="mobile")
        {
            throw new NoCommunicationWithMobileException("we not able to call without mobile");
        }
        if(comm!="tv")
        {
            throw new NotGetCurrentAffairsException("we don't get any information about world without tv");
        }} catch(NoCommunicationWithMobileException e)
        //catch(NotGetCurrentAffairsException|NoCommunicationWithMobileException e)
        //catch(Exception e)
        {
            e.printStackTrace();
        }
        catch(NotGetCurrentAffairsException e)
        {
            try{int[] a={0,1};
            System.out.println(a[2]);}
            catch(ArrayIndexOutOfBoundsException e1)
            {
                System.out.println(e1.getCause());
                System.out.println("we handle arrayindexoutofbounds exception");
            }
            e.printStackTrace();
        }
        finally {
            System.out.println("we can get information through news paper");
        }
        System.out.println("In future we get AI communication");
    }
    public static void main(String[] args)
    {
        CurrentCommunication comm = new CurrentCommunication();
        comm.setComm("mobile");
        comm.communicationType();
    }
}
