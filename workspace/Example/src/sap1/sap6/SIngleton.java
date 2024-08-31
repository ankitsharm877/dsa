package sap1.sap6;

public class SIngleton {
	static SIngleton sIngleton = null;

	public static SIngleton getObject() {
		if (sIngleton == null) {
			sIngleton = new SIngleton();
		}
		return sIngleton;
	} 
}
