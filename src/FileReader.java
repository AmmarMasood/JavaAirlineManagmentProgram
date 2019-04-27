import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class FileReader {
	public static  ArrayList<Flights> flights = new ArrayList<Flights>();
	
	public void readFileToArrayList() {

		String word = "";

		try {
			// this reads the file containing the map data//
			File reviewFile = new File("flights.txt");
			Scanner reviewScanner = new Scanner(reviewFile);
			// Scanner keyboard = new Scanner(System.in);
			while (reviewScanner.hasNext()) {
                            String n = reviewScanner.nextLine();
				word = reviewScanner.nextLine();
				//System.out.println(word);

				String a[] = word.split(",");
				Flights fa = new Flights(a[0], Integer.parseInt(a[1]), a[2], a[3], a[4], a[5], Boolean.parseBoolean(a[6]),Integer.parseInt(a[7]));
				flights.add(fa);
				//System.out.println(flights.size());
				

			}
			System.out.println("Flights loaded sucessfully");
			System.out.println();
			
		} catch (Exception e) {
               System.out.println(e);
		}
	}
}
