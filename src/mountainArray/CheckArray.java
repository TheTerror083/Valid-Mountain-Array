package mountainArray;

public class CheckArray {
	
    public boolean validMountainArray(int[] arr) {
        if(arr.length < 3)
            return false;
        int i = 0;
    while(i < arr.length-1)
    {
      if(arr[i+1] <= arr[i]) //if the number is smaller or equal, abort
      {
          break;
      }
        i++;
    }
        if(i == 0 || i == arr.length-1) // the array should have a climb, a peak and a drop. if this line returns true, the array is lacking one of these conditions and is not a mountain array.
        {
              return false;
        }
        while(i < arr.length-1)
        {
            if(arr[i+1] >= arr[i] || i == 0) // if the numbers rise, abort and return false
            {
                return false;
            }
            i++;
            
        }
        return true;
    }
}
