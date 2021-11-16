package collections;

//Comparable is used in same class where we define where Comparator is used in different class 
public class ComparableUse implements Comparable<ComparableUse>{

	private String name;
	private String address;
	private int number;

	public ComparableUse(String name, String address, int number) {
		this.name = name;
		this.address = address;
		this.number = number;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	@Override
	public String toString() {
		return this.name + ":" + this.address + ":" + this.number;
	}

	@Override
	public int compareTo(ComparableUse li) {
		return this.name.compareTo(li.name);
	}

}
