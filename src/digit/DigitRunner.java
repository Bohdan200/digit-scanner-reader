package digit;

import digit.input.FileNumberReader;
import digit.input.KeyboardNumberReader;
import digit.input.NumberReader;
import digit.input.StringNumberReader;
import digit.output.DigitPrinter;
import digit.output.SevenSegmentDigitPrinter;
import digit.output.SimpleDigitPrinter;
import digit.splitter.DigitSplitter;


public class DigitRunner {
    public static void main(String[] args) {
        NumberReader numberReader1 = new KeyboardNumberReader();
        NumberReader numberReader2 = new FileNumberReader("input.txt");
        NumberReader numberReader3 = new StringNumberReader("167");
        DigitSplitter digitSplitter = new DigitSplitter();
        DigitPrinter digitPrinter = new SevenSegmentDigitPrinter();
        DigitPrinter numberPrinter = new SimpleDigitPrinter();

        // Enter number in command line
        int number1 = numberReader1.readNumber();
        Digit[] digits1 = digitSplitter.split(number1);
        numberPrinter.print(digits1);
        digitPrinter.print(digits1);

        // 456
        int number2 = numberReader2.readNumber();
        Digit[] digits2 = digitSplitter.split(number2);
        numberPrinter.print(digits2);
        digitPrinter.print(digits2);


        // 167
        int number3 = numberReader3.readNumber();
        Digit[] digits3 = digitSplitter.split(number3);
        numberPrinter.print(digits3);
        digitPrinter.print(digits3);
    }
}
