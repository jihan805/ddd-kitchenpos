package camp.nextstep.edu.calculator;

public class StringCalculator {

    public int add(String input) {
        if (input == null || input.isEmpty())
            return 0;

        return Integer.parseInt(input);
    }
}
