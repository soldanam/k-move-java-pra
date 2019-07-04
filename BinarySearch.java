import java.util.*;
class BinarySearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1,2,3,4,5,6,7,8,9};
		System.out.println("검색할 데이터를 입력");
		Scanner scanner = new Scanner(System.in);
		int search = Integer.parseInt(scanner.nextLine().trim());
		
		binarySearch(arr,search);
	}
	public static void binarySearch(int arr[], int iKey) {
		int mid, left= 0, right =arr.length-1;
		while(right>=left) {
			mid =(right+left)/2;
			if(iKey == arr[mid]) {
				System.out.println(iKey +"is in the array with index value: "+ mid);
				break;
			}
			if(iKey<arr[mid]) {
				right = mid -1;
				System.out.println(iKey +"is in the array with index value: "+ mid);
				
			}
				
			else 
				left= mid+1;
		}
	}

}
