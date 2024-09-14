package javabasics;

public class MinMaxSameColumn {

	public static void main(String[] args) {
		
//		// same column min and mix number
//		int a[][]= {{2,5,7},{4,9,8},{6,3,1}};
//
//		int min=a[0][0];
//		int mincol = 0;
//		for(int i=0;i<a.length;i++) {
//			for(int j=0;j<a.length;j++) {
//				if(a[i][j]<min) {
//					min=a[i][j];
//					mincol=j;//column of min number
//					System.out.println(min);
//				}
//			}
//
//		}
//		int max=a[0][mincol];
//		int k = 0;
//		while(k<3)
//		{
//		if(a[k][mincol]>max)
//		{
//		max=a[k][mincol];
//		}
//		k++;
//		}
//		System.out.println(max);

		
		int abc[][]= {{2,5,7},{4,9,8},{6,3,1}};
		int min=abc[0][0];
		int mincoloumn = 0;


		for(int i=0;i<3;i++)
		{
		for(int j=0;j<3;j++)
		{
		if(abc[i][j]<min)//2
		{
		min=abc[i][j];
		mincoloumn=j;
		System.out.println(min);
		}
		}
		}
		//=1
		int max=abc[0][mincoloumn];
		int k = 0;
		while(k<3)
		{
		if(abc[k][mincoloumn]>max)
		{
		max=abc[k][mincoloumn];
		}
		k++;
		}

		System.out.println(max);
	}

}
