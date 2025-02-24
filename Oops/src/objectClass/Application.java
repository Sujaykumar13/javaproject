package objectClass;

public class Application {
    private int appNo;
    private String appName;

    public Application(int appNo,String appName)
    {
        this.appNo=appNo;
        this.appName=appName;
    }

    @Override
    public String toString() {
        return "application id is "+appNo+"and application name is "+appName;
    }

    @Override
    public int hashCode() {
        return appNo;
    }

    @Override
    public boolean equals(Object obj) {
        if(obj==null)
        {
            return false;
        }
        if(obj instanceof Application)
        {
            Application app= (Application) obj;
            if(this.appNo==app.appNo && this.appName.equals(app.appName))
            {
                return true;
            }
        }
        return false;
    }
}
