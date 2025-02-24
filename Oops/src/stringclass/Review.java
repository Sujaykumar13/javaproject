package stringclass;

public class Review {
    public static void main(String[] args)
    {
        String review ="movie is good";//string pool area
        System.out.println(review);
        review=review.concat(" and watchable");//concat return new string so in non string pool area
        System.out.println(review);
        System.out.println(review.length());

        String review1 ="movie is good";
        String review2="movie is good and watchable";
        System.out.println(review2);
        System.out.println(review2.length());
        System.out.println(review==review1);
        System.out.println(review1==review2);
        System.out.println(review==review2);
        String review3= new String("movie is good");
        String review4= new String("movie is good");
        String review5= new String("movie is good").intern();
        System.out.println(review3==review4);
        System.out.println(review3==review5);
        System.out.println(review1==review5);

    }
}
