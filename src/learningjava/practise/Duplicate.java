package learningjava.practise;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class Duplicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		List<Integer> list=Arrays.asList(new Integer[] {1,3,2,1,2,4,5,6,3});
		String str="sdcasdcsc";
	      Map<String,Long> map= Arrays.stream(str.split("")).sorted().collect(Collectors.groupingBy(s->s,LinkedHashMap::new,Collectors.counting()));
	      System.out.println(map);  
	}

}
