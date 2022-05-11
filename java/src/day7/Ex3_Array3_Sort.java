package day7;

public class Ex3_Array3_Sort {

	public static void main(String[] args) {
		/*
		 * 버블정렬을 이용한 배열정렬 예제
		 */
		int arr[] = {10, 15, 5, 18, 20, 1};
		
		for(int i=0; i<arr.length-1;i++) {
			//i가 0일 떄 j는 4까지, i가 1일 때 j는 3까지, i는 2일때 j는 2까지, ...
			for(int j=0; j<arr.length-1-i; j++) {
				//앞 숫자가 크면 두 수 교환
				if(arr[j] > arr[j+1]) {// 부등호 방향만 바꾸면 오름차순 내림차순 바꿀 수 잇음
					int tmp = arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=tmp;
				}
				
			}
			
		}
		for(int i = 0; i<arr.length; i++) {
			System.out.println(arr[i] + " ");
		}
	}

}
