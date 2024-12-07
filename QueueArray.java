package Proje2.data_proje2;
public class QueueArray {
	UmAlanı [] umList;
	int topOfQueue;
	int beginningOfQueue;


	 QueueArray(int size){
		 umList = new UmAlanı[size];
		 beginningOfQueue = topOfQueue = -1;
		 System.out.println("Queue is succesfully created.");
	 }

	 public boolean isFull(){
		 if(topOfQueue == umList.length -1 ){
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

	 public void enque(UmAlanı um){
		 if(isFull()){
			 System.out.println("The queue is full! You cannot insert!");
		 }
		 else {
			 topOfQueue++;
			 beginningOfQueue = 0;
			 umList[topOfQueue] = um;
			 System.out.println("The item has been inserted!");
		 }
	}

	 public  String deque(){
		 if(isEmtpy()){
			 return "is no element to delete!";
		 }
		 else {
			 String result = umList[beginningOfQueue].toString() + "DELETED!(QUEUE)";
			 beginningOfQueue++;
			 if(beginningOfQueue > topOfQueue){
				 beginningOfQueue = topOfQueue = -1;
			 }
			return result;
		 }
	 }
}
