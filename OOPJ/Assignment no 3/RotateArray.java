import java.util.Scanner;

class RotateArray {
    // Function to rotate the array to the right by k positions
    static void rotateRight(int arr[], int k) {
        int n = arr.length;
        k = k % n; // Handle cases where k > n

        reverse(arr, 0, n - 1);  // Step 1: Reverse the entire array
        reverse(arr, 0, k - 1);  // Step 2: Reverse the first k elements
        reverse(arr, k, n - 1);  // Step 3: Reverse the remaining elements
    }

    // Helper function to reverse a portion of the array
    static void reverse(int[] arr, int start, int end) {
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        
        // Read array size
        System.out.print("Enter the size of the array: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        // Read array elements
        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // Read k value
        System.out.print("Enter the value of k (rotation count): ");
        int k = sc.nextInt();

        // Rotate the array
        rotateRight(arr, k);

        // Print the rotated array
        System.out.println("Rotated Array:");
        for (int num : arr) {
            System.out.print(num + " ");
        }

        sc.close();
    }
}
