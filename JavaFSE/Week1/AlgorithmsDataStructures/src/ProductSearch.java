import java.util.Arrays;

public class ProductSearch {

    // Linear search: find product by name (unsorted data)
    public static int linearSearchByName(String[] products, String target) {
        for (int i = 0; i < products.length; i++) {
            if (products[i].equalsIgnoreCase(target)) {
                return i;
            }
        }
        return -1;
    }


    public static int binarySearchByPrice(int[] prices, int target) {
        int low = 0, high = prices.length - 1;

        while (low <= high) {
            int mid = (low + high) / 2;

            if (prices[mid] == target) {
                return mid;
            } else if (prices[mid] < target) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        String[] productNames = {"Laptop", "Phone", "Tablet", "Headphones", "Monitor"};
        int result = linearSearchByName(productNames, "Tablet");
        System.out.println("Linear search - 'Tablet' found at index: " + result);

        int[] productPrices = {500, 1200, 300, 800, 150};
        Arrays.sort(productPrices);
        System.out.println("Sorted prices: " + Arrays.toString(productPrices));

        int priceResult = binarySearchByPrice(productPrices, 800);
        System.out.println("Binary search - price 800 found at index: " + priceResult);
    }
}