package less7.view;

import java.util.Scanner;

public class EnterString implements UserEnter<String> {

    private final Scanner scan = new Scanner(System.in);

    @Override
    public String enter(String prompt) {
        System.out.println(prompt);
        return scan.next() ;
    }

}
