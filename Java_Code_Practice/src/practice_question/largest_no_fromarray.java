package practice_question;

public class largest_no_fromarray {
public static void main(String[] args) {
	
	int arr[]= {10,34,65,78,64,90};
	int max=arr[0];
	for(int i=1;i<arr.length;i++) {
		if(arr[i]>max) {
			max=arr[i];
			}
}
	System.out.println(max);
}
}
