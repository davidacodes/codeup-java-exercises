package practice.flowcontrol;

public class ex1 {
    public static void main(String[] args) {
        int random = (int) (Math.random() * 10);
        if (random != 0) {
            System.out.println("non-zero");
        } else if (random > 5) {
            System.out.println("it's big");
        } else {
            System.out.println("boring!");
        }
    }
}
