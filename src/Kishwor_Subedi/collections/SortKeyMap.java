package collections;

public class SortKeyMap {

	private String name;
	private int number;

	public SortKeyMap(String name, Integer number) {
		this.name = name;
		this.number = number;
	}

	public String getName() {
		return name;
	}

	public Integer getNumber() {
		return number;
	}
	@Override
	public String toString() {
		
		return this.name +":"+this.number;
	}

}
