
import java.util.Scanner;
public class MeansModeSum {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int size = 0; // Size get from user input 
        System.out.print("Enter number of elements : "); // Display msg  
        size = sc.nextInt(); // Initializes hhe size
        int num[] = new int[size]; //array of elements
        for(int i=0; i<num.length; i++){ 
          System.out.print("Enter a number " +(i+1)+" : ");
          num[i] = sc.nextInt();

        }

       


    // this prints out the three methods arguments,parameter
        System.out.print("\nSum is :  " +sum(num) + "\nMean is : "+ mean(num) + "\nMode is : " + mode(num) + "\n");
      
    }

    static int sum(int[] arr){
    	int Sum = 0;
 for(int i=0; i<arr.length; i++){
 Sum += arr[i]; // this is sum of each elements
        }

return Sum; // gets sum 
    }


      static double mean(int[] arr){
    	double Mean = 0;
        int length = arr.length;
 for(int i=0; i<arr.length; i++){
 Mean += arr[i];
        }

return (double)(Mean / length);
    }
   

    static int mode(int[] arr){
    	int Mode[]  = new int[arr.length];
       

       int maxValue =0 , maxCount =0;

    for (int i = 0; i < arr.length; ++i) {
        int count = 0;
        for (int j = 0; j < arr.length; ++j) {
            if (arr[j] == arr[i]) ++count;
        }
        if (count > maxCount) {
            maxCount = count;
            maxValue = arr[i];
        }
    }

    return maxValue;
    }
    
}
