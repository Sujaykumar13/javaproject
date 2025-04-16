package com.streams;

import java.util.*;
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

        System.out.println("grouping by category");
        Map<String,List<ProductDto>> category = products.stream().collect(Collectors.groupingBy(ProductDto::getCategory));
        Set<String> keys = category.keySet();

        for (Object key : keys) {
            System.out.println(key);
            List<ProductDto> values = category.get(key);
            for (ProductDto value : values) {
                System.out.println("product category is "+key+" with product name "+ value.getProductName() );

            }
        }

         Map<String,  Double> category1 = products.stream().collect(Collectors.groupingBy(ProductDto::getCategory,
                Collectors.summingDouble(ProductDto::getPrice)));//method reffernence
        //sum,avg,min.max,count
        //foreach(System.out::println)
        Double average = products.stream().collect(Collectors.averagingDouble(ProductDto::getPrice));
        System.out.println("average of price is"+average);

         Long count = products.stream().collect(Collectors.counting());
        System.out.println("count of dto"+count);

        Double sum = products.stream().collect(Collectors.summingDouble(ProductDto::getPrice));
        System.out.println("sum of price is"+sum);

        Optional<ProductDto> max = products.stream().collect(Collectors.maxBy(Comparator.comparing(ProductDto::getPrice)));
        System.out.println("max of price is"+max);

        Optional<ProductDto> min = products.stream().collect(Collectors.minBy(Comparator.comparing(ProductDto::getPrice)));
        System.out.println("min of price is"+min.get());

        System.out.println("printing all product in asc order of product name");
        Comparator<ProductDto> productDtoComparator1=(a,b)->(a.getProductName().compareTo(b.getProductName()));
        List<ProductDto> productsInAsc1 = products.stream().sorted(productDtoComparator).collect(Collectors.toList());
        for (ProductDto productDto : productsInAsc1) {
            System.out.println(productDto.getProductName());
        }

        System.out.println("printing all product in desc order of product name");
        Comparator<ProductDto> productDtoComparator2=(a,b)->(b.getProductName().compareTo(a.getProductName()));
        List<ProductDto> productsInDesc1 = products.stream().sorted(productDtoComparator).collect(Collectors.toList());
        for (ProductDto productDto : productsInDesc1) {
            System.out.println(productDto.getProductName());
        }

        System.out.println("sorting dto based on name in ascending order");
        Comparator<ProductDto> productDtoNameComparator=
                (c,d)-> c.getProductName().compareTo(d.getProductName());
        product.
                stream().
                sorted(productDtoNameComparator).
                forEach(c-> System.out.println(c.getProductName()));

        System.out.println("sorting dto based on name in descending order");
        Comparator<ProductDto> productDtoNameComparator1=
                (c,d)-> d.getProductName().compareTo(c.getProductName());
        product.
                stream().
                sorted(productDtoNameComparator1).
                forEach(c-> System.out.println(c.getProductName()));

    }
}
