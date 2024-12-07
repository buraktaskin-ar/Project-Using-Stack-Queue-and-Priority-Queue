package Proje2.data_proje2;

import java.util.Arrays;

public class CustomerPQ {




	public static void main(String[] args) {
		CustomerPQ cpq1 = new CustomerPQ();
		cpq1.dequeAndPrintCusts();
	}

	public static final double PROCESSING_TIME = 2.5;
	int beginningOfQueue;
	int topOfQueue;
	int[] arr = { 10, 4, 8, 6, 7, 1, 15, 9, 3, 2 };

	CustomerPQ(){
		beginningOfQueue = -1;
		topOfQueue = arr.length - 1 ;
	}

	public boolean isFull(){
		if(topOfQueue == arr.length -1 ){
			System.out.println("The queue is full!");
			return true;
		}
		return false;
	}

	public boolean isEmtpy(){
		if(beginningOfQueue == -1){
			System.out.println("The queue is empty!");
			return true;
		}

		return false;
	}

	public void dequeAndPrintCusts(){
		for(int i = 0; i < arr.length; i++) {
			int value = arr[i];
			int j = i - 1;
			while(j >= 0 && arr[j] > value) {
				arr[j + 1] = arr[j];
				j = j - 1;
			}
			arr[j + 1] = value;
		}
		System.out.println(Arrays.toString(arr));
		double totalSeconds = 0;
		int person = 1;
		for(int i = 0 ; i < arr.length; i++) {
			double perCustomerTotal = 0;
			for ( int j = 0; j <= i; j++){
				perCustomerTotal += (double) arr[j] * PROCESSING_TIME;
			}
			totalSeconds += perCustomerTotal;
			System.out.println(person+". customer's transaction completion time" +
				": " + perCustomerTotal +" sn. and the customer has been deleted!");
			person++;
			beginningOfQueue++;
		}
		System.out.println("Average transaction completion time: " +
			(double) totalSeconds  / arr.length);
		if(beginningOfQueue  == topOfQueue){
			System.out.println("All customers have been deleted!");
		}




	}

	}






