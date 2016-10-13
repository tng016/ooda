package OODAssignment;

public class Table {
	private int status;
	private int capacity; // 0=empty, 1=occupied, 2= reserved
	
	Table(int c){
		setCapacity(c);
		setStatus(0);
	}

	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}

	public int getCapacity() {
		return capacity;
	}

	public void setCapacity(int capcity) {
		this.capacity = capcity;
	}
}
