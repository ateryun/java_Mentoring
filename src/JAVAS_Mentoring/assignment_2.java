package JAVAS_Mentoring;

public class assignment_2 {

    public static void main(String[] args) {
        Car[] cars = new Car[4];
        String[] carNames = {"kia", "ferrari", "bmw", "toyota"};
        int[] carGas = {10, 20, 15, 17};

        for (int i = 0; i < cars.length; i++) {
            cars[i] = new Car(carNames[i], carGas[i]);
        }

        for (int i = 0; i < 7; i++) {
            for (int j = 0; j < cars.length; j++) {
                Car currentCar = cars[j];
                if (currentCar.getGas() >=5) {
                    currentCar.move(5);

                }else {
                    currentCar.refuel(10);
                }
                System.out.println();
            }
        }
    }
}


