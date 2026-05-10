package Lesson7.Task_4;

public class IOSFactory implements MarketingFactory{
    @Override
    public Subscription createSubscription() {
        return new IOSSubscription();
    }

    @Override
    public Tariff createTariff() {
        return new IOSTariff();
    }
}
