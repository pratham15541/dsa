class Solution {
    public ArrayList<Integer> findDivisor(int num) {
        ArrayList<Integer> divisor = new ArrayList<>();
        for (int i = 1; i <= (int) Math.sqrt(num); i++) {
            if (num % i == 0) {
                divisor.add(i);
                if (i != (num / i) && num != (num/i))
                    divisor.add((int) (num / i));
            }

        }

        return divisor;
    }

    public boolean checkPerfectNumber(int num) {
        if (num <= 1) return false;
        ArrayList<Integer> divisor = findDivisor(num);
        int sum = 0;
        for (int i : divisor) {

            sum += i;
            System.out.println(i);
        }
      
        return sum == num;
    }
}