package Lesson7.Task_4;

public class Main {
    static void main(String[] args) {
        // Для ANDROID
        MarketingFactory androidFactory =
                new AndroidFactory();

        MarketingPlan androidPlan =
                new MarketingPlan(androidFactory);

        androidPlan.setupPlan();

        System.out.println();

        // для IOS
        MarketingFactory iosFactory =
                new IOSFactory();

        MarketingPlan iosPlan =
                new MarketingPlan(iosFactory);

        iosPlan.setupPlan();
    }
}
