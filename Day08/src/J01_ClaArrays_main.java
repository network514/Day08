
public class J01_ClaArrays_main {
	public static void main(String[] args) {
//		사람 정보 프로그램
//		- 둘리, 10살
//		- 길동이, 11살
//		- 도우너, 12살
		
//		1. 클래스를 이용하여 객체 생성
		J01_People r1 = new J01_People();
//		=> 둘리, 10살을 위한 객체 생성
		
		J01_People r2 = new J01_People();
//		=> 길동이, 11살
		

		J01_People r3 = new J01_People();
//		=> 도우너, 12살
		
		r1.name = "둘리";
		r1.age = 10;
		r2.name = "길동이";
		r2.age = 11;
		r3.name = "도우너";
		r3.age = 12;
		
//		자바가 가지고 있는 객체 배열의 관점
		J01_intro ref = new J01_intro();
//		=> new가 J02_intro() 일꾼을 통해서 객체를 생성하게 되면 J01_People에서 명시한
//		사람의 이름과 나이 정보 여러개를 저장할 수 있는 집이 생기는 것이 아니라
//		J01_People 객체 여러개를 참조할 수 있는 레퍼런스 여러개가 만들어진다.
//		=> 위와 같이 명령하면, new로 만들어진 객체 안에 있는 각 방은 레퍼런스인데, 
//		각 방에는 객체의 고유번호가 저장된 적이 없기 때문에 모두 null값을 기본으로 가지고 있다.
//		=> 고유번호가 없으므로, 참조도 불가능하다.
//		에러 : ref.index0.name ="둘리";
		
		System.out.println(ref.index0);
		ref.index0 = new J01_People();
		ref.index1 = new J01_People();
		ref.index2 = new J01_People();
		
		ref.index0.name="둘리";
		ref.index0.age=10;
		ref.index1.name="길동이";
		ref.index1.age=11;
		ref.index2.name="도우너";
		ref.index2.age=12;
		
		System.out.println(ref.index0.name + ", " + ref.index2.age);
	}
}
