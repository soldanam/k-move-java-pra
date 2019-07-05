import java.util.*;
public class NameSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList str1= new ArrayList(7);
		str1.add("서우현");
		str1.add("박가온");
		str1.add("권한슬");
		str1.add("오윤록");
		str1.add("길우진");
		System.out.println(str1);
		str1.add("서우현");
		Collections.sort(str1);
		System.out.println(str1);
		
		String[] str= {"서우현","박가온","권한슬","오윤록","길우진"};
		for(int i =0; i<str.length-1; i++) {
			System.out.print(str[i]+" ");
		}
		System.out.println();
		Arrays.sort(str);
		for(int i =0; i<str.length-1; i++) {
			System.out.print(str[i]+" ");
		}
		System.out.println();
		System.out.println();
		
		Set set = new HashSet();//Hashset은 sort에 접근 하지 않음. 근데 찾는 속도 빠름
		                        //그래서 정렬되어있는 treeset사용해도됨. 이건 sort안해도됨. 삭제랑 삽입쉬움
		set.add("서우현");
		set.add("박가온");
		set.add("권한슬");
		set.add("오윤록");
		set.add("길우진");
		Iterator iterator = set.iterator();
		while(iterator.hasNext())System.out.print(iterator.next()+" ");
		List list = new LinkedList(set);// Arraylist사용해도 가능
		Collections.sort(list);
		System.out.println(list);
	}

}
