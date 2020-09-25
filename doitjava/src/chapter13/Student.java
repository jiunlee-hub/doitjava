package chapter13;

public class Student {
	private String name;
	private int englistScore;
	private int mathScore;
	
	public Student(String name, int englistScore, int mathScore) {
		this.name = name;
		this.englistScore = englistScore;
		this.mathScore = mathScore;
	}

	public String getName() {
		return name;
	}

	public int getEnglistScore() {
		return englistScore;
	}

	public int getMathScore() {
		return mathScore;
	}
	
	
}
