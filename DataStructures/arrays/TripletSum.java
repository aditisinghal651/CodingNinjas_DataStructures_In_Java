package arrays;

public class TripletSum {
    public static int tripletSum(int arr[], int x){
        int count = 0;

        for(int i = 0; i < arr.length; i++){
            for(int j = i+1; j < arr.length; j++){
                int sum = 0;
                for(int k = j+1; k < arr.length; k++){
                    sum = arr[i] + arr[j]+ arr[k];
                    if(sum == x){
                        count++;
                    }
                }
            }
        }
        return count;
    }

    public static void main(String args[]){
        int arr[] = {2, -5, 8, -6, 0, 5, 10, 11, -3};
        int ans = tripletSum(arr, 10);
        System.out.print(ans);
    }
}
