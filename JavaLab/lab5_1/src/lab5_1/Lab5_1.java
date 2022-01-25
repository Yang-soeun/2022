package lab5_1;

class Student{
	private static int staticID = 2017000;
	private int studentID;
	private String studentName;
	private double midScore, finalScore;
	
	public Student()
	{
		studentName = "";
		midScore = 0.0;
		finalScore = 0.0;
	}
	public Student(String studentName, double midScore, double finalScore)
	{
		this.studentID = ++staticID;
		this.studentName = studentName;
		this.midScore = midScore;
		this.finalScore = finalScore;
	}
	public double getAvgScore()//midScore와 finalScore의 평균 점수를 반환
	{	
		double avgScore;
		
		avgScore  = (this.midScore + this.finalScore);
		avgScore  *= 0.5;
		
		return avgScore;
	}
	public String toString()
	{
		return "(" + this.studentID + ")" + this.studentName + ": " + this.midScore + 
				", " + this.finalScore + ", " + getAvgScore();
	}
	public static Student findBestStudent(Student[] st)//평균 점수가 가장 높은 학생 객체를 반환
	{
		/*
		 * input: Student 배열 객체, output: Student 객체
		 * 이 메소드는 반드시 static 메소드로 정의하고, 메소드 선언부를 정확히 구성할것
		 * 선택 정렬 알고리즘 활용
		*/
		
		int num = st.length;
		Student BestSt = new Student();
		
		double BestScore = st[0].getAvgScore();
		
		for(int i = 0; i<num; i++)
		{
			if(st[i].getAvgScore() > BestScore)
			{
				BestScore = st[i].getAvgScore();
				BestSt = st[i];
			}
		}
		
		return BestSt;
	}
	public static Student findWorstStudent(Student[] st)//평군 점수가 가장 낮은 학생 객체를 반환
	{
		int num = st.length;
		Student WorstSt = new Student();
		
		double WorstScore = st[0].getAvgScore();
		
		for(int i = 0; i<num; i++)
		{
			if(st[i].getAvgScore() < WorstScore)
			{
				WorstScore = st[i].getAvgScore();
				WorstSt = st[i];
			}
		}
		
		return WorstSt;
	}
}
public class Lab5_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Student[] st =  new Student[10];
		
		st[0] = new Student("Jane", 57.8, 79.5);
		st[1] = new Student("Pole", 68.77, 77.1);
		st[2] = new Student("John", 34.8, 56.2);
		st[3] = new Student("Kim", 97.3 , 12.4);
		st[4] = new Student("Lee", 12.2, 13.3);
		st[5] = new Student("Yang", 99.9, 88.1);
		st[6] = new Student("Nam", 54.3, 33.3);
		st[7] = new Student("Song", 22.2, 99.7);
		st[8] = new Student("Park", 88.7, 86.1);
		st[9] = new Student("Jang", 11.3, 44.7);
		
		System.out.println("----- Student LIST ((StudentID) Name, MidScore, FinalScore, AvgScore) -----");
		
		for(int i = 0; i<st.length; i++)
			System.out.println(st[i]);
		
		System.out.println();
		
		System.out.println("The best student : " + Student.findBestStudent(st));
		System.out.println("The worst student : " + Student.findWorstStudent(st));
	}

}
