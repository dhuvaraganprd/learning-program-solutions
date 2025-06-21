import java.util.*;
class Product 
{
    int productId;
    String productName;
    String category;

    public Product(int productId, String productName, String category) 
    {
        this.productId = productId;
        this.productName = productName;
        this.category = category;
    }

    public String toString() 
    {
        return " "+productId+" - " +productName+" - "+category+" ";
    }
}
public class EcommerceSearch 
{
    public static Product linearSearch(Product[] products, String name) 
    {
        for (Product p : products) 
        {
            if(p.productName.equalsIgnoreCase(name)) 
            {
                return p;
            }
        }
        return null;
    }

    public static Product binarySearch(Product[] products, String name) {
        int left = 0;
        int right = products.length - 1;

        while (left <= right) 
        {
            int mid = (left + right) / 2;
            int compare=products[mid].productName.compareToIgnoreCase(name);
            if (compare==0)
            {
                return products[mid];
            } 
            else if(compare<0) 
            {
                left=mid+1;
            } 
            else 
            {
                right =mid-1;
            }
        }
        return null;
    }
    public static void main(String[] args) 
    {
        Product p1 = new Product(1, "Laptop", "Electronics");
        Product p2 = new Product(2, "Shirt", "Apparel");
        Product p3 = new Product(3, "Book", "Education");
        Product p4 = new Product(4, "Phone", "Electronics");
        Product p5 = new Product(5, "Shoes", "Footwear");
        Product[] products = { p1, p2, p3, p4, p5 };
        Product result1 = linearSearch(products, "Book");
        System.out.println("Linear Search Result: " + (result1 != null ? result1 : "Product not found"));
        Arrays.sort(products, new Comparator<Product>() {
            public int compare(Product p1, Product p2) {
                return p1.productName.toLowerCase().compareTo(p2.productName.toLowerCase());
            }
        });

        Product result2 = binarySearch(products, "Book");
        System.out.println("Binary Search Result: " + (result2 != null ? result2 : "Product not found"));
    }
}
/*
    Time Complexsity:
     Linear Serach: O(n)  Binary Search:Log n
*/ 