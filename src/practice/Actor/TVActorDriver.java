package practice.Actor;

public class TVActorDriver {
    public static void main(String[] args) {
        TVActor a = new TVActor();
        a.name = "Thomas Middleditch";
        a.role = "Richard Hendricks";
        a.age = 45;

        TVActor b = new TVActor();
        b.name = "Martin Starr";
        b.role = "Bertram Gifoyle";
        b.age = 46;

        TVActor c = new TVActor();
        c.name = "Kumail Nanjiani";
        c.role = "Dinesh Chugtai";
        c.age = 46;

        System.out.println( a.name + " played " + a.role + " age: " + a.age);
        System.out.println( b.name + " played " + b.role + " age: " + b.age);
        System.out.println( c.name + " played " + c.role + " age: " + c.age);
    }
}
