import java.util.*;
//cp3 - 55
public class Main {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.print("Type your name, playa: ");
        String name = console.nextLine();

        String first;
        String last = "";
        String fInitial;

        // Check if there's a space in the name
        int spaceIndex = name.indexOf(" ");
        if (spaceIndex != -1) {
            // split name into first/last name and initials
            first = name.substring(0, spaceIndex);
            last = name.substring(spaceIndex + 1).toUpperCase();
        } else {
            // If no space, assume the entire input is the first name
            first = name;
        }

        fInitial = first.substring(0, 1);

        System.out.println("Your gangsta name is \"" + fInitial +
                ". Diddy " + last + " " + first + "-izzle\"");
    }
}
