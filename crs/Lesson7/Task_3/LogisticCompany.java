package Lesson7.Task_3;

public abstract class LogisticCompany {
    public abstract Transport createTransport();

    public  void planDelivery() {

        Transport transport = createTransport();

        transport.startDeparture();
    }
}
