
public class J01_ClaArrays02_main {
	public static void main(String[] args) {
//		J01_People 객체에 대한 배열 만들기
//		J01_People 레퍼런스 배열구조
//		1.  J01_People 레퍼런스 배열구조 생성
		J01_People[] r1= new J01_People[3];
//		2. r1 대상 객체 안에 들어있는 레퍼런스에 객체 생성 후 고유번호 저장
//		=> 이 때에 우리가 원하는 실제 이름/나이 정보를 저장할 수 있는 객체가 만들어진다.
		r1[0] = new J01_People();
		r1[1] = new J01_People();
		r1[2] = new J01_People();
		
//		=> 이처럼 모든 레퍼런스에 각각 만들어진 객체의 고유번호를 저장하는 작업이 필수적으로 필요한데,
//		배열구조이므로 아래와 같이 for문을 사용할 수 있다. (위와 아래는 같은 의미이므로, 둘 중하나만을 사용한다.)
		
		for(int i=0; i<r1.length; i++){
			r1[i] = new J01_People();
		}
		
//		3. 이용하기
		r1[0].name = "둘리";
		r1[0].age = 10;
		
		r1[1].name = "길동이";
		r1[1].age = 11;
		
		r1[2].name = "도우너";
		r1[2].age = 12;
		
		System.out.println(r1[0].name+"의 나이 : " + r1[0].age);
		System.out.println(r1[1].name+"의 나이 : " + r1[1].age);
		System.out.println(r1[2].name+"의 나이 : " + r1[2].age);
		
		for(int i=0;i<r1.length;i++){
			System.out.println(r1[i].name+"의 나이 : " + r1[i].age);
		}
		
	}
}
