public class Main {
    public static void increment(int arr[]) {
        for (int i = 0 ; i < 5 ; i++) {
            arr[i]++;
        }
    }
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5};
        increment(arr);
        for (int i = 0 ; i < 5 ; i++) {
            System.out.println(arr[i]);
        }
    }
}