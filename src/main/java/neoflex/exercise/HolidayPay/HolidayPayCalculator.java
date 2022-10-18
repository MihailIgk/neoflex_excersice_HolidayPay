package neoflex.exercise.HolidayPay;

public class HolidayPayCalculator {
	private double middleSalary;
	private int vacationDays = 28;
	HolidayPayCalculator(double middleSalary) {
		this.middleSalary = middleSalary;
	}
	public double calculate() {
		double holidayPay = middleSalary * vacationDays / 29.3;
		return holidayPay;
	}
}
