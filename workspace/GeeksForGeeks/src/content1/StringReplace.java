package content1;

public class StringReplace {

	public static void main(String[] args) {
		String str = String.valueOf("abab");
		int ans = 0;
        while (str.contains("ab")) {
            str = str.replaceFirst("ab", "bba");
            ans++;
        }
        System.out.println(ans);
	}

}
