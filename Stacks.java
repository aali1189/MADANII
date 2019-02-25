import java.util.Scanner;

public class Stacks {

static Scanner sc = new Scanner(System.in);
static int size = 0;
static int count =0;
	public static void main(String[] args) {  
		  System.out.print("Enter the size of the Stack: ");
		  size = sc.nextInt();
		  int element[] = new int[size];
		  option(element);
	}
	
static void option(int arr[]) {
	System.out.print("Options:\n[1]PUSH\n[2]POP\n[3]EXIT\n");
	  int op = sc.nextInt();
	  switch(op) {
	  
	    case 1:
		  push(arr);
		  break;
		  
        case 2:
	     pop(arr); 
		 break;
     case 3:
    	 break;
    	 
     default:
    	option(arr);
    	break;
	  }
}
	
	static void push(int arr[]) {
		
		System.out.print("Push a number :");
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
			System.out.println("Sorry,The Stack is Full!");
		}
		count++;
		display(arr);
		
	}

    static void pop(int arr[]) {
    	if(count == 0) {
			System.out.println("Sorry,The Stack is Empty!");
    	}else {
    		arr[count-1] = 0;
            count--;	
    	}
		display(arr);
	}
    
    
    static void display(int arr[]) {
    	System.out.print("Satck :[");
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
    	System.out.print("]\nTOP :"+count+"\n");
    	option(arr);
    }
}
