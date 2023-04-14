import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RomanNumbersTests {
    @Test
    public void isIEqualTo1(){
        RomanNumbers romanNumbers = new RomanNumbers();
        int convertToRomanResult = romanNumbers.convertToRoman("I");
        assertEquals(1, convertToRomanResult);
    }

    @Test
    public void isIIEqualTo2(){
        RomanNumbers romanNumbers = new RomanNumbers();
        int convertToRomanResult = romanNumbers.convertToRoman("II");
        assertEquals(2, convertToRomanResult);
    }
    @Test
    public void isIIIEqualTo3(){
        RomanNumbers romanNumbers = new RomanNumbers();
        int convertToRomanResult = romanNumbers.convertToRoman("III");
        assertEquals(3, convertToRomanResult);
    }

    @Test
    public void isVEqualTo5(){
        RomanNumbers romanNumbers = new RomanNumbers();
        int convertToRomanResult = romanNumbers.convertToRoman("V");
        assertEquals(5, convertToRomanResult);
    }

    @Test
    public void isXEqualTo10(){
        RomanNumbers romanNumbers = new RomanNumbers();
        int convertToRomanResult = romanNumbers.convertToRoman("X");
        assertEquals(10, convertToRomanResult);
    }

    @Test
    public void isXIIEqualTo12(){
        RomanNumbers romanNumbers = new RomanNumbers();
        int convertToRomanResult = romanNumbers.convertToRoman("XII");
        assertEquals(12, convertToRomanResult);
    }

    @Test
    public void isIVEqualTo9(){
        RomanNumbers romanNumbers = new RomanNumbers();
        int convertToRomanResult = romanNumbers.convertToRoman("IX");
        assertEquals(9, convertToRomanResult);
    }

    @Test
    public void isMMXIIIEqualTo2013(){
        RomanNumbers romanNumbers = new RomanNumbers();
        int convertToRomanResult = romanNumbers.convertToRoman("MMXIII");
        assertEquals(2013, convertToRomanResult);
    }

    // „XCIX“ -> 99
    @Test
    public void isXCIXEqualTo99(){
        RomanNumbers romanNumbers = new RomanNumbers();
        int convertToRomanResult = romanNumbers.convertToRoman("XCIX");
        assertEquals(99, convertToRomanResult);
    }

    @Test
    public void isCMXCIXEqualTo999(){
        RomanNumbers romanNumbers = new RomanNumbers();
        int convertToRomanResult = romanNumbers.convertToRoman("CMXCIX");
        assertEquals(999, convertToRomanResult);
    }

    @Test
    public void isCMXCIVEqualTo994(){
        RomanNumbers romanNumbers = new RomanNumbers();
        int convertToRomanResult = romanNumbers.convertToRoman("CMXCIV");
        assertEquals(994, convertToRomanResult);
    }

    @Test
    public void isXLIIEqualTo42(){
        RomanNumbers romanNumbers = new RomanNumbers();
        int convertToRomanResult = romanNumbers.convertToRoman("XLII");
        assertEquals(42, convertToRomanResult);
    }
}
