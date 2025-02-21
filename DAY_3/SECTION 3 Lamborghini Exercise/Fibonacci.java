class Fibonacci {
    public static void main(String[] args) {

    int first = 0, second = 1;
    System.out.print("Fibonacci sequence up to 21: " + first + ", " + second);

        for (int next = first + second; next <= 21; next = first + second) {
            System.out.print(", " + next);
            first = second; // Move to next position
            second = next;
        }
}
}