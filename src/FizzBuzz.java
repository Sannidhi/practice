// Evil FizzBuzz kata from https://github.com/stride-nyc/evil-fizz-buzz

public class FizzBuzz {
    public String play(int input) {
        StringBuilder result = new StringBuilder();
        for (int i = 1; i <= input; i++) {
            result.append(compute(i));
            if (i <= input - 1) {
                result.append(", ");
            }
        }
        return result.substring(0);
    }

    protected String compute(int i) {
        String value = String.valueOf(i);
        if (i % 5 == 0 && i % 3 == 0) {
            return "FizzBuzz";
        }
        if (i % 3 == 0) {
            value = "Fizz";
        }
        if (i % 5 == 0) {
            value = "Buzz";
        }

        if(isPrime(i)) {
            if(value.equals(String.valueOf(i))) {
                value = "Wizz";
            }
            else {
                value = value+"Wizz";
            }
        }
        return value;
    }

    private boolean isPrime(int number) {
        for (int i = 2; i <= number / 2; i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return number != 1;
    }
}
