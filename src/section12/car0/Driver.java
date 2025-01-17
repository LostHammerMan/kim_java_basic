package section12.car0;

public class Driver {

    private K3Car k3Car;
    private Model3Car model3Car;

    public void setK3Car(K3Car k3Car){
        this.k3Car = k3Car;
    }

    public void setModel3Car(Model3Car model3Car){
        this.model3Car = model3Car;
    }

    public void driver(){
        if (k3Car != null){
            System.out.println("자동차 운전 시작");
            k3Car.startEngine();
            k3Car.pressAccelerator();
            k3Car.offEngine();
        }else if (model3Car != null){
            System.out.println("자동차 운전 시작");
            model3Car.startEngine();
            model3Car.pressAccelerator();
            model3Car.offEngine();
        }

    }
}
