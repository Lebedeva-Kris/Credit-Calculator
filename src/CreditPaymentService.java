public class CreditPaymentService {
    public long calculate(long amount, long period) {
        double yearRate = 0.0999;

        // Аннуитентный кредит
        // Изначальная сумма * ежемесячная процентная ставка / (1 - (1 / (1 + ежемесячная процентная ставка)^периода кредита))

        double monthRate = yearRate / 12;
        double totalPaymentRate = amount * monthRate;
        double loanPaymentPeriod = (1 - (1 / Math.pow(monthRate + 1, period)));
        long mainPayment = (long) (totalPaymentRate / loanPaymentPeriod);
        return mainPayment;
    }

}
