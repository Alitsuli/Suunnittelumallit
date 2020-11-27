import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		Verhot verhot = new Verhot();

		ICommand alasCmd = new VerhotAlasCmd(verhot);
		ICommand ylosCmd = new VerhotYlosCmd(verhot);

		VerhoKytkin alasKytkin = new VerhoKytkin(alasCmd);
		VerhoKytkin ylosKytkin = new VerhoKytkin(ylosCmd);

		int select;
		do {
			System.out.println("\nValitse 1, jos haluut laita Verhot ylös");
			System.out.println("Valitse 2, jos haluut laita Verhot alas");
			System.out.println("Valitse 3, jos haluut lopettaa");

			select = scan.nextInt();

			if (select == 1) {
				ylosKytkin.paina();
			}
			if (select == 2) {
				alasKytkin.paina();
			}
		} while (select != 3);

	}

}
