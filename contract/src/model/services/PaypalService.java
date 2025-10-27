package model.services;

public class PaypalService implements OnlinePaymentService{

    @Override
    public Double interest(Double amount, Integer months) {
        for (int i=1; i<=months; i++){
            amount = amount + 0.1 * i;
        }
        return amount;
    }

    @Override
    public Double paymentFee(Double amount) {
        return amount + amount * 0.2;
    }
}
