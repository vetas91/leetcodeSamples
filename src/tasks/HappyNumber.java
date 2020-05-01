package tasks;

/**
 * Total 47 min
 */
public class HappyNumber {


    public boolean isHappy(int n) {
        return separete(n) == 1;
    }

    public int separete(int number) {
        int result = number;
        while (result >= 10){
            result = separateAndSqr(result);
        }

        if (result == 7){
            return 1;
        }
        return result;
    }


    public int separateAndSqr(int number) {
        int result = number;
        int sum =0;
        while (result / 10 >= 1) {
           sum += (result  % 10) * (result  % 10) ;
           result = result / 10;
        }
        sum += (result  % 10) * (result  % 10) ;
        return sum;
    }

    private static class HappyNumberSlow {
        public boolean isHappy(int n) {
            return separete(n) == 1;
        }


        public int separete(int number) {
            // less then 10 should be returned
            if (number / 10f < 1){
                if (number == 7){
                    return 1;
                }
                return number;
            }

            return separete(separateByString(number));

        }

        private static final String SPLIT = "";

        public int separateByString(int number) {
            String[] numberArray =  Integer.valueOf(number).toString().split(SPLIT);
            int result = 0;
            for (String ch : numberArray){
                final int sign = Integer.parseInt(ch);
                result += sign*sign;
            }
            return result;
        }

    }

}
