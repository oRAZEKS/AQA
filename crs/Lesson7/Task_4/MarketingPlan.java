package Lesson7.Task_4;

public class MarketingPlan {
    private final MarketingFactory factory;

    public MarketingPlan(MarketingFactory factory) {
        this.factory = factory;
    }

    public void setupPlan() {

        Subscription subscription =
                factory.createSubscription();

        subscription.printInfo();

        Tariff tariff =
                factory.createTariff();

        tariff.printPlan();
    }
}
