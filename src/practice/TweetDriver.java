package practice;

public class TweetDriver {
    public static void main(String[] args) {
        Tweet t = new Tweet("Thu Feb 19 20:29:00 +0000 2105", 8,true,
                568507566168223744L, 2, false, "The cake is a lie!"
                + "\nLove, robot ");

        System.out.println( t );
        System.out.println( "\n----------------------------\n");
        System.out.println( t );
    }
}
