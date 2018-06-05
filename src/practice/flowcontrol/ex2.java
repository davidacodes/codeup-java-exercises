package practice.flowcontrol;

public class ex2 {
    public static void main(String[] args) {
        int random = (int) (Math.random() * 10);
        switch(random)
        {
            case 0:
                System.out.println("it's zero");
            case 1:
                System.out.println("It's one");
            case 2:
                System.out.println("It's something else!");
            default:
                System.out.println("default");
                break;
        }
    }
}
