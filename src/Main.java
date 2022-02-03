public class Main {
    public static void main(String[] args) {
        int ticketPrice = 4500;
        int mileFromPrice = 1;
        int Price = 20;
        int freeMile;

        freeMile = ticketPrice * mileFromPrice / Price;
        System.out.println("Вам начислено " + freeMile + " миль");
    }
}
