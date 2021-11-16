package collections;

import java.util.Comparator;

public class ComparatorUse1 implements Comparator<SortKeyMap>{

	@Override
	public int compare(SortKeyMap sort, SortKeyMap sort1) {
		return sort.getNumber().compareTo(sort1.getNumber());
	}

}
