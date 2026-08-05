
public class PairSum {
    public PairSum() {
    }

    public static int  doublateCount (int arr[],int target) {
        int sum = 0;
        for (int i=0;i< arr.length;i++){
            for (int j = i+1;j< arr.length){

              sum = arr[i]+arr[j];
              if(sum == target )
                  System.out.println(arr[i]+","+arr[j]);

            }

        }
        return  target;

        }



    public static void main(String[] args) {
        int arr [] = [2,5,5.9,5]
        System.out.println( doublateCount ());
    }
}
