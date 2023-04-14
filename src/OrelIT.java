public class OrelIT {
    int monthlySales() {
        return 150;
    }
}
class Kadawatha extends OrelIT {
    int monthlySales() {
        return 25;
    }
}
class Navinna extends OrelIT {
    int monthlySales() {
        return 25;
    }
}
class Kurunegala extends OrelIT {
    int monthlySales() {
        return 100;
    }
}
class TotalSales {
    public static void main(String[] args) {
        OrelIT o = new OrelIT();
        Kadawatha k = new Kadawatha();
        Navinna n = new Navinna();
        Kurunegala ku = new Kurunegala();
        System.out.println("OrelIT Company Monthly Sales In " + o.monthlySales() + "%");

        System.out.println("Kadawatha Site Monthly Sales In " + k.monthlySales() + "%");
        System.out.println("Navinna Site Monthly Sales In " + n.monthlySales() + "%");
        System.out.println("Kurunegala Site Monthly Sales In " + ku.monthlySales() + "%");
    }
}