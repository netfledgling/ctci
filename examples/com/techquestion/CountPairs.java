import java.lang.Math;

public class CountPairs
{
    public static int countPairs(int[] input, int k) {
        int counter = 0;
        for (int i = 0; i < input.length; i++) {
            for (int j = i+1; j < input.length; j++) {
                if (Math.abs(input[i]-input[j]) == k) {counter++;}
            }
        }
        return counter;
    }
    
	public static void main(String[] args) {
	    int[] input = {1,7,5,9,2,12,3};
	    int count = countPairs(input, 2);
		System.out.println("The number of pairs in the given array with difference k are: " + count);
	}
}
