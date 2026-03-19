package Lab_08_Tasks;

interface SmartDevice {
    void turnOn();
    void turnOff();
}

class SmartLight implements SmartDevice {
    @Override
    public void turnOn() {
        System.out.println("Smart Light Turned On!");
    }

    @Override
    public void turnOff() {
        System.out.println("Smart Light Turned Off!");
    }
}

class SmartFan implements SmartDevice {
    @Override
    public void turnOn() {
        System.out.println("Smart Fan Turned On!");
    }

    @Override
    public void turnOff() {
        System.out.println("Smart Fan Turned Off!");
    }
}

class Main2 {
    public static void main(String[] args) {
        SmartDevice s1 = new SmartLight();
        s1.turnOn();
        s1.turnOff();
        SmartDevice s2 = new SmartFan();
        s2.turnOn();
        s2.turnOff();
    }
}