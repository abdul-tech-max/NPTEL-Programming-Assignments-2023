import java.util.Scanner;
public class Exercise1_4 {
public static void main(String[] args) {
	   Scanner sc = new Scanner(System.in);
	   int n=sc.nextInt();
     int result=0;
//Use while loop check the number is Armstrong or not.
//store the output(1 or 0) in result variable.

int remainder;
int original=n;
while(original!=0){
  remainder = original % 10;
  result += Math.pow(remainder, 3);
  original /= 10;
  
}
System.out.println(result==n?1:0);
}
}
