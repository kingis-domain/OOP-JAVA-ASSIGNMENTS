public class ShoppingCart {
    public static void main(String[] args) {
        
        // the prices of 6 items
        int[] prices = {120, 80, 150, 60, 200, 90};
        
        // printing out of  all item prices
        System.out.println("Item prices:");
        for (int i = 0; i < prices.length; i++) {
            System.out.print(prices[i] + " ");
        }
        System.out.println();
        
        // then calculate total amount
        int total = 0;
        for (int i = 0; i < prices.length; i++) {
            total += prices[i];
        }
        System.out.println("Total amount the customer must pay: " + total);
    }
}
