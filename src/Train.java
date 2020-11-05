import java.util.LinkedList;
import java.util.List;

public class Train {
	/*
	 * P => |OOOO|
	 * H => <HHHH 
	 * C => |____|
	 * R => |hThT|
	 */
	private List<Wagon> listwagon;
	private TrainFactory trainFactory;
	
	public List<Wagon> getListwagon() {
		return listwagon;
	}

	public Train(String representation) {

		listwagon = new LinkedList<>();
		trainFactory = new TrainFactory();
		
		char[] c = representation.toCharArray();
		for(int i=0 ; i<c.length; i++) {
			Wagon wagon = trainFactory.getWagon(c[i]);
			listwagon.add(wagon);
		}
		
	}

	public String print() {
		String result ="";
		for(int i=0 ; i<listwagon.size(); i++) {
			result += listwagon.get(i).print();
			if(i != listwagon.size()-1) {
				result += "::";
			}
		}
		return result;
	}
	
	public void detachEnd() {
		//delete the last wagon in our list
		listwagon.remove(listwagon.size()-1);
	}
	public void detachHead() {
		//delete the first wagon in our list
		listwagon.remove(0);
	}
	
	public void fill() {
		// by default C => |____| but when we call fill() it becomes |^^^^| because we change isEmpty to false.
		// get the first |____|
		for(int i=0 ; i<listwagon.size(); i++) {
			if(listwagon.get(i) instanceof Cargo) {
				Cargo cargo = (Cargo) listwagon.get(i);
				if(cargo.isEmpty()) {
					cargo.setEmpty(false);
				}
			}
		}
	}

}
