import java.util.Scanner;


public class Queues {
  
static Scanner sc = new Scanner(System.in);
static int size = 0;
static int count =0;
static int d = 0;
	public static void main(String[] args) {  
		  System.out.print("Enter the size of the Queue: ");
		  size = sc.nextInt();
		  int element[] = new int[size];
		  option(element);
	}
	
static void option(int arr[]) {
	System.out.print("Options:\n[1]Insert\n[2]Delete\n[3]EXIT\n");
	  int op = sc.nextInt();
	  switch(op) {
	  
	    case 1:
		  insert(arr);
		  break;
		  
        case 2:
	     delete(arr); 
		 break;
     case 3:
    	 break;
    	 
     default:
    	option(arr);
    	break;
	  }
}
	
	static void insert(int arr[]) {
		
		System.out.print("Insert a number :");
		int stack = sc.nextInt();
		if(count < arr.length) {
			for(int i =0; i<arr.length; i++) {
				if(arr[i] == 0) {
					arr[i] = stack;
					break;
				}
			}
		} else {
			count--;
			System.out.println("Sorry,The Queue is Full!");
		}
		count++;
		display(arr);
		
	}

    static void delete(int arr[]) {
    	if(count == 0) {
	  System.out.println("Sorry,The Queue is Empty!");
    	}else {
    		arr[0] = 0;
                 count--;	
    	}
       swap(arr);
		display(arr);
	}
    
    
    static void display(int arr[]) {
    	System.out.print("Queue :[");
    	for(int i =0;i<arr.length; i++) {
    		if(arr[i] == 0) {
    			break;
    		}else {
    			if(i <= count-2) {
    	           System.out.print(arr[i]+",");
    	          }else {
    	           System.out.print(arr[i]);	
    			}
    		}
    	}
    	System.out.print("]\nREAR :"+count+"\n");
    	option(arr);
    }  
    
    
    static void swap (int arr[]){
    for(int i=0; i<arr.length;i++){
    for(int j=0; j<arr.length; j++){
    if(arr[j] == 0){
     arr[i] = arr[i] + arr[j];
     arr[j] = arr[i] - arr[j];
     arr[i] = arr[i] - arr[j];   
    }
    
    }
    
    }
    
    }
}
