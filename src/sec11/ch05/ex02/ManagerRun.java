package sec11.ch05.ex02;

public class ManagerRun implements Runnable {
    CoffeeMachine coffeeMachine;
    public ManagerRun(CoffeeMachine coffeeMachine) {
        this.coffeeMachine = coffeeMachine;
    }

    @Override
    public void run() {
        while (true) {
            coffeeMachine.fill();
        }
    }
}
