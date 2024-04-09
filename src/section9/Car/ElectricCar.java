package section9.Car;

public class ElectricCar extends Car {

    public void charge(){
        System.out.println("충전 합니다");
    }

    @Override
    public void move() {
        System.out.println("전기차 빠르게 이동함");;
    }
}
