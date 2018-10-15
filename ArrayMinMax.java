import java.io.*;
	public class ArrayMinMax{
	public static void main (String []args){
		int [] arr={1,9,4,83,-7,2,-9};
		int min=findMin(arr);
		int max=findMax(arr);
		System.out.println("min="+min +"max="+max);
	}
	static int findMin(int []a){
		int min=a[0];
		for (int i=0;i<a.length;i++)
		{
			if(a[i]<min){
				min=a[i];
			}
			
		}
		return min;
		}
		static int findMax(int[]a){
			int max=a[0];
			for (int i=1;i<a.length;i++)
		{
			if(a[i]>max){
				max=a[i];
			}
			;
		}
		return max;
		}
	}