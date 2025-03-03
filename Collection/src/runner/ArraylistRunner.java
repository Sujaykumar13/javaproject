package runner;

import dto.ProductDto;

import java.util.*;

public class ArraylistRunner {

    public static void main(String[] args) {

        List<ProductDto> productDtos = (List<ProductDto>) ProductRunner.getProducts();

        Iterator<ProductDto> itr= productDtos.iterator();

        while(itr.hasNext())
        {
            ProductDto productDto= itr.next();
            System.out.println(productDto);
        }


        System.out.println("adding element into the index");
        ProductDto p152 =new ProductDto("JUTRH6787","Apple iPhone 16e (Black, 128 GB)","apple",152064,2500);
        productDtos.add(144,p152);


        System.out.println("setting element into the index");
        ProductDto p153 =new ProductDto("5653KLP","SAMSUNG Galaxy F06 5G (Bahama Blue, 128 GB)","samsung",52064,2000);
        productDtos.set(150,p153);

        System.out.println("removing element from the index");
        System.out.println(productDtos.remove(100));

        System.out.println("getting element based on index");
        System.out.println(productDtos.get(90));

        System.out.println("getting index of element");
        System.out.println(productDtos.indexOf(p152));

        ProductDto p154 =new ProductDto("5653KLP","SAMSUNG Galaxy F06 5G (Bahama Blue, 128 GB)","samsung",52064,2000);
        productDtos.set(20,p153);
        System.out.println("getting last index of element");
        System.out.println(productDtos.lastIndexOf(p154));

        System.out.println("getting all elements between two index");
        System.out.println(productDtos.subList(20,60));

        System.out.println(productDtos.size()+"before using add all method");
        ProductDto p155 = new ProductDto("JHGJ98565","MarQ by Flipkart 0.75 Ton 3 Star Split Inverter","lg",25468,4566);
        ProductDto p156 = new ProductDto("FGGI4566","SAMSUNG 322 L Frost Free Double Door 2 Star Convertible Refrigerator","samsung",35641,6587);

        List<ProductDto> productCollection= new LinkedList<>();
        productCollection.add(p155);
        productCollection.add(p156);

        productDtos.addAll(20,productCollection);
        System.out.println(productDtos.size()+"after using add all method");

        //we use iterator over for loop because concurrent manipulation()adding/removing in middle is not possible in
        // for loop while using we get exception to concurrent manipulation exception in order to avoid we use iterator
        System.out.println("traversing element using listiterator");
        ListIterator<ProductDto> listitertor = productCollection.listIterator();
        while(listitertor.hasNext())
        {
            ProductDto product= listitertor.next();
            System.out.println(product);
        }

        System.out.println("traversing element from middle using list iterator");
        ListIterator<ProductDto> itr1 = productDtos.listIterator(100);
        while(itr1.hasNext())
        {
            ProductDto productDto1=itr1.next();
            System.out.println(productDto1);
        }

        System.out.println("traversing element from middle in reverse using list iterator-----------------------------------");
        ListIterator<ProductDto> listitertor1 = productDtos.listIterator(10);
        while(listitertor1.hasPrevious())
        {
            ProductDto product1= listitertor1.previous();
            System.out.println(product1);
        }

    }


}
