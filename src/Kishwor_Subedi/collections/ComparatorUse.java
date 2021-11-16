package collections;

import java.util.Comparator;

public class ComparatorUse implements Comparator<ComparableUse> {

	@Override
	public int compare(ComparableUse li, ComparableUse lis) {
		return li.getName().compareTo(lis.getName());
	}

}
