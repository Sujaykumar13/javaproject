package dto;

import java.io.Serializable;

public class ProductDto implements Serializable,Comparable<ProductDto> {

    private String productId;
    private String prouctName;
    private String brand;
    private int cost;
    private int discount;

    public ProductDto()  {
    }

    public ProductDto(String productId, String prouctName, String brand, int cost, int discount) {
        this.productId = productId;
        this.prouctName = prouctName;
        this.brand = brand;
        this.cost = cost;
        this.discount = discount;
    } 


    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public String getProuctName() {
        return prouctName;
    }

    public void setProuctName(String prouctName) {
        this.prouctName = prouctName;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    public int getDiscount() {
        return discount;
    }

    public void setDiscount(int discount) {
        this.discount = discount;
    }

    @Override
    public String toString() {
        return "ProductDto{" +
                "productId='" + productId + '\'' +
                ", prouctName='" + prouctName + '\'' +
                ", brand='" + brand + '\'' +
                ", cost=" + cost +
                ", discount=" + discount +
                '}';
    }


    @Override
    public int compareTo(ProductDto o) {
        return this.brand.compareTo(o.brand);
    }
}
