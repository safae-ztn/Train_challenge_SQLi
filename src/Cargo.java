
public class Cargo extends Wagon{
	
	//cargo by default is empty;
	private boolean isEmpty = true;

	@Override
	public String print() {
		return isEmpty ? "|____|" : "|^^^^|";
	}

	public boolean isEmpty() {
		return isEmpty;
	}
	public void setEmpty(boolean isEmpty) {
		this.isEmpty = isEmpty;
	}

}
