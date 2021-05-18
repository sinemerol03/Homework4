
public class Gamer {
	private int id;
	private String firstName;
	private String lastName;
	private int birthYear;
	private long identityNumber;
	
	public Gamer()
	{}
	public Gamer(int id, String firstName, String lastName, int birthYear, long identityNumber) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.birthYear = birthYear;
		this.identityNumber = identityNumber;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public int getBirthYear() {
		return birthYear;
	}
	public void setBirthYear(int birthYear) {
		this.birthYear = birthYear;
	}
	public long getIdentityNumber() {
		return identityNumber;
	}
	public void setIdentityNumber(long identityNumber) {
		this.identityNumber = identityNumber;
	}
}
