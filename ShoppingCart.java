import javax.print.DocFlavor;
import java.util.ArrayList;
import java.util.HashMap;

/**
 * Created by Ricard Esteve on 11/07/2017.
 */
public class ShoppingCart {

    private ArrayList<Product> products  = new ArrayList<>();

    public ShoppingCart() {

    }

    public void addProduct(Product nomProducte) {
        products.add(nomProducte);
    }

    public  String toString() {
        return "cart with: " + this.products;
    }

    public double totalPrice() {

        double totalPrice = 0;

        for (int i = 0; i < products.size(); i++) {

            totalPrice = totalPrice + this.products.get(i).getPrice();
        }

        if (products.size() >= 5) {
            totalPrice = totalPrice * 0.9;
        }

        int discountObtained = repeatedProductDiscount();

        totalPrice = totalPrice - discountObtained;

        return totalPrice;
    }

    public int repeatedProductDiscount() {

        HashMap <String, Integer> repeatedMap = new HashMap<>();
        int discount = 0;
        for (int i = 0; i < products.size(); i++) {

            String name = this.products.get(i).getName();
            int price = this.products.get(i).getPrice();

            if (repeatedMap.containsKey(name)) {
                int count = repeatedMap.get(name);
                count++;
                repeatedMap.put(name, count);

                if (repeatedMap.get(name) % 4 == 0) {
                    discount += price;
                }

            } else {
                repeatedMap.put(name, 1);
            }

        }
        return discount;

    }

    public void  replace ( String productName, Product replacementProduct) {
        for (int i = 0; i < this.products.size(); i++) {
            if (this.products.get(i).getName() == productName) {
                this.products.set(i, replacementProduct);
            }
        }
    }
}
