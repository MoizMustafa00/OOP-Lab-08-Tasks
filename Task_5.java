package Lab_08_Tasks;

interface RemoteControl {
    void controlRemotely();
}

abstract class Appliance {
    public abstract void start();
}

class SmartWashingMachine extends Appliance implements RemoteControl {
    @Override
    public void start() {
        System.out.println("Smart Washing Machine Started Working!");
    }

    @Override
    public void controlRemotely() {
        System.out.println("Smart Washing Machine is Controlled Remotely!");
    }
}

class Main5 {
    public static void main(String[] args) {
        SmartWashingMachine swm = new SmartWashingMachine();
        swm.start();
        swm.controlRemotely();
    }
}