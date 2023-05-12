package learningjava.practise;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class Duplicatecheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "ababcacd";
		Map<String,Long> map=Arrays.stream(s.split("")).collect(Collectors.groupingBy(g->g,LinkedHashMap::new,Collectors.counting()));
		System.out.println(map);
	}

}
