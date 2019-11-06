public final class  SportCar extends Car {
    public SportCar(String mark, int year) {
        super(mark, year);

    }

    public void getInfo(int year) {
        System.out.println("Sport car " + this.getYear());
    }

}
