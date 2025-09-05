package core.basesyntax.strategy;

public class NewYearDiscountService implements DiscountService {
    @Override
    public double getDiscount(String implName, int discount) {
        return discount = 20;
    }
}
