public class Insertionsort {
    public static void main(String[] args) {
        int[] arr = {5,2,4,6,9,5};
        for (int i=1;i<arr.length;i++) {
            int key=arr[i], j=i-1;
            while (j>=0 && arr[j]>key) {
                arr[j+1]=arr[j];
                j--;
            }
            arr[j+1]=key;
        }
        for (int i:arr) System.out.print(i+" ");
    }
}
