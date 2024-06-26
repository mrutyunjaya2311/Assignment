class Test {
    public static void main(String[] args) {
        int arr[] = new int[5];
        recursive(arr, 5);
        System.out.println("End of Program");
    }

    static void recursive(int arr[], int n) {
        try {
            if (n < 0) {
                throw new ArrayIndexOutOfBoundsException("Index can't be negative");
            }
            System.out.println(arr[n - 1]);
            recursive(arr, n - 1);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e);
        }
    }
}
