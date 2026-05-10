package Lesson7.Task_3;

public class TruckLogisticCompany extends LogisticCompany{
    @Override
    public Transport createTransport(){
        return new Truck();
    }
}
