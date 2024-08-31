package creational.abstractFactory;


//The Abstract Factory pattern provides an interface for creating families of related or dependent objects without specifying their concrete classes.

//Example in Java: javax.xml.parsers.DocumentBuilderFactory, javax.xml.transform.TransformerFactory

interface GUIFactory {
    Button createButton();
    Checkbox createCheckbox();
}

class MacOSFactory implements GUIFactory {
    public Button createButton() {
        return new MacOSButton();
    }
    public Checkbox createCheckbox() {
        return new MacOSCheckbox();
    }
}

class WindowsFactory implements GUIFactory {
    public Button createButton() {
        return new WindowsButton();
    }
    public Checkbox createCheckbox() {
        return new WindowsCheckbox();
    }
}


interface Button {
	
}
interface Checkbox {
	
}

class MacOSButton implements Button {
	
}

class WindowsButton implements Button {
	
}

class WindowsCheckbox implements Checkbox {
	
}

class MacOSCheckbox implements Checkbox {
	
}