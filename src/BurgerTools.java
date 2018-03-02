public class BurgerTools {

        private String mostPopularTopping = "cheese";
        private int averageDaysBeforeExpiration;
        private int temperatureWhenCooked;

    public void setMostPopularTopping(String mostPopularTopping) {
        this.mostPopularTopping = mostPopularTopping;
    }

    public String getMostPopularTopping() {

        return mostPopularTopping;
    }

    public BurgerTools(String mostPopularTopping, int averageDaysBeforeExpiration, int temperatureWhenCooked) {
        this.mostPopularTopping = mostPopularTopping;
        this.averageDaysBeforeExpiration = averageDaysBeforeExpiration;
        this.temperatureWhenCooked = temperatureWhenCooked;



    }

    public String grill() {
            return "Grilling Burger";




        }

    }

