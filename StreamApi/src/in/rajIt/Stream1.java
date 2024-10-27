package in.rajIt;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class Stream1 {

	public static void main(String[] args) {
		 List<Integer> li= new ArrayList<>();
		 li.add(565);
		 li.add(5);
		 
		 li.add(345);
		 
		 li.add(231);
		 
		 Stream<Integer> stream = li.stream().filter(l->l.equals(li));
		 
	}

}
