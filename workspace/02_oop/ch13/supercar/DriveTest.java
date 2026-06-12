package ch13.supercar;

public class DriveTest {
    public static void main(String[]args){
        GasolineCar gcar = new GasolineCar(8);
        Driver driver = new Driver();
        HybridCar hcar = new HybridCar(7);
        ElectricCar ecar = new ElectricCar(6);
        PlugInHybridCar pcar = new PlugInHybridCar(5);
        // 1
        driver.drive(gcar);
        driver.drive(hcar);
        driver.drive(ecar);
        driver.drive(pcar);

        //6
        System.out.println("프로그램 종료");
    }
}
