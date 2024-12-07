package Proje2.data_proje2;

import java.util.ArrayList;
import java.util.List;

public class PriorityQueue {


	List<UmAlanı> umList = new ArrayList<>();
	int topOfQueue;
	int beginningOfQueue;

	PriorityQueue(){
		topOfQueue = beginningOfQueue = -1;
		System.out.println("Priority Queue  has been created!");

	}


	public boolean isFull(){
		if(topOfQueue == umList.size() -1 ){
			return true;
		}
		else {
			return false;
		}

	}

	public boolean isEmpty(){
		if(topOfQueue == -1 ){
			return true;
		}
		else {
			return false;
		}
	}

	public void enqueu(UmAlanı um1){
		umList.add(um1);
		System.out.println("The object has been added");
		//System.out.println(um1.name);
		if(umList.size() == 21){
			System.out.println("All objects have been added!");
		}
	}

	public void deq(){

		for(int i = 1; i < umList.size(); i++) {
			Character value = umList.get(i).name.charAt(0);
			UmAlanı a1 = umList.get(i);
			int j = i -1;
			while(j >= 0 && umList.get(j).name.charAt(0) > value){
				umList.set(j+1,umList.get(j));
				j = j-1;
			}
			umList.set(j+1,a1);

		}
		for (int i = 0; i < umList.size(); i++){
			String um = umList.get(i).toString() + "DELETED FROM PQ";
			System.out.println(um);
		}
	}

















}
