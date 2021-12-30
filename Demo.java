public class DuplicArray{

  public static void main(String[] args) {
    int[] arr = {12,55,50,55,99,99,13,13};
    for (int i=0; i<arr.length; i++)
    {
      for (int j=i+1; j<arr.length; j++)
      {
         if(arr[i]==arr[j])
         System.out.println("Hi"+arr[j]);
      }
    }
    }
  }
