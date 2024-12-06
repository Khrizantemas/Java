public class Rec {
        public int sumofmults(int a, int b, int k) {
            if (a > b) {
                return 0;
            }
            if (a % k == 0) {
                return a + sumofmults(a + 1, b, k);
            } else {
                return sumofmults(a + 1, b, k);
            }
        }
    }
