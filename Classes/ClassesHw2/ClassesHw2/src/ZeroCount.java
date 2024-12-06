public class ZeroCount {
    public int CountZeros(int num) {
        if (num == 0) {
            return 1;
        }
        if (num < 10) {
            return 0;
        }
        return (num % 10  == 0 ? 1 :  0  ) + CountZeros (num / 10);
    }

    public void checkZero(int number) {
        int zeroCount = CountZeros(number);
        if (zeroCount % 2 == 0) {
            System.out.println("num of zeros is even : " + zeroCount);
        } else {
            System.out.println("num of zeros is odd :   " + zeroCount);
        }
    }
}
