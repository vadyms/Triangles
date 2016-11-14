import java.util.Arrays;

public class Program {
	static double[] sides = {8, 1, 8, 3, 8, 4};
	
	public static void main(String[] args) {
		Arrays.sort(sides);
		for (int m=0;m<sides.length;m++) {
			double pair=0;
			if (sides.length-2>m) {
				if ((sides[m]==sides[m+1])&&(sides[m])!=0) {
					pair=sides[m];
					sides[m] = 0;
					sides[m+1] = 0;
				}
				for (int n=0;n<sides.length;n++) {
					if ((sides[n]<2*pair)&&(sides[n]!=0)&&((n!=m)||(n!=m+1))) {
						System.out.println(pair+","+pair+","+sides[n]);
					}
					if (sides[n]==pair) {
						for(int l=0;l<sides.length;l++){
							if (sides[l]==pair) {
								sides[l]=0;	
							}
						}
					}
				}
			}
		}
	}
}
