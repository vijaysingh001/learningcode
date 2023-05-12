package learningjava.practise;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class TestClass {

	public static boolean duplicateCheck(String str){
        char[] ch=str.toCharArray();
        Set<Character> charset=new HashSet();
        boolean status=false;
        for(int i=0;i<ch.length;i++) {
        	for(int j=i+1;j<ch.length;j++) {
        	if(ch[i]==ch[j]) {
                status=true;
                break;
            }
        }
        }
        return status;
        
}
	public static boolean hasDuplicate(String input) {
        HashSet<Character> set = new HashSet<>();

        
//        return input.chars()
//                .mapToObj(i -> (char) i)
//                .anyMatch(c -> !set.add(c));
        return input.chars().mapToObj(i->(char)i).anyMatch(c->!set.add(c));
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(duplicateCheck("vijay"));
		
		System.out.println(hasDuplicate("has duplicate" +"ajeet"));
//		int[] arr = {1,2,5,3,3,2,3,4,4,3};
//		
//		
//		List<Integer> l= Arrays.asList(1,2,5,3,3,2,3,4,4,3);
//		Set<Integer> count=l.stream().filter(s->Collections.frequency(l, s)>1).collect(Collectors.toSet());
//		System.out.println(count);
//		
//		List<Integer> newlist=new ArrayList<>();
//		
//		for(int a:arr) {
//			if(!newlist.contains(a));{
//				newlist.add(a);
//			}
//		}
//		System.out.println();
		
		int[] arr={0,1,2,0,1,2};
		int temp=0;
		for(int i=0;i<arr.length;i++){
		for(int j=i+1;j<arr.length;j++){
		if(arr[i]>arr[j]){
		temp=arr[i];
		arr[i]=arr[j];
		arr[j]=temp;
		}
		}
		}
		for(int k=0;k<arr.length;k++)
		System.out.print(arr[k]+" ");
	}	

}
