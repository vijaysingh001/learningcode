package learningjava.practise;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.OptionalInt;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Codecheck {

	public static int closestnumber(int[] arr, int n, int target) {
		
		int first=0;
		int last=n-1;
		while(first<last) {
		if((Math.abs(arr[first]-target))<=Math.abs(arr[last]-target)) {
			last--;
		}
		else {
			first++;
		}		
		
	}
		return arr[first];

	}
	
	public static int binarysearch(int[] arr,int num) {
		
		int first=0;
		int last =arr.length-1;
		int mid=(first+last)/2;
		while(first<last) {
			if(arr[mid]==num) {
				System.out.println("number is at index of : "+ mid);
				break;
			}
			else if(arr[mid]<num){
				first=mid+1;				
			}
			else {
				last=mid-1;
			}
			mid=(first+last)/2;
		}
		if(first>last) {
			System.out.println("element does not exists :");
		}
		
		return num;
		
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		String str ="vijaysinghmeena";
		Map<String,Long> count=Arrays.stream(str.split("")).map(String::toLowerCase).sorted().collect(Collectors.groupingBy(s->s,LinkedHashMap::new,Collectors.counting()));
		System.out.println(count);
		
		int[] arr = { 1, 2, 4, 5, 6, 6, 8, 8, 9 };
        int n = arr.length;
        int target = 11;
        System.out.println(closestnumber(arr, n, target));
        
        //IntStream n=
        
        OptionalInt s=IntStream.rangeClosed(0, 100).filter(f -> f%2==0).map(m->m/2).reduce((a,b)->a+b);
		
        System.out.println(s);
        
        List<Integer> numbers = Arrays.asList(5, 9, 11, 2, 8, 21, 1);


        int largest=numbers.stream().max(Integer::compare).get();
        System.out.println(largest);
        
        String str1 = new String("Welcome to JavaTpoint").intern();   
        String str2 = new String("Welcome to JavaTpoint").intern();  
        System.out.println(str1==str2); // prints false  
        
	}

}
