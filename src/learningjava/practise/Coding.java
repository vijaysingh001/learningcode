package learningjava.practise;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Coding {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr = {1,2,0,0,8,7,0,4};
		List<Integer> list1=new ArrayList<>();
		List<Integer> list2=new ArrayList<>();

		Arrays.stream(arr).forEach(s->{
			if(s==0) {
				list1.add(s);
			}
			else {
				list2.add(s);
			}
		});
	List<Integer>list3=list2.stream().sorted().collect(Collectors.toList());
	List<Integer> newarr=Stream.concat(list3.stream(), list1.stream()).collect(Collectors.toList());
	System.out.println(newarr);
	}
	
	
}
