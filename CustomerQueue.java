package Proje2.data_proje2;

public class CustomerQueue {
	public static final double PROCESSING_TIME = 2.5;
	int topOfQueue;
	int beginningOfQueue;
	int[] arr = { 10, 4, 8, 6, 7, 1, 15, 9, 3, 2 };


	CustomerQueue(){
		beginningOfQueue = -1;
		topOfQueue = arr.length - 1 ;
		System.out.println("Customer queue is succesfully created.");
	}


	public static void main(String[] args) {
		CustomerQueue cq = new CustomerQueue();
		cq.calcProcessTime();
	}

	public void calcProcessTime(){
		int totalSeconds = 0;



		int person = 1;
		for(int i = 0 ; i < arr.length; i++) {
			int perCustomerTotal = 0;
			for ( int j = 0; j <= i; j++){
				perCustomerTotal += arr[j] * PROCESSING_TIME;
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



}
















