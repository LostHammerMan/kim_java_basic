package section1.productOrder;

import java.util.List;

public class ProductOrder {

    private String productName;
    private int price;
    private int quantity;

    public void generateOrder(String name, int price, int quantity){
        this.productName = name;
        this.price = price;
        this.quantity = quantity;
    }

    // 총 결제 금액
    public void orderSum(List<ProductOrder> orders){
        int sum = 0;

        for (ProductOrder order : orders){
            sum += (order.price * order.quantity);
        }
        System.out.println("총 결제 금액 : " + sum);
    }

    public ProductOrder() {
    }
}
