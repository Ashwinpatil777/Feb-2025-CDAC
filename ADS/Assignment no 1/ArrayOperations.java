import java.util.Scanner;
class ArrayOperations {
    static int secondLargest(int arr[]){
       int first = arr[0];
       int second =arr[0];
 
    for(int num : arr){
      if(num > first){
           second = first;
            first = num;
        }else if(num > second && num != first){
                 second = num;

}
    }


return second;


}
  static void moveZerotoEnd(int arr[]){
     int index =0;
    
for(int num : arr){
   if(num != 0){
    arr[index++] = num;
    } 
  }
 while(index <arr.length){
    arr[index++]=0;
 
   }
}

 static void printArray(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
}

public static void main(String arg[]){
  Scanner sc= new Scanner(System.in);
  System.out.println("Enter the size of array: ");
    int n = sc.nextInt();

int arr[] = new int[n];
 System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
 int second = secondLargest(arr);
        System.out.println("Second largest element: " + second);

        // Move zeros
        moveZerotoEnd(arr);
        System.out.print("Array after moving zeros to end: ");
        printArray(arr);
}
}