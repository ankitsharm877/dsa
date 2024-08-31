package sap1.sap7;

public class RLUCaching {
	String key;
	String value;
	int noOfUsage;
	
	public RLUCaching(String key, String value) {
		this.key = key;
		this.value = value;
		this.noOfUsage = 0;
	}

	@Override
	public String toString() {
		return "RLUCaching [key=" + key + ", value=" + value + ", noOfUsage=" + noOfUsage + "]";
	}
}
