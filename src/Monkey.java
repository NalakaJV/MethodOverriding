public class Monkey {
    void climb() {
        System.out.println("Monkey is Using Boby!");
    }
}
class Man extends Monkey {
    void climb() {
        System.out.println("Man is Using Ladder!");
    }

    public static void main(String[] args) {
        Man m = new Man();
        Monkey mk = new Monkey();
        m.climb();
        mk.climb();
    }
}

