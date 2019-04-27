import java.util.Scanner;

public class DriverClass {
	public static void main(String[] args) {
		FileReader readFile = new FileReader();
       mainWindow m = new mainWindow();
       m.pack();
       m.setVisible(true);
		// reads file to array
		readFile.readFileToArrayList();
        //Flights.displayFlights();

		// filter display flight with to and from
		System.out.println("Press f to filter the flights with from and to /"
				+ "Press k to filter the flights with from, to, arrivalDate, departureDate /"
				+ "Press x to exit the program");
		Scanner sc = new Scanner(System.in);
		if (sc.next().equals("f")) {
			System.out.println("Please enter the departure city");
			String dc = sc.next();
			System.out.println("Please enter the arrival city");
			String ac = sc.next();
			Flights.displayFlights(dc, ac);
		} else if (sc.next().equals("k")) {
			//filters flights using to/from/city
			// departure date
			System.out.println("Enter departure date");
			System.out.println("Enter Month: ");
			int monthd = sc.nextInt();
			System.out.println("Enter Day: ");
			int dayd = sc.nextInt();
			System.out.println("Enter Year: ");
			int yeard = sc.nextInt();
			String departureDate = "" + dayd + "-" + monthd + "-" + yeard;
			;

			// arrival date
			System.out.println("Enter arrival date");
			System.out.println("Enter Month: ");
			int montha = sc.nextInt();
			System.out.println("Enter Day: ");
			int daya = sc.nextInt();
			System.out.println("Enter Year: ");
			int yeara = sc.nextInt();
			String arrivalDate = "" + daya + "-" + montha + "-" + yeara;
			;

			// to/from
			System.out.println("Please enter the departure city");
			String ndc = sc.next();
			System.out.println("Please enter the arrival city");
			String nac = sc.next();
			Flights.displayFlights(ndc, nac, departureDate, arrivalDate);

		}

	}
}
