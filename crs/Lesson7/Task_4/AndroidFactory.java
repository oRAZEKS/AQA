package Lesson7.Task_4;

public class AndroidFactory implements MarketingFactory{
    @Override
    public Subscription createSubscription() {
        return new AndroidSubscription();
    }

    @Override
    public Tariff createTariff() {
        return new AndroidTariff();
    }
}
