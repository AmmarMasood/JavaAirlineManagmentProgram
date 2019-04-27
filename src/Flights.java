//todo:
//we need to add rate when displaying flights.
public class Flights {
	protected int reservationNo;
	protected String airlineName;
	protected int flightNo;
	protected String departureDate;
	protected String arrivalDate;
	protected String to;
	protected String from;
	protected int price;
	protected boolean int0dom;
	protected int capacity;
	protected boolean availble;
    
	public Flights(String airlineName, int flightNo, String from, String to, String departureDate, String arrivalDate,
			boolean int0dom, int capacity) {
		this.airlineName = airlineName;
		this.flightNo = flightNo;
		this.departureDate = departureDate;
		this.arrivalDate = arrivalDate;
		this.to = to;
		this.from = from;
		this.int0dom = int0dom;
		this.capacity = capacity;
	}

//static function can be accessed throught any class just to display all the availble flights
	public static void displayFlights() {
		for (int i = 0; i < FileReader.flights.size(); i++) {
			System.out.println("Flight: " + i);
			System.out.println("Airline Name: " + FileReader.flights.get(i).airlineName);
			System.out.println("Flight no: " + FileReader.flights.get(i).flightNo);
			System.out.println("to: " + FileReader.flights.get(i).to);
			System.out.println("from: " + FileReader.flights.get(i).from);
			System.out.println("Departure Date: " + FileReader.flights.get(i).departureDate);
			System.out.println("Arrival Date: " + FileReader.flights.get(i).arrivalDate);
			System.out.println("Domestic: " + FileReader.flights.get(i).int0dom);
			System.out.println("International: " + !(FileReader.flights.get(i).int0dom));
			System.out.println("Capacity: " + FileReader.flights.get(i).capacity);
			System.out.println();

		}
	}

//function to filter down the flights with to, from
	public static String displayFlights(String from, String to) {
		//we create this flag so else part dont run again and again
		boolean f = false;
                String output = "";
		for (int i = 0; i < FileReader.flights.size(); i++) {
                    System.out.println(FileReader.flights.size());
			if (FileReader.flights.get(i).to.equalsIgnoreCase(to) && FileReader.flights.get(i).from.equalsIgnoreCase(from)) {
				f=true;
                                //formats the string
                                output = String.format("Flight: " + i + "\n" +
                                "Airline Name: " + FileReader.flights.get(i).airlineName + "\n"
                                        + "Flight no: " + FileReader.flights.get(i).flightNo + "\n"
                                        + "to: " + FileReader.flights.get(i).to + "\n"
                                        + "from: " + FileReader.flights.get(i).from + "\n"
                                        + "Departure Date: " + FileReader.flights.get(i).departureDate + "\n"
                                        + "Arrival Date: " + FileReader.flights.get(i).arrivalDate + "\n"
                                        + "Domestic: " + FileReader.flights.get(i).int0dom + "\n"
                                        + "International: " + !(FileReader.flights.get(i).int0dom) + "\n"
                                        + "Capacity: " + FileReader.flights.get(i).capacity + "\n"
                                        + "Standard Price: " + FileReader.flights.get(i).price
                                );
//				System.out.println();
//				System.out.println("Flight: " + i);
//				System.out.println("Airline Name: " + FileCatcher.flights.get(i).airlineName);
//				System.out.println("Flight no: " + FileCatcher.flights.get(i).flightNo);
//				System.out.println("to: " + FileCatcher.flights.get(i).to);
//				System.out.println("from: " + FileCatcher.flights.get(i).from);
//				System.out.println("Departure Date: " + FileCatcher.flights.get(i).departureDate);
//				System.out.println("Arrival Date: " + FileCatcher.flights.get(i).arrivalDate);
//				System.out.println("Domestic: " + FileCatcher.flights.get(i).int0dom);
//				System.out.println("International: " + !(FileCatcher.flights.get(i).int0dom));
//				System.out.println("Capacity: " + FileCatcher.flights.get(i).capacity);
//                                System.out.println("Standard Price: " + FileCatcher.flights.get(i).price);
//				System.out.println();
			} else if(f == false) {
                          output = "Sorry cant find any flights with these details";
				System.out.println("Sorry cant find any flights with these details");
				//break;	
			}
		}
                return output;
	}
//function to filter down the flights with to, from, arrival date and departure date
public static String displayFlights(String from, String to, String departure, String arrival) {
	boolean f = false;
        String output2 = "";
	for(int i = 0; i < FileReader.flights.size(); i++) {
		if ((FileReader.flights.get(i).departureDate.equalsIgnoreCase(departure))
				&& 
				(FileReader.flights.get(i).arrivalDate.equalsIgnoreCase(arrival))
				&&
				(FileReader.flights.get(i).to.equalsIgnoreCase(to))
				&&
				(FileReader.flights.get(i).from.equalsIgnoreCase(from))
				) {
			f=true;
                        output2 = String.format("Flight: " + i + "\n" +
                                "Airline Name: " + FileReader.flights.get(i).airlineName + "\n"
                                        + "Flight no: " + FileReader.flights.get(i).flightNo + "\n"
                                        + "to: " + FileReader.flights.get(i).to + "\n"
                                        + "from: " + FileReader.flights.get(i).from + "\n"
                                        + "Departure Date: " + FileReader.flights.get(i).departureDate + "\n"
                                        + "Arrival Date: " + FileReader.flights.get(i).arrivalDate + "\n"
                                        + "Domestic: " + FileReader.flights.get(i).int0dom + "\n"
                                        + "International: " + !(FileReader.flights.get(i).int0dom) + "\n"
                                        + "Capacity: " + FileReader.flights.get(i).capacity + "\n"
                                        + "Standard Price: " + FileReader.flights.get(i).price
                                );
//			System.out.println();
//			System.out.println("Flight: " + i);
//			System.out.println("Airline Name: " + FileCatcher.flights.get(i).airlineName);
//			System.out.println("Flight no: " + FileCatcher.flights.get(i).flightNo);
//			System.out.println("to: " + FileCatcher.flights.get(i).to);
//			System.out.println("from: " + FileCatcher.flights.get(i).from);
//			System.out.println("Departure Date: " + FileCatcher.flights.get(i).departureDate);
//			System.out.println("Arrival Date: " + FileCatcher.flights.get(i).arrivalDate);
//			System.out.println("Domestic: " + FileCatcher.flights.get(i).int0dom);
//			System.out.println("International: " + !(FileCatcher.flights.get(i).int0dom));
//			System.out.println("Capacity: " + FileCatcher.flights.get(i).capacity);
//                        System.out.println("Standard Price: " + FileCatcher.flights.get(i).price);
//			System.out.println();
		}else if(f == false) {
                    output2 = "Sorry cant find any flights with these details";
			//System.out.println("Sorry cant find any flights with these details");
		}
	}
        return output2;
          
}	
//function to filter down the flights with to, from, arrival date and departure date
public static String displayFlights(String from, String to, String departure) {
	boolean f = false;
        String output2 = "";
	for(int i = 0; i < FileReader.flights.size(); i++) {
		if ((FileReader.flights.get(i).departureDate.equalsIgnoreCase(departure))
				&&
				(FileReader.flights.get(i).to.equalsIgnoreCase(to))
				&&
				(FileReader.flights.get(i).from.equalsIgnoreCase(from))
				) {
			f=true;
                        output2 = String.format("Flight: " + i + "\n" +
                                "Airline Name: " + FileReader.flights.get(i).airlineName + "\n"
                                        + "Flight no: " + FileReader.flights.get(i).flightNo + "\n"
                                        + "to: " + FileReader.flights.get(i).to + "\n"
                                        + "from: " + FileReader.flights.get(i).from + "\n"
                                        + "Departure Date: " + FileReader.flights.get(i).departureDate + "\n"
                                        + "Arrival Date: " + FileReader.flights.get(i).arrivalDate + "\n"
                                        + "Domestic: " + FileReader.flights.get(i).int0dom + "\n"
                                        + "International: " + !(FileReader.flights.get(i).int0dom) + "\n"
                                        + "Capacity: " + FileReader.flights.get(i).capacity + "\n"
                                        + "Standard Price: " + FileReader.flights.get(i).price
                                );
//			System.out.println();
//			System.out.println("Flight: " + i);
//			System.out.println("Airline Name: " + FileCatcher.flights.get(i).airlineName);
//			System.out.println("Flight no: " + FileCatcher.flights.get(i).flightNo);
//			System.out.println("to: " + FileCatcher.flights.get(i).to);
//			System.out.println("from: " + FileCatcher.flights.get(i).from);
//			System.out.println("Departure Date: " + FileCatcher.flights.get(i).departureDate);
//			System.out.println("Arrival Date: " + FileCatcher.flights.get(i).arrivalDate);
//			System.out.println("Domestic: " + FileCatcher.flights.get(i).int0dom);
//			System.out.println("International: " + !(FileCatcher.flights.get(i).int0dom));
//			System.out.println("Capacity: " + FileCatcher.flights.get(i).capacity);
//                        System.out.println("Standard Price: " + FileCatcher.flights.get(i).price);
//			System.out.println();
		}else if(f == false) {
                    output2 = "Sorry cant find any flights with these details";
			//System.out.println("Sorry cant find any flights with these details");
		}
	}
        return output2;
          
}


}
