package collections.treeset;

import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        TreeSet<Product> products = new TreeSet<>();

        products.add(new Product(2312, "Notebook", 10000.0));
        products.add(new Product(1234, "Smartphone", 200.0));
        products.add(new Product(4321, "Tablet", 300.0));
        products.add(new Product(2312, "Notebook", 10000.0));

        for (Product product: products) {
            System.out.println(product);
        }

        /*
        Output:
        Product{name='Smartphone, code= 1234, price= 200.0}
        Product{name='Notebook, code= 2312, price= 10000.0}
        Product{name='Tablet, code= 4321, price= 300.0}
        */
    }
}
