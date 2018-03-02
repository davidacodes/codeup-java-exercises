public class RestaurantTest {
    public static void main(String[] args) {

        RestaurantDish dish = new RestaurantDish();
        dish.costInCents = 300;
        dish.nameOfDish = "Pho";
        dish.wouldRecommend = true;

        System.out.println(dish.nameOfDish);
        System.out.println(dish.costInCents);
        System.out.println(dish.eat());
        System.out.println(dish.wouldRecommend);

        System.out.format("The %d of %s and it's %s I'd recommend it, %s", dish.costInCents, dish.nameOfDish, dish.wouldRecommend, dish.eat());


        BurgerTools tool = new BurgerTools("chips",2,100);
        BurgerTools burger = new BurgerTools("bread", 3,150);


        System.out.format("%n tool: %s  burger: %s", tool.getMostPopularTopping(), burger.getMostPopularTopping());

        tool.setMostPopularTopping("meat");
        burger.setMostPopularTopping("butter");

        System.out.format("%n tool: %s  burger: %s", tool.getMostPopularTopping(), burger.getMostPopularTopping());


    }
}
