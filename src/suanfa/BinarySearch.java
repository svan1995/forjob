package suanfa;

public class BinarySearch {

    public static int binarySearch(int[] array, int key){
        int left = 0;
        int right = array.length - 1;
        int mid;
        while (right >= left){
            mid = (right + left) / 2;
            if (array[mid] == key){
                return mid;
            }
            else if (key < array[mid]){
                right = mid-1;
            }
            else {
                left = mid+1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] a = new int[] {1,2,3,6,8,22,41,62,76};
        System.out.println(binarySearch(a, 6));
    }
}
