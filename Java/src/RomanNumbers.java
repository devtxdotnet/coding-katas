import java.util.ArrayList;

public class RomanNumbers {
    ArrayList<Integer> allNumberValues;
    public int convertToRoman(String romanNumber) {
        char[] romanNumberChars = romanNumber.toCharArray();
        allNumberValues = new ArrayList<>();

        for(char character : romanNumberChars) {
            switch (character) {
                case 'I' -> allNumberValues.add(1);
                case 'V' -> allNumberValues.add(5);
                case 'X' -> allNumberValues.add(10);
                case 'L' -> allNumberValues.add(50);
                case 'C' -> allNumberValues.add(100);
                case 'D' -> allNumberValues.add(500);
                case 'M' -> allNumberValues.add(1000);
            }
        }

        return parseNumbers();
    }

    private int parseNumbers() {
        int result = 0;
        int i = 0;
        while (i < allNumberValues.size()) {
            int entry = allNumberValues.get(i);
            int nextEntry = (i == allNumberValues.size() - 1) ? 0 : allNumberValues.get(i + 1);

            if ((entry != 5) && nextEntry > entry && entry != 0) {
                entry = nextEntry - entry;
                i += 2;
            } else {
                i++;
            }
            result += entry;
        }
        return result;
    }
}
