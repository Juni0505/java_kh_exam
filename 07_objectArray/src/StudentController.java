
public class StudentController {
	Student[] sArr = new Student[5];
	public static final int CUT_LINE = 60;
	
	Student s = new Student();
	
	public StudentController() {
		sArr[0] = new Student("김길동", "자바", 100);
		sArr[1] = new Student("박길동", "디비", 50);
		sArr[2] = new Student("이길동", "화면", 85);
		sArr[3] = new Student("정길동", "서버", 60);
		sArr[4] = new Student("홍길동", "자바", 20);
	}
	public Student[] printStudent() {
		return sArr;
	}
	public int sumScore() {
		int sum = 0;
		for(Student student : sArr) {
			sum += student.getScore();
		}
		return sum;
		
	}
	public double[] avgScore() {
		double[] avgArr = new double[2];
		int sum = sumScore();
		double avg = (double)sum / sArr.length;
		avgArr[0] = sum;
		avgArr[1] = avg;
		return avgArr;
	}
}
