package work_10;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class Ornek01 {

	public static void main(String[] args) {
		List <String> Ist=Arrays.asList("A","B","C","D");
		Iterator<String> Itr=Ist.iterator();
		while (Itr.hasNext()) {
			String e = (String) Itr.next();
			if (e=="C") {
				break;
			}else {
				continue;
				//System.out.println(e);
			}
		}

	}

}
