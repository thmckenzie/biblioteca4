import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintStream;
import java.util.List;

public class Menu {
    private List<Option> options;
    private final PrintStream printStream;
    private final BufferedReader bufferedReader;

    public Menu(List<Option> options, PrintStream printStream, BufferedReader bufferedReader) {
        this.options = options;
        this.printStream = printStream;
        this.bufferedReader = bufferedReader;
    }


    public void listOptions() {
        printStream.println("Please choose an option:");
        printStream.println("(1) List Books");
    }

    public void performOption() {
        String choice = null;
        try {
            choice = bufferedReader.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
        if(!choice.equals("1")){
            printStream.println("Please choose a valid option");
        }
    }
}
