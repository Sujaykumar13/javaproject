package objectClass;

public class Adhar {
    private int adharNo;
    private String name;

    public Adhar(int adharNo,String name)
    {
        this.adharNo=adharNo;
        this.name=name;
    }

    @Override
    public String toString() {
        return "adhar number is  "+adharNo+"and name is "+name;
    }

    @Override
    public int hashCode() {
        return adharNo;
    }

    @Override
    public boolean equals(Object obj) {
        if(obj==null)
        {
            return false;
        }
        if(obj instanceof Adhar)
        {
            Adhar adhar= (Adhar) obj;
            if(this.adharNo==adhar.adharNo && this.name.equals(adhar.name))
            {
                return true;
            }
        }
        return false;
    }
}
// javap java.lang.object to get methods in object
// javap java.lang.string
//native -jni-java native interface it take to c++ because in java difficult to found address