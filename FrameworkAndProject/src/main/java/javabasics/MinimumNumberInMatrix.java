package javabasics;

public abstract class MinimumNumberInMatrix {

	public static void main(String[] args) {
//		int a[][]= {{2,5,7},{4,1,8},{6,9,3}};
//
//		int min=a[0][0];
//		for(int i=0;i<a.length;i++) {
//			for(int j=0;j<a.length;j++) {
//				if(a[i][j]<min) {
//					min=a[i][j];
//				}
//			}
//
//		}
//		System.out.println(min);
		
		int a[][]= {{2,5,7},{4,1,8},{6,9,3}};

		int max=a[0][0];
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a.length;j++) {
				if(a[i][j]>max) {
					max=a[i][j];
				}
			}

		}
		System.out.println(max);
		
		
		
		
		
	}

}
