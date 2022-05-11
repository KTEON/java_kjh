package day7;

public class Ex4_Array4_Copy {

	public static void main(String[] args) {
		/*
		 * arr2 배열을 생성하여 arr1 배열을 복사하고, arr2배열값을 출력하세요.
		 */
		int arr1[] = {1,4,6,8};
		int arr2[] = new int[arr1.length];
		int arr3[] = arr1;
		for(int i = 0; i<arr1.length; i++) {
			arr2[i] = arr1[i];			
		}
		for(int i=0; i<arr2.length; i++) {
			System.out.print(arr2[i] + " ");
		}
		System.out.println();
	}

}
