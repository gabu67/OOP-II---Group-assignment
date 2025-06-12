interface PluggableDevice {
    void powerOn();
}

// Concrete implementation 1
class PhoneCharger implements PluggableDevice {
    public void powerOn() {
        System.out.println("Charging phone...");
    }
}

// Concrete implementation 2
class LaptopCharger implements PluggableDevice {
    public void powerOn() {
        System.out.println("Charging laptop...");
    }
}

// High-level module that depends on abstraction
class PowerSocket {
    private PluggableDevice device;

    public PowerSocket(PluggableDevice device) {
        this.device = device;
    }

    public void supplyPower() {
        device.powerOn();
    }
}

public class DependencyInversion {
    public static void main(String[] args) {
        PluggableDevice phone = new PhoneCharger();
        PluggableDevice laptop = new LaptopCharger();

        PowerSocket socket1 = new PowerSocket(phone);
        PowerSocket socket2 = new PowerSocket(laptop);

        socket1.supplyPower(); // Output: Charging phone...
        socket2.supplyPower(); // Output: Charging laptop...
    }
}
