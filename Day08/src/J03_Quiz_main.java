import javax.swing.JOptionPane;


public class J03_Quiz_main {
	public static void main(String[] args) {
//		학생정보 프로그램 
//		학생 정보 : 이름, 국어, 영어, 수학, 총점, 평균, 등급(수우미양가)
//		메뉴 :  
		J03_Quiz_studentInform inform = new J03_Quiz_studentInform();
		String num = JOptionPane.showInputDialog("학생정보 프로그램\n 1. 학생정보 입력 \n 2. 학생정보 출력\n 3. 학생 정보 수정" );
			while(true){
				switch (num) {
				case "1":
//					1. 학생 정보 입력
					infomInsert(inform);
					break;
				case "2":
		//			2. 학생 정보 출력
					infomPrint(inform);
					break;
				case "3":
		//			3. 학생 정보 수정
					infomModify(inform);
					break;
				case "4":
		//			4. 프로그램 종료
					System.exit(0);
					break;
				default:
					JOptionPane.showMessageDialog(null, "잘못입력하셨습니다. 다시 입력해주세요.");
					break;
				}
			}

//		1 선택 시; 이름, 국어, 영어, 수학 입력
//		2 선택 시; 학생의 모든 정보 출력
//		3 선택 시; 국어, 영어, 수학만 입력
//		위의 기능들을 메서드로 작성
	}
	public static void infomInsert(J03_Quiz_studentInform inform){
		inform.name = JOptionPane.showInputDialog("이름을 입력하세요.");
		String korParam = JOptionPane.showInputDialog("국어 점수를 입력하세요.");
		inform.kor = Integer.parseInt(korParam);
		String engParam = JOptionPane.showInputDialog("영어 점수를 입력하세요.");
		inform.eng = Integer.parseInt(engParam);
		String mathParam = JOptionPane.showInputDialog("수학 점수를 입력하세요.");
		inform.math = Integer.parseInt(mathParam);
		inform.total = inform.kor + inform.eng + inform.math;
		inform.avg = ((double)inform.total/3);
		
		int avgNum = (int)inform.avg;
		
		switch(avgNum/10){
		case 10: case 9:
			inform.grade = "수";
		case 8:
			inform.grade = "우";
		case 7:
			inform.grade = "미";
		case 6:
			inform.grade = "양";
		case 5:
			inform.grade = "가";
		default :
			inform.grade = "가";
		}
	}
	public static void infomPrint(J03_Quiz_studentInform inform){
		JOptionPane.showMessageDialog(null, inform.name+"님의 \n국어 점수 : " + inform.kor + "영어 점수 : " + inform.kor
				+ "수학 점수 : " + inform.kor + "총합 : " + inform.total + "평균 : " + inform.total + "등급" + inform.avg);
	}
	public static void infomModify(J03_Quiz_studentInform inform){
		String korParam = JOptionPane.showInputDialog("국어 점수를 입력하세요.");
		inform.kor = Integer.parseInt(korParam);
		String engParam = JOptionPane.showInputDialog("영어 점수를 입력하세요.");
		inform.eng = Integer.parseInt(engParam);
		String mathParam = JOptionPane.showInputDialog("수학 점수를 입력하세요.");
		inform.math = Integer.parseInt(mathParam);
	}
}