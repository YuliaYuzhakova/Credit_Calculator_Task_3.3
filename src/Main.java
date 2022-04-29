public class Main {
    public static void main(String[] args) {
    CreditPaymentService service = new CreditPaymentService ();
    int monthlyPayment = service.calculate (1_000_000,9.99, 1);
    System.out.println("Ежемесячный платеж по кредиту составит: " + monthlyPayment);
    }
}
