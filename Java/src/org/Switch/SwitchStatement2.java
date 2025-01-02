package org.Switch;

public class SwitchStatement2 {
    public static void main(String[] args)
    {
        int i=2;
        switch(i)
        {
            case 1: System.out.println("start the journey from bangalore");
                break;
            case 2: System.out.println("bus is near to kengeri");
                break;
            case 3: System.out.println("bus stops in ramnagar");
                break;
            case 4: System.out.println("bus is in mandya");
                break;
            case 5: System.out.println("bus reached the destination");
                break;
            default:System.out.println("bus stops for lunch");
                break;
        }
    }
}
