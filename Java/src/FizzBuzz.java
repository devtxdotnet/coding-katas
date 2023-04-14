public class FizzBuzz {
    public String[] doIt() {
        String[] results = new String[100];
        for (int i = 0; i < 100; i++)
        {
            if ((i + 1)%3 == 0 && (i + 1)%5 == 0)
                results[i] = "FizzBuzz";
            else if ((i + 1)%5 == 0)
                results[i] = "Buzz";
            else if ((i + 1)%3 == 0)
                results[i] = "Fizz";
            else
                results[i] = String.valueOf(i + 1);
        }
        return results;
    }
}
