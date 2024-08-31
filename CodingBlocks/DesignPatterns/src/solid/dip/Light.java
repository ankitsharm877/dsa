package solid.dip;

//Violates DIP
class Light {
	private Switch lightSwitch;

	public Light() {
		this.lightSwitch = new Switch();
	}

	public void turnOn() {
		lightSwitch.press();
	}
}

class Switch {
	public void press() {

	}
}

//Improved: Depend on abstractions rather than concrete classes.

interface Switch1 {
    void press();
}

class LightSwitch implements Switch1 {
    public void press() {
        // Switch logic
    }
}

class Light1 {
    private Switch1 lightSwitch;

    public Light1(Switch1 lightSwitch) {
        this.lightSwitch = lightSwitch;
    }

    public void turnOn() {
        lightSwitch.press();
    }
}
