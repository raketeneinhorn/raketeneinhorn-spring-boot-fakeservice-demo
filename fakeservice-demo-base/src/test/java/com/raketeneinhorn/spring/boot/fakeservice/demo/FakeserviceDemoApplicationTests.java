package com.raketeneinhorn.spring.boot.fakeservice.demo;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class FakeserviceDemoApplicationTests {

	@Test
	void contextLoads() {
	}

	// Test added ONLY to cover main() invocation not covered by application tests.
	@Test
	void coverMain() {
		FakeserviceDemoApplication.main(new String[] {});
	}

}
