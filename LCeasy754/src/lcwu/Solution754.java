package lcwu;

public class Solution754 {
	public int reachNumber(int target) {
		target = Math.abs(target);
		int k=0;
		while(target>0){
			target = target-(++k);
		}
		return target%2==0?k:k+1+k%2;
	}
}
