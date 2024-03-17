package Integration;

import org.junit.jupiter.api.Test;

import static Integration.Method.run;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class IntegrationApplicationTests {

	@Test
	void test1() {
		assertEquals("Test 1", run("Test 1"));
	}

	@Test
	void test2() {
		assertEquals("Test2", run("Test 2"));
	}

}
