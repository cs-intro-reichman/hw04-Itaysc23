public class Primes {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        boolean[] isPrime = new boolean[n + 1];
        for (int i = 0; i <= n; i++) {
            isPrime[i] = true;
        }

        int p = 2;
        while (p <= Math.sqrt(n)) {
            if (isPrime[p] == true) {
                int multiple = p * p;
                while (multiple <= n) {
                    isPrime[multiple] = false;
                    multiple = multiple + p;
                }
            }
            p++;
        }
        System.out.println("Prime numbers up to " + n + ":");
        int count = 0;
        for (int i = 2; i <= n; i++) {
            if (isPrime[i] == true) {
                System.out.println(i);
                count++;
            }
        }
        double percentage = (double) count * 100 / n;
        System.out.println("There are " + count + " primes between 2 and " + n +
                " (" + (int) percentage + "% are primes)");
    }
}
