package model;

public class StudentBean {

	private int rollNo;
	private String name;
	private String department;
	private int marks;
	private double percentage;
	private final int total = 500;

	public int getRoll() { return rollNo; }
	public void setRoll(int rollNo) { this.rollNo = rollNo; }

	public String getName() { return name; }
	public void setName(String name) { this.name = name; }

	public String getDept() { return department; }
	public void setDept(String department) { this.department = department; }

	public int getMarks() { return marks; }
	public void setMarks(int marks) { this.marks = marks; }

	public double getPercentage() { return percentage; }
	public void setPercentage(double percentage) { this.percentage = percentage; }

	public void calculate() {
		this.percentage = (marks * 100.0) / total;
	}
}