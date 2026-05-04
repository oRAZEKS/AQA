package Lesson5.Task_1;

public class Atelier {

    public void dressWoman(Clothes[] clothes) {
        for (Clothes c : clothes) {
            if (c instanceof WomensClothing) {
                System.out.print("Женская одежда: ");
                System.out.println("Размер: " + c.size +
                        ", Евро: " + c.size.getEuroSize() +
                        ", Цвет: " + c.color +
                        ", Цена: " + c.price);
                ((WomensClothing) c).dressWoman();
            }
        }
    }

    public void dressMan(Clothes[] clothes) {
        for (Clothes c : clothes) {
            if (c instanceof MensClothing) {
                System.out.print("Мужская одежда: ");
                System.out.println("Размер: " + c.size +
                        ", Евро: " + c.size.getEuroSize() +
                        ", Цвет: " + c.color +
                        ", Цена: " + c.price);
                ((MensClothing) c).dressMan();
            }
        }
    }
}
