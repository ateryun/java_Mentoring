class Car {
    private int gas;
    private String carName;

    Car() {
    }
    Car(String carName) {
        setCarName(carName);
    }
    Car(int gas) {
        setGas(gas);
    }
    Car(String carName, int gas) {
        setGas(gas);
        setCarName(carName);
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
            System.out.println(this.carName + " move, resume gas :" + this.gas);
            return this.gas;
        } else {
            System.out.println("가스 부족. 남은 가스:" + this.gas);
            return this.gas;
        }
    }

    public int refuel(int amount) {
        System.out.println("현재 남은 가스 : " +this.gas);
        this.gas += amount;
        System.out.println(carName +"의 차량이 연료가 부족하므로 연료를 채웁니다.");
        System.out.println("fuel amount : " + amount +", refuel 한 연료: " + this.gas);
        return this.gas;
    }
}



class assignment_2 {

  public static void main(String[] args) {
      Car[] cars = new Car[4];
      String[] carNames = {"kia", "ferrari", "bmw", "toyota"};
      int[] carGas = {10, 20, 15, 17};

      for (int i = 0; i < cars.length; i++) {
          cars[i] = new Car(carNames[i], carGas[i]);
      }

      for (int i = 0; i < 7; i++) {
          for (int j = 0; j < cars.length; j++) {
              if (cars[j].getGas() >=5) {
                  cars[j].move(5);

              }else {
                  cars[j].refuel(10);
              }
              System.out.println();
          }
      }
    }
}


