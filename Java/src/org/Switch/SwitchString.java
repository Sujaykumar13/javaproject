package org.Switch;

public class SwitchString {
    public static void main(String[] args){

        String  movies = "avengers";

        switch (movies){

            case "thor":
                System.out.println("A");
                break;

            case "captain america":
                System.out.println("B");
                break;

            case "mission impossible":
                System.out.println("C");
                break;

            case "interstellar":
                System.out.println("D");
                break;

            case "inception":
                System.out.println("E");
                break;

            case "avengers":
                System.out.println("F");

                break;

            case "tenet":
                System.out.println("G");
                break;

            default:
                System.out.println("no movies");
        }
    }
}
