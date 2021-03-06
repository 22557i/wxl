package lcwu;

public class Solution806 {
	public int[] numberOfLines(int[] widths, String S) {
		int lines = 1, width = 0;
		for (char c: S.toCharArray()) {
			int w = widths[c - 'a'];
			width += w;
			if (width > 100) {
				lines++;
				width = w;
			}
		}

		return new int[]{lines, width};
	}
}
