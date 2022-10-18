package neoflex.exercise.HolidayPay;
import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class HolidayPayCalculatorTests {
	
	@Test
	void calculateHolidayPayIfMiddleSalaryEqual30000() {
		HolidayPayCalculator calculator = new HolidayPayCalculator(30000);
		assertThat(calculator.calculate())
	      .isEqualTo(28668.941979522184);
	}

}
