package learningjava.practise;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class practise {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Integer> list=Arrays.asList(1,2,4,2,2,5,2,3,5,4,6);
		Set<Integer> ss=list.stream().filter(s->Collections.frequency(list, s)>2).collect(Collectors.toSet());
		System.out.print(ss);
		
		String str="asdsadsadad";
		Map<String,Long> map=Arrays.stream(str.split("")).collect(Collectors.groupingBy(s->s,LinkedHashMap::new ,Collectors.counting()));
	}

}
