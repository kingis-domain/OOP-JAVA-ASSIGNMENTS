public class WarehouseStock {
    public static void main(String[] args) {
        
        int[][][] stock = {
            {   // Warehouse 1
                {50, 30, 20},  // Section 1
                {40, 25, 15}   // Section 2
            },
            {   // Warehouse 2
                {60, 35, 25},  // Section 1
                {55, 28, 18}   // Section 2
            }
        };
        
        // print all stock values using 3 nested loops
        System.out.println("Stock in both warehouses:");
        for (int w = 0; w < stock.length; w++) {
            System.out.println("Warehouse " + (w + 1) + ":");
            for (int s = 0; s < stock[w].length; s++) {
                System.out.print("  Section " + (s + 1) + ": ");
                for (int p = 0; p < stock[w][s].length; p++) {
                    System.out.print(stock[w][s][p] + " ");
                }
                System.out.println();
            }
        }
        
        // calculate total stock in Warehouse 2 (index 1)
        int totalWarehouse2 = 0;
        for (int s = 0; s < stock[1].length; s++) {
            for (int p = 0; p < stock[1][s].length; p++) {
                totalWarehouse2 += stock[1][s][p];
            }
        }
        System.out.println("Total stock in Warehouse 2: " + totalWarehouse2);
    }
}
