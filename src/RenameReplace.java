import java.util.Scanner;

public class RenameReplace {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a value :  ");
        String value = scanner.nextLine();

        System.out.println("Enter replace value");
        String replaceVal = scanner.nextLine();

        System.out.println("Enter a target value");
        String target = scanner.nextLine();


        String newVal = value.replace(target,replaceVal);

        System.out.println(newVal);

    }
}