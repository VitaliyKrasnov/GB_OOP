package less7.view;

import java.util.Scanner;

public class EnterDouble implements UserEnter<Double> {
    
    private final Scanner scan = new Scanner(System.in);

    @Override
    public Double enter(String prompt) {
        System.out.println(prompt);
        return scan.nextDouble();
    }

    
}
