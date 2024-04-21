package ArrayAssignment;

public class mainArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		calculationArray Array = new calculationArray();
		int[] elements = Array.getArr();

		Array.displayArr(elements);

		int max = Array.MaxEle(elements);
		System.out.println("max of elements is : " + max);

		int sum = Array.SumEle(elements);
		System.out.println("sum of all elements : " + sum);

		double avg = Array.avgEle(elements);
		System.out.println("average of all elements : " + avg);

		Array.sort(elements);
	}

}
