package recursion;

public class isArraySorted {

    public static void main(String args[]) {
        int[] arr = {2, 4, 5, 3, 6, 76, 65, 1, 90};
        int arr2[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        System.out.println(isArrSorted(arr));
        System.out.println(isArrSorted(arr2));
    }

    private static boolean isArrSorted(int[] arr) {
        if(arr.length == 1){
            return true;
        }
        if(arr[0] > arr[1]){
            return false;
        }
        //create a copy of the smaller array i.e. index[1] to index[2]
        //problem with this approach is: Too many copies created increased space complexity
        int[] smallerArr = new int[arr.length - 1];
        for(int i = 1; i < arr.length; i++){
            smallerArr[i - 1] = arr[i];
        }
        return isArrSorted(smallerArr);
    }
}
