import java.util.Calendar;

public class Jahr {
	
	private int jahr;
	
	public Jahr(int j) {
		this.jahr = j;
	}
	
	public Jahr() {
		this(Calendar.getInstance().get(Calendar.YEAR));
	}

	public int get() {
		return jahr;
	}
	
	public int unterschied(Jahr other) {
		return this.jahr - other.get();
	}
	
	public static Jahr heuer() {
		return new Jahr(Calendar.getInstance().get(Calendar.YEAR));
	}
	
	public boolean istAlter(Jahr other) {
		return this.jahr < other.get();
	}
	
	public boolean istJuenger(Jahr other) {
		return this.jahr > other.get();
	}
	
	public String toString() {
		return new Integer(this.jahr).toString();
	}

}
