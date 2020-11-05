
public class Head extends Wagon{

	private boolean isHead = true;
	
	@Override
	public String print() {
		// TODO Auto-generated method stub
		return isHead ? "<HHHH" : "HHHH>";
	}

	public boolean isHead() {
		return isHead;
	}
	public void setHead(boolean isHead) {
		this.isHead = isHead;
	}
}
