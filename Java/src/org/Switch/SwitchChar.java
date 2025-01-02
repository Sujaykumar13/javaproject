package org.Switch;

public class SwitchChar {
    public static void main(String[] args){

        char grade = 'A';

        switch(grade){

            case 'A' :
                System.out.println("rating is more than 9");
                break;
            case 'B' :
                System.out.println("rating is more than 8");
                break;
            case 'C' :
                System.out.println("rating is more than 7");
                break;
            case 'D' :
                System.out.println("rating is more than 6");
                break;
            case 'E' :
                System.out.println("rating is more than 5");
                break;
            case 'F' :
                System.out.println("rating is more than 4");
                break;

            default:
                System.out.println("movie is worst");


        }

    }
}
