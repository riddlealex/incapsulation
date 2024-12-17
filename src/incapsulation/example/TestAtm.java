package incapsulation.example;

public class TestAtm {

    public static void main(String[] args) {
        Atm atm1 = new Atm(1, 1, 2);
        System.out.println(atm1.getSum());

        System.out.println(atm1.getFiftyBill() + " купюр по 50");

        System.out.println(atm1.isWithdraw(80));

        System.out.println(atm1.getFiftyBill() + " купюр по 50");
        System.out.println(atm1.getTenBill() + " купюр по 10");
    }
}
