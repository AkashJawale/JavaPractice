public class ReverseString{
	public static void main (String [] args){
		System.out.println(reverse("String Test"));
	}
	static String reverse (String input){
		char[] arr=input.toCharArray();
		for(int i=0,j=arr.length-1;i<j;i++,j--)
		{
			char t=arr[i];
			arr[i]=arr[j];
			arr[j]=t;
		}
		return new String(arr);
	} 
}