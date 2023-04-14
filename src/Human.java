public class Human {
    void run () {
        System.out.println("Human Can Eat!");
    }
}
class Nalaka extends Human {
    void run() {
        System.out.println("Nalaka Can Eat!");
    }

    public static void main(String[] args) {
        Nalaka N = new Nalaka();
        N.run();
    }
}

