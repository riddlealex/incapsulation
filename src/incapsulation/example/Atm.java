package incapsulation.example;

public class Atm {

    private int tenBill;
    private int twentyBill;
    private int fiftyBill;
    private int sum;

    public Atm(int tenBill, int twentyBill, int fiftyBill) {
        this.tenBill = tenBill;
        this.twentyBill = twentyBill;
        this.fiftyBill = fiftyBill;
        sum = tenBill * 10 + twentyBill * 20 + fiftyBill * 50;
    }

    public int getSum() {
        return sum;
    }

    public boolean isWithdraw(int amount) {
        if (amount <= getSum()) {
            int fifty = amount / 50;
            int twenty = amount % 50 / 20;
            int ten = amount % 50 % 20 / 10;
            System.out.println("Сумма выдана купюрами: ");
            System.out.println("Номинал 50: " + fifty);
            System.out.println("Номинал 20: " + twenty);
            System.out.println("Номинал 10: " + ten);

            setFiftyBill(getFiftyBill() - fifty);
            setTwentyBill(getTwentyBill() - twenty);
            setTenBill(getTenBill() - ten);

            System.out.print("\nСумма выдана - ");
            return true;
        } else {
            System.out.print("Сумма выдана - ");
            return false;
        }
    }

    public void setTenBill(int tenBill) {
        this.tenBill = tenBill;
    }

    public void setTwentyBill(int twentyBill) {
        this.twentyBill = twentyBill;
    }

    public void setFiftyBill(int fiftyBill) {
        this.fiftyBill = fiftyBill;
    }

    public int getTenBill() {
        return tenBill;
    }

    public int getTwentyBill() {
        return twentyBill;
    }

    public int getFiftyBill() {
        return fiftyBill;
    }

    public void addTenBill(int amount) {
        this.tenBill += amount;
    }

    public void addTwentyBill(int amount) {
        this.twentyBill += amount;
    }

    public void addFiftyBill(int amount) {
        this.fiftyBill += amount;
    }
}
