
package stacks;


public class swap {
    
    
    public static void main(String[] args){
    
    int arr[] = {1,0,2,4,0};
    
     for(int i=0; i<arr.length;i++){
    for(int j=0; j<arr.length; j++){
    if(arr[j] == 0){
     arr[i] = arr[i] + arr[j];
     arr[j] = arr[i] - arr[j];
     arr[i] = arr[i] - arr[j];   
    }
    
    }
    
    }
     
     for(int i=0; i<arr.length; i++){
     System.out.print(arr[i] + " ");
     
     }
    
    }
}
