public class Main {
    public static void main(String[] args) {
        int initialAccount = 100;
        int depositAmount  = 500;


        if (depositAmount > 1000) {
            int bonus = depositAmount / 100;
            int finalAccount = initialAccount + bonus + depositAmount;
            System.out.println(finalAccount);
        } else {
            System.out.println(initialAccount + depositAmount);
    }
    }
}