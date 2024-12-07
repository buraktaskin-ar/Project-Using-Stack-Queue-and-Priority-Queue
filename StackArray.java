package Proje2.data_proje2;

public class StackArray {
	UmAlanı[] umStList;
	int topOfStack;


	public StackArray(int size) {
		umStList = new UmAlanı[size];
		topOfStack = -1;
		System.out.println("The stack is created!");
	}

	public boolean isEmpty() {
		if (topOfStack == -1) {
			System.out.println("The stack is empty");
			return true;
		}
		//
		return false;
	}

	public boolean isFull() {
		if (topOfStack == umStList.length - 1) {
			System.out.println("The stack is full!");
			return true;
		}
		return false;
	}


	public void push(UmAlanı um) {
		if (isFull()) {
			System.out.println("You cannot insert! The stack is full");
		} else {
			umStList[topOfStack + 1] = um;
			topOfStack++;
			System.out.println("The element has been added.");
		}
	}

	public String pop() {
		if (isEmpty()) {
			System.out.println("There is nothing to delete!");
			return null;
		} else {
			String result = umStList[topOfStack].toString() + "DELETED(STACK)!";
			topOfStack--;
			return result;
		}
	}
}

