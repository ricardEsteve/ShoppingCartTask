/**
 * Created by Ricard Esteve on 11/07/2017.
 */
public class Main {

    public static void main(String [ ] args)
    {
        Product p1 = new Product ("vacuum cleaner", 100);
        Product p2 = new Product("pencil", 3);
        Product p3 = new Product("bike", 300);
        Product p4 = new Product("candies", 2);
        Product p5 = new Product("computer", 500);
        Product p6 = new Product("orthopedic leg", 400);

        System.out.println(p1.toString());

        ShoppingCart sCart = new ShoppingCart();

        System.out.println(sCart);

        sCart.addProduct(p3);
        System.out.println(sCart.toString());
        System.out.println(sCart.totalPrice());


        sCart.addProduct(p3);
        sCart.addProduct(p3);
        System.out.println(sCart);
        System.out.println(sCart.totalPrice());

        sCart.addProduct(p3);
        System.out.println(sCart);
        System.out.println(sCart.totalPrice());

        sCart.addProduct(p5);
        System.out.println(sCart);
        System.out.println(sCart.totalPrice());
    }
}
