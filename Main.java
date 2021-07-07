public class Main {
    public static void main(String[] args) {
        int[] num = {1, 2, 3, 4, 100, -5, -10, 7};
        System.out.println(largestContSum(num));

    }
    private static int largestContSum(int[] arr){
        int temp = arr[0];
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
            if(sum >= temp){
                temp = sum;
            }


        }
        return temp;
    }
}
