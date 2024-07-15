package less7;

import less7.controller.Controller;
import less7.controller.EndProgramException;

public class Program {

    private Controller controller = new Controller();

    public static void main(String[] args) {
        Program program = new Program();
        program.run();
    }

    private void run() {
        while (true) {
            try {
                controller.run();
            } catch(UnsupportedOperationException ex) {
                System.out.println("Введена неподдерживаемая операция, завершаем работу калькулятора!");
                break;
            } catch (EndProgramException ex) {
                System.out.println("Завершаем работу калькулятора. Спасибо, что воспользовались нашей программой!");
                break;
            }
        }
    }


}
