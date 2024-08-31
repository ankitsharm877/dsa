package contest399;

public class Questions2 {

	public static void main(String[] args) {
		String word = "abcde";
		System.out.println(compressedString(word));
	}
	public static String compressedString(String word) {
        StringBuilder sb = new StringBuilder();
        // LinkedHashMap<Character, Integer> hm = new LinkedHashMap<>();
        // for (char c : word.toCharArray()) {
        //     hm.put(c, hm.getOrDefault(c, 0) + 1);
        // }
        // for (Map.Entry<Character, Integer> entry : hm.entrySet()) {
        //     if (entry.getValue() > 9) {
        //         int x = entry.getValue();
        //         while (x > 9) {
        //             sb.append(9);
        //             sb.append(entry.getKey());
        //             x = x - 9;
        //         }
        //         sb.append(x);
        //         sb.append(entry.getKey());
        //     } else {
        //         sb.append(entry.getValue());
        //         sb.append(entry.getKey());
        //     }
        // }
        char[] arr = word.toCharArray();
        for (int i = 0; i < arr.length; i++) {
            if ((i + 1) < arr.length && arr[i] == arr[i + 1]) {
                int x = 1;
                char c = arr[i];
                while ((i + 1) < arr.length && arr[i] == arr[i + 1]) {
                    x++;
                    i++;
                }
                while (x > 9) {
                    sb.append(9);
                    sb.append(c);
                    x = x - 9;
                }
                sb.append(x);
                sb.append(c);
            } else {
                sb.append(1);
                sb.append(arr[i]);
            }
        }
        return sb.toString();
    }
}
