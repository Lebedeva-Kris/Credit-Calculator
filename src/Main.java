public class Main {
    public static void main(String[] args) {
        CreditPaymentService service = new CreditPaymentService();
        long monthlyPayment1year = service.calculate(1_000_000,12);
        System.out.println("Ежемесячный платеж составляет " + monthlyPayment1year);

        long monthlyPayment2years = service.calculate(1_000_000,24);
        System.out.println("Ежемесячный платеж составляет " + monthlyPayment2years);

        long monthlyPayment3years = service.calculate(1_000_000,36);
        System.out.println("Ежемесячный платеж составляет " + monthlyPayment3years);
    }
}
