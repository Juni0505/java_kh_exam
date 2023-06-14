
public class StudentMenu {
	private StudentController ssm = new StudentController();
	
	public StudentMenu() {
		System.out.println("========= 학생 정보 출력 =========");
		Student[] stu = ssm.printStudent();
		for(Student student : stu) {
			System.out.println(student.inform());
		}
		System.out.println("========= 학생 성적 출력 =========");
		int sum = ssm.sumScore();
		double[] avgArr = ssm.avgScore();
		System.out.println("총 합계 : " + sum);
		System.out.println("평균 점수 : " + avgArr[1]);
		System.out.println("========= 성적 결과 출력 =========");
		
		
	}
}
