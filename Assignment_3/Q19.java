class Test {
    public static void main(String[] args) {
        
        int arr[] = { 1, 2, 3, 4, 5 };
        int search = 6;

        
        try {
            for (int i = 0; i <= arr.length; i++) {
                if (arr[i] == search) {
                    System.out.println("Element found at index: " + i);
                    break;
                }
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e);
        }
    }
}
