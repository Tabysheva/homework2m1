public class Car extends Vehicle {

    public Car(String mark, int year) {
        super(mark, year);
    }

    public void getInfo(String mark) {
        System.out.println(getMark());
    }

    public void getInfo(int year) {
        System.out.println(getYear());

    }

    public final void getInfo(Color color) {
        System.out.println(color);
    }
}
