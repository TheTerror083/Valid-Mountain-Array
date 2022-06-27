package mountainArray;

public class Exec {
	
	public static void main(String[] args) {
		CheckArray chk = new CheckArray();
		int[] arr = new int[args.length];
		int i = 0;
		while(i < args.length)
		{
			arr[i] = Integer.parseInt(args[i]);		//covert the argument array to int array.
			i++;
		}
		System.out.println(chk.validMountainArray(arr));
	}
}
