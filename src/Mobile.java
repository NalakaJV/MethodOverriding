public class Mobile {
    public void displayName() {
        System.out.println("Smart Mobile");
    }
}
class Samsung extends Mobile{
    @Override
    public void displayName() {
        System.out.println("Samsung Galaxy Not 22");
        super.displayName();
    }
}
class Apple extends Samsung {
    @Override
    public void displayName() {
        System.out.println("Iphone 14 pro Max");
        super.displayName();
    }
}
class run {
    public static void main(String[] args) {
        Samsung s = new Samsung();
        Apple a = new Apple();
        s.displayName();
        a.displayName();
    }
}
