package com.streams;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class ProductRunner {

    public static void main(String[] args) {

        List<ProductDto> products=new ArrayList<>();
        ProductDto dto1=new ProductDto("mobile","electronic",56214);
        ProductDto dto2=new ProductDto("laptop","electronic",456214);
        ProductDto dto3=new ProductDto("shirt","cloth",6214);
        ProductDto dto4=new ProductDto("sunglass","fashion",5214);
        ProductDto dto5=new ProductDto("watch","electronic",5614);
        ProductDto dto6=new ProductDto("bottle","home",100);
        ProductDto dto7=new ProductDto("chocalete","food",500);
        ProductDto dto8=new ProductDto("biscuit","food",74);
        ProductDto dto9=new ProductDto("refrigerator","electronic",40125);
        ProductDto dto10=new ProductDto("pant","cloth",10124);

        products.add(dto1);
        products.add(dto2);
        products.add(dto3);
        products.add(dto4);
        products.add(dto5);
        products.add(dto6);
        products.add(dto7);
        products.add(dto8);
        products.add(dto9);
        products.add(dto10);



        System.out.println("printing all product of category electronics");
        List<ProductDto> productCategory = products.stream().
                filter(x -> x.getCategory().equals("electronic")).collect(Collectors.toList());//collect used to print instead of for each
        for (ProductDto productDto : productCategory) {
            System.out.println(productDto.getProductName());
        }

        System.out.println("printing all product name");
        List<String> productName = products.stream().map(x -> x.getProductName()).collect(Collectors.toList());
        System.out.println(productName);

        System.out.println("printing all product price");
        List<Integer> priceList = products.stream().map(x -> x.getPrice()).sorted().collect(Collectors.toList());
        System.out.println(priceList);

        System.out.println("printing all product which has price greater than 10000");
        List<ProductDto> product = products.stream().filter(x -> x.getPrice() > 10000).collect(Collectors.toList());
        for (ProductDto productDto : product) {
            System.out.println(productDto.getProductName());
        }

        System.out.println("printing all product based on category");
        List<ProductDto> pro = products.stream().filter(x -> x.getCategory() == "fashion").collect(Collectors.toList());
        for (ProductDto productDto : pro) {
            System.out.println(productDto.getProductName());
        }

        System.out.println("printing all product in desc of price");
        Comparator<ProductDto> productDtoComparator=(a,b)->(Integer.compare(b.getPrice(),a.getPrice()));
        List<ProductDto> productsInDesc = products.stream().sorted(productDtoComparator).collect(Collectors.toList());
        for (ProductDto productDto : productsInDesc) {
            System.out.println(productDto.getProductName());
        }


    }
}
