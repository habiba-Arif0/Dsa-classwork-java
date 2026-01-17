public class BinarySearchRecursion {


    static int binarySearch(int[] arr, int left, int right, int key) {
        if (left > right)
            return -1;

        int mid = (left + right) / 2;

        if (arr[mid] == key)
            return mid;
        else if (key < arr[mid])
            return binarySearch(arr, left, mid - 1, key);
        else
            return binarySearch(arr, mid + 1, right, key);
    }

    public static void main(String[] args) {
        int[] arr = {2, 4, 6, 8, 10, 12};
        int key = 8;

        int result = binarySearch(arr, 0, arr.length - 1, key);

        if (result == -1)
            System.out.println("Element not found");
        else
            System.out.println("Element found at index " + result);
    }
}
