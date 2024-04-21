package ArrayAssignment;

import java.util.Scanner;

public class calculationArray {
	Scanner scan = new Scanner(System.in);

//create array function to pass values to MAIN
	public int[] getArr() {
		System.out.println("enter the size of array : ");
		int size = scan.nextInt();

		int[] ele = new int[size];

		System.out.println("enter the elements = ");

		for (int i = 0; i < size; i++) {
			System.out.println("element " + (i + 1) + ": ");
			ele[i] = scan.nextInt();
		}

		return ele;
	}

	public void displayArr(int[] ele) {
		System.out.println("array = ");
		for (int i = 0; i < ele.length; i++) {
			System.out.println(ele[i]);
		}
	}

	int sum = 0;

	public int SumEle(int[] ele) {
		for (int i = 0; i < ele.length; i++) {
			sum = sum + ele[i];
		}
		return sum;
	}

	public int MaxEle(int[] ele) {
		int max = ele[0];
		for (int i = 0; i < ele.length; i++) {
			if (max < ele[i]) {
				max = ele[i];
			}
		}
		return max;
	}

	public double avgEle(int[] ele) {
		double avg = sum / ele.length;
		return avg;
	}

	public void sort(int[] ele) {
		for (int i = 0; i < ele.length - 1; i++) {
			for (int j = 0; j < ele.length - i - 1; j++) {
				if (ele[j] > ele[j + 1]) {
					int temp = ele[j];
					ele[j] = ele[j + 1];
					ele[j + 1] = temp;
				}
			}
		}
		System.out.println("sorting array : ");
		for (int i = 0; i < ele.length; i++) {
			System.out.println(ele[i]);
		}

	}

}
