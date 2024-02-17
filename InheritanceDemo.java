import java.util.Scanner;

/**
 * @author Override
 * @see <a href="https://github.com/TuringProblem">GitHub Profile</a>
 * @since 02/17/2024 @ 18:06
 */
public class InheritanceDemo {
    static Scanner KEYBOARD = new Scanner(System.in);

    public static void main(String[] args) {
        Student s = new Student();
        System.out.println("What is your name: ");
        s.setName(KEYBOARD.nextLine());
        System.out.println("what is your student number: ");
        s.setStudentNumber(KEYBOARD.nextInt());
        System.out.println("what is your SSN: ");
        s.setSSN(KEYBOARD.nextInt());
        KEYBOARD.nextLine();//for the next line

        System.out.println("what is your major: ");
        s.setMajor(KEYBOARD.nextLine());

        System.out.printf("Name: %s\n Student Number: %d\n SSN: %d\n Major: %s\n", s.getName(), s.getStudentNumber(), s.getSSN(), s.getMajor());

        s.setName("Warren Peace");
        s.setStudentNumber(1234);
        s.setSSN(1234567890);
        s.setMajor("Science");
        s.writeOutput();
    }
}
