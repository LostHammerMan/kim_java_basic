package section1.productOrder;


import java.sql.Array;
import java.util.ArrayList;
import java.util.List;

public class ProductOrderMain {

    public static void main(String[] args) {

        List<ProductOrder> lists = new ArrayList<>();

        ProductOrder productOrder1 = new ProductOrder();
        productOrder1.generateOrder("두부", 2000, 2);

        ProductOrder productOrder2 = new ProductOrder();
        productOrder2.generateOrder("김치", 5000, 1);

        ProductOrder productOrder3 = new ProductOrder();
        productOrder3.generateOrder("가격", 1500, 2);

        lists.add(productOrder1);
        lists.add(productOrder2);
        lists.add(productOrder3);

        productOrder1.orderSum(lists);
    }
}
