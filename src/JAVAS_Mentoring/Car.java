package JAVAS_Mentoring;

public class Car {
    private int gas;
    private String carName;



    public Car(String carName, int gas) {
        this.gas = gas;
        this.carName = carName;
    }

    public void setGas(int gas) {
        this.gas = gas;
    }

    public int getGas() {
        return gas;
    }

    public void setCarName(String carName) {

        this.carName = carName;
    }

    public String getCarName() {
        return carName;
    }

    public int move(int gas) {
        if (this.gas >= gas) {
            this.gas -= gas;
            System.out.println("남은 가스: " + this.gas);
            return this.gas;
        } else {
            System.out.println("가스 부족. 남은 가스:" + this.gas);
            return this.gas;
        }
    }

    public int refuel(int amount) {
        this.gas += amount;
        System.out.println("현재 남은 가스: " + this.gas);
        return this.gas;
    }
}


