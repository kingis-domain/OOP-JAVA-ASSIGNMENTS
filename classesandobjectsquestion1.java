class CoffeeOrder {
    String size;
    double price;

    // the constructor
    CoffeeOrder(String size, double price) {
        this.size = size;
        this.price = price;
    }

    void display() {
        System.out.println("Size: " + size + ", Price: " + price);
    }
}

public class CoffeeShop {
    public static void main(String[] args) {
        CoffeeOrder order1 = new CoffeeOrder("Small", 250);
        CoffeeOrder order2 = new CoffeeOrder("Large", 450);

        order1.display();
        order2.display();
    }
}
