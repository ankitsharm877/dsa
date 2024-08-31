package Synechron;

public class Round1 {

	public static void main(String[] args) {
//		// racecar, abbdc
//		String s = "apple";
//		//String s = "racecar";
//		//String s = "abbdc";
//
//		// first non repeating char
//		Character[] arr = new Character[s.length()];
//		int i = 0;
//		for (char ch : s.toCharArray()) {
//			arr[i++] = ch;
//		}
//		
//		Optional<Entry<Character, Long>> collect = Arrays.asList(arr).stream()
//				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
//				.entrySet().stream().filter(entry -> entry.getValue() == 1).findFirst();
//		
//		System.out.println(collect);
		
		//123 * (123 / 1000)
		
		String s = "-123.567";
		double num = 0.0;
		boolean isDot = false;
		int div = 1;
		boolean isNegative = false;
		for (char ch : s.toCharArray()) {
			if (ch == '-') {
				isNegative = true;
			} else if (Character.isDigit(ch)) {
				if (isDot) {
					num = num * 10 + (ch - '0');
					div = div * 10;
				} else {
					num = num * 10 + (ch - '0');
				}
			} else if (ch == '.') {
				isDot = true;
			}
		}
		if (div > 1) {
			num =  num / (div);
		}
		if (isNegative) {
			num = num * -1;
		}
		System.out.println(num);

	}
}