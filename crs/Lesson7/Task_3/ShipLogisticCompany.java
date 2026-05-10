package Lesson7.Task_3;

public class ShipLogisticCompany extends LogisticCompany{
    @Override
    public Transport createTransport(){
        return new Ship();
    }
}
