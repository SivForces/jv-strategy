package core.basesyntax.strategy;

public class BlackFridayDiscountService implements DiscountService{
    @Override
    public double getDiscount(String implName, int discount) {
        return 45;
    }
}
