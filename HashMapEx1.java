import java.util.*;
class HashMapEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap map = new HashMap();
		map.put("myId","1234");
		map.put("asdf", "1111");
		map.put("asdf", "1234");
		
		Scanner scanner = new Scanner(System.in);
		while(true) {
			System.out.println("id와 password를 입력해주세요.");
			System.out.println("id: ");
			String id = scanner.nextLine().trim();
			System.out.println();
			System.out.println("password: ");
			String password = scanner.nextLine().trim();
			System.out.println();
			
			if(!map.containsKey(id)) {
				System.out.println("입력하신 id는 존재하지 안습니다. 다시입력해주세요");
				continue;
				
			}else {
				if(!map.get(id).equals(password))
					System.out.println("비밀번호기 일치하지 않습니다. 다시 입력해주세요");
			
				else {
					System.out.println("id와 비밀번호가 일치합니다. ");
					break;
				}
				
			}
		}
		
		
	}

}
