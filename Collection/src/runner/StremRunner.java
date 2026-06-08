package runner;

import dto.ProductDto;

import java.util.Collection;
import java.util.Comparator;

public class StremRunner {

    public static void main(String[] args) {

        Collection<ProductDto> productDtos = ProductRunner.getProducts();

        System.out.println(productDtos.size());

        System.out.println("sorting collection based on brand in ascending order");
        productDtos.
                stream().
                sorted().
                forEach(c-> System.out.println(c));

        System.out.println("sorting collection based on cost in descending order");
        Comparator<ProductDto> productDtoComparator=(c,d)
                ->Integer.compare(d.getCost(),c.getCost());
        productDtos.
                stream().
                sorted(productDtoComparator).
                forEach(c-> System.out.println(c));

        //
        System.out.println("finding all product by brand");
        productDtos.stream().
                filter(product->product.getBrand()=="addidas").forEach(c-> System.out.println(c));

        //
        System.out.println("finding all product by discount");
        productDtos.
                stream().
                filter(product->product.getDiscount()==400).
                forEach(c-> System.out.println(c));

        //
        System.out.println("finding all product by brand and sorting in ascending order");
        productDtos.
                stream().
                filter(product->product.getBrand()=="addidas").
                sorted().
                forEach(c-> System.out.println(c));

        System.out.println("geting all product for which cost is greater than 50000");
        productDtos.
                stream().
                filter(c->c.getCost()>50000).
                sorted().
                forEach(c-> System.out.println(c));

        System.out.println("geting product based on maximum price");
        ProductDto maxPriceProduct = productDtos.
                stream().
                max((c1, c2) -> Integer.
                        compare(c1.getCost(), c2.getCost())).
                       get();
        System.out.println(maxPriceProduct);

        System.out.println("sorting collection based on brand and name in ascending order");
        Comparator<ProductDto> productDtoNameComparator=
                (c,d)-> c.getProuctName().compareTo(d.getProuctName());
        productDtos.
                stream().
                sorted().
                sorted(productDtoNameComparator).
                forEach(c-> System.out.println(c));

        System.out.println("geting all product brand");
        productDtos.
                stream().
                map(product->product.
                        getBrand()).
                        forEach(c-> System.out.println(c));

        System.out.println("geting all product names");
        productDtos.
                stream().
                map(product->product.
                        getProuctName()).
                        forEach(c-> System.out.println(c));

    }
}
