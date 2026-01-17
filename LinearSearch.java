public class LinearSearch {
    public static void main(String[] args) {
        int[] arr = {5,8,2,9};
        int key = 2;

        for (int i = 0; i < arr.length; i++)
            if (arr[i] == key)
                System.out.println("Found at index " + i);
    }
}
