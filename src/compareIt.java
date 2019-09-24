import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * compreIt class is a personal project to make my life easier.
 * help me dealing with grading my school assignment.
 * 
 * @author Chaipakon Luangprasert
 * @version <September 2019>
 */
public class compareIt {

    public static void main(String[] args) {
        compareIt(args[0], args[1]);
        // System.out.println(args[0] + " " + args[1]);

    }


    public static void compareIt(String myOut, String profOut) {
        // read in
        try {
            File fil = new File(myOut);
            File fils = new File(profOut);

            Scanner scanner = new Scanner(fil);
            Scanner scanners = new Scanner(fils);
            int count = 0;
            while (scanner.hasNextLine()) {
                count++;
                String line = scanner.nextLine().toLowerCase().trim();
                String lines = scanners.nextLine().toLowerCase().trim();

                if (line.equals(lines)) {
                    System.out.println(count + "Good!");
                }
                else {
                    System.out.println("No Good!");
                }

            }
            scanner.close();
        }
        catch (FileNotFoundException e) {
            System.out.println("can't read in the given file!");
        }
    }

}
