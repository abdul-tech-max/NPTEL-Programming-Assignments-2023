import java.util.Scanner;
public class Exercise1_5{
    public static void main(String[] args) {
	 Scanner input = new Scanner(System.in);
         double mark_avg;
         int result;
         int i;
         int s;
      //define size of array
       s = input.nextInt();
     //The array is defined "arr" and inserted marks into it.
      int[] arr = new int[s];   
      for(i=0;i<arr.length;i++)
	  {
	arr[i]=input.nextInt();
        }
      //Initialize maximum element as firkmst element of the array.  
   //Traverse array elements to get the current max.
   //Store the highest mark in the variable result.
   //Store average mark in avgMarks.

int max=arr[0];
for(int j=0;j<arr.length;j++){
  if(max<arr[j]) max=arr[j];
}
System.out.println(max);
mark_avg=0;
int sum=0;
for(int j=0;j<arr.length;j++){
  sum+=arr[j];
}
mark_avg=sum/arr.length;
System.out.println(mark_avg);
      
    }
}
