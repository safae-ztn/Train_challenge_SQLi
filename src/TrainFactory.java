
public class TrainFactory {
	
	public Wagon getWagon(char c) {
		if(c == 'H') {
			return new Head();
		}else if(c == 'P') {
			return new Passenger();
		}else if(c == 'R') {
			return new Restaurant();
		}else if(c == 'C') {
			return new Cargo();
		}else{
			return null;
		}
	}

}
