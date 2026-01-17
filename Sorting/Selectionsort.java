public class Selectionsort {
    public static void main(String[] args) {
        int[] arr = {4,3,9,1,8};
        for (int i=0;i<arr.length;i++) {
            int min=i;
            for (int j=i+1;j<arr.length;j++)
                if (arr[j]<arr[min]) min=j;
            int t=arr[min];
            arr[min]=arr[i];
            arr[i]=t;
        }
        for (int i:arr) System.out.print(i+" ");
    }
}
