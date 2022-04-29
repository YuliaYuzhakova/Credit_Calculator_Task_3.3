public class CreditPaymentService {
    public int calculate(int credit, double percent, int period) {
        int month = (period * 12); //Перевод лет кредита в месяцы
        double monthlyPercent = (percent / (100 * 12)); //Расчет процентной ставки по кредиту в месяц

        int exponent = (-month);
        double x = Math.pow((1 + monthlyPercent), exponent); //Расчет в степени -М значения (1 + ПС)

        int monthlyPayment = (int)(credit * (monthlyPercent / (1 - x)));

        return monthlyPayment;

        //Формула для расчета суммы кредита в месяц:
        //А = К * (ПС / (1 – (1 + ПС) – М))
        //Где
        //К – сумма кредита
        //ПС - процент по кредиту в месяц
        //М – срок в месяцах (считается как отрицательная степень)
    }
}
