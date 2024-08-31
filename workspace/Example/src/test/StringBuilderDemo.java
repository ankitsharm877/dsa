package test;

public class StringBuilderDemo {

	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder();
		sb.append("Leet");
		sb.charAt(0);
		
		String s = "()()";
		
		sb.setCharAt(0, 'a');
		sb.charAt(1);
		
		String str = "sd fds fd sd";
		str = str.replaceAll("sd", "q");
		System.out.println(str);
		
		StringBuilder sb1 = new StringBuilder();
		sb1.append("00123");
		while (sb1.charAt(0) == '0') {
			sb1.deleteCharAt(0);
		}
		System.out.println(sb1.toString());
	}

}
