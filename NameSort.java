import java.util.*;
public class NameSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList str1= new ArrayList(7);
		str1.add("������");
		str1.add("�ڰ���");
		str1.add("���ѽ�");
		str1.add("������");
		str1.add("�����");
		System.out.println(str1);
		str1.add("������");
		Collections.sort(str1);
		System.out.println(str1);
		
		String[] str= {"������","�ڰ���","���ѽ�","������","�����"};
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
		
		Set set = new HashSet();//Hashset�� sort�� ���� ���� ����. �ٵ� ã�� �ӵ� ����
		                        //�׷��� ���ĵǾ��ִ� treeset����ص���. �̰� sort���ص���. ������ ���Խ���
		set.add("������");
		set.add("�ڰ���");
		set.add("���ѽ�");
		set.add("������");
		set.add("�����");
		Iterator iterator = set.iterator();
		while(iterator.hasNext())System.out.print(iterator.next()+" ");
		List list = new LinkedList(set);// Arraylist����ص� ����
		Collections.sort(list);
		System.out.println(list);
	}

}
