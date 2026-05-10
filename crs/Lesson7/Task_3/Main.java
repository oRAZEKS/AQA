package Lesson7.Task_3;

public class Main {
    static void main(String[] args) {
        LogisticCompany truckCompany = new TruckLogisticCompany();
        truckCompany.planDelivery();

        LogisticCompany shipCompany = new ShipLogisticCompany();
        shipCompany.planDelivery();
    }
}
