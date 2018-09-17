import java.util.Scanner;

public class SubstringReplacement{
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		String string, substring, replacement;
		int position;
		System.out.print("Enter a long string: ");
		string = scanner.nextLine();
		System.out.print("Enter a substring: ");
		substring = scanner.nextLine();

		System.out.println();
		System.out.printf("Length of long string       %10d\n", string.length());
		System.out.printf("Length of substring         %10d\n", substring.length());
		System.out.printf("Start position of substring %10d\n", string.indexOf(substring));
		System.out.printf("Before substring was        %10s\n", string.substring(0,string.indexOf(substring)));
		System.out.printf("After substring was         %10s\n", string.substring(string.indexOf(substring)+ substring.length(), string.length()));
		System.out.println();
		System.out.print("Enter a position between 0 and " + (string.length() - 1) + ": ");
		position = scanner.nextInt();
		System.out.println();
		System.out.printf("Character at position " + position + ":    " + "%10s\n", string.charAt(position));
		System.out.println();
		System.out.print("Enter a replacement string: ");
		scanner.nextLine(); //gets rid of left over escape character from gathering the int above
		replacement = scanner.nextLine();
		System.out.println();
		System.out.printf("Your new string is:         %10s\n", string.replace(substring, replacement));
	}
}