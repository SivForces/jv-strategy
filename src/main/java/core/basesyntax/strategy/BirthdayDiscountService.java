package core.basesyntax.strategy;

public class BirthdayDiscountService implements DiscountService {
    @Override
    public double getDiscount(String implName, int discount) {
        return 33;
    }
}
