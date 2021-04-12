package labs.pm.app;

import labs.pm.data.ProductManager;
import labs.pm.data.ProductManagerException;

/**
 * {@code Shop} class represents an application that manages Products
 *
 * @author szpytma
 * @version 4.0
 */

public class Shop {
    public static void main(String[] args) throws ProductManagerException {
        ProductManager pm = ProductManager.getInstance();
        pm.printProductReport(101,"en-GB");
        pm.printProductReport(103,"ru-RU");

//        pm.createProduct(164, "Kombucha", BigDecimal.valueOf(1.99), NOT_RATED);
//        pm.reviewProduct(164, TWO_STAR, "Looks like tea but is it?");
//        pm.reviewProduct(164, FOUR_STAR, "Fine Tea");
//        pm.reviewProduct(164, FOUR_STAR, "This is not tea");
//        pm.reviewProduct(164, FIVE_STAR, "Perfect");
//
//        pm.dumpData();
//        pm.restoreData();
//        pm.printProductReport(105);
//        pm.printProductReport(164);
//
//        pm.printProducts(p -> p.getPrice().floatValue() < 2, (p1, p2) -> p2.getRating().ordinal() - p1.getRating().ordinal());
//        pm.getDiscount().forEach(
//                (rating, discount) -> System.out.println(rating + "\t" + discount));
//        pm.printProductReport(103);
//        pm.parseProduct("D,101,Tea,1.99,0,2019-09-19");
//        pm.parseReview("101,4,Nice hot cup of tea");
//        pm.parseReview("101,4,Rather wak tea");
//        pm.parseReview("101,4,Fine tea");
//        pm.parseReview("101,4,Good tea");
//        pm.parseReview("101,5,Perfect Tea");
//        pm.parseReview("101,3,Just add some lemon");
//        pm.printProductReport(101);
//
//        pm.parseProduct("F,103,Cake,3.99,0,2019-09-19");
//        pm.printProductReport(103);
//        pm.createProduct(101, "Tea", BigDecimal.valueOf(1.99), NOT_RATED);
//        pm.reviewProduct(101, FOUR_STAR, "Nice hot cup of tea!");
//        pm.reviewProduct(101, TWO_STAR, "Rather wak tea");
//        pm.reviewProduct(101, FOUR_STAR, "Fine tea");
//        pm.reviewProduct(101, FOUR_STAR, "Good tea");
//        pm.reviewProduct(101, FIVE_STAR, "Perfect Tea");
//        pm.reviewProduct(101, THREE_STAR, "Just add some lemon");

//        // pm = new ProductManager("pl-PL");
//        pm.createProduct(102, "Coffee", BigDecimal.valueOf(1.99), NOT_RATED);
//        pm.reviewProduct(102, THREE_STAR, "Coffee was OK");
//        pm.reviewProduct(102, ONE_STAR, "Where is the milk?");
//        pm.reviewProduct(102, FIVE_STAR, "It's perfect with ten spoons of sugar!");
//        // pm.printProductReport(102);
//
//        //pm = new ProductManager(Locale.UK);
//        pm.createProduct(103, "Cake", BigDecimal.valueOf(3.99), FIVE_STAR, now().plusDays(2));
//        pm.reviewProduct(103, FIVE_STAR, "Very nice cake!");
//        pm.reviewProduct(103, FOUR_STAR, "It was ok but could be better");
//        pm.reviewProduct(103, FIVE_STAR, "Delicious");
//        //pm.printProductReport(103);
//
//        pm.createProduct(104, "Cookie", BigDecimal.valueOf(3.99), TWO_STAR, now());
//        pm.reviewProduct(104, THREE_STAR, "Just another cookie");
//        pm.reviewProduct(104, THREE_STAR, "OK");
//        //pm.printProductReport(104);
//
//        pm.createProduct(105, "Hot Chocolate", BigDecimal.valueOf(2.99), FIVE_STAR);
//        pm.reviewProduct(105, FOUR_STAR, "Tasty");
//        pm.reviewProduct(105, FOUR_STAR, "No bad at all");
//        //pm.printProductReport(105);
//
//        pm.createProduct(106, "Chocolate", BigDecimal.valueOf(2.99), FIVE_STAR, LocalDate.now().plusDays(2));
//        pm.reviewProduct(106, TWO_STAR, "Too sweet");
//        pm.reviewProduct(106, THREE_STAR, "Better then cookie");
//        pm.reviewProduct(106, TWO_STAR, "Too bitter");
//        pm.reviewProduct(106, ONE_STAR, "I don't get it");
//        pm.printProductReport(106);
//
//        Comparator<Product> ratingSorter = ((p1, p2) -> p2.getRating().ordinal() - p1.getRating().ordinal());
//        Comparator<Product> priceSorter = ((p1, p2) -> p2.getPrice().compareTo(p1.getPrice()));
//
//        pm.printProducts(ratingSorter.thenComparing(priceSorter));
//        //pm.printProducts(ratingSorter.thenComparing(priceSorter).reversed());
//
//        pm.printProducts(p -> p.getPrice().floatValue() < 2, (p1, p2) -> p2.getRating().ordinal() - p1.getRating().ordinal());
//        //pm.printProducts((p1, p2) -> p2.getRating().ordinal() - p1.getRating().ordinal());
//        //pm.printProducts((p1, p2) -> p2.getPrice().compareTo(p1.getPrice()));
//        pm.getDiscount().forEach((rating, discount) -> System.out.println(rating + '\t' + discount));
    }


}
