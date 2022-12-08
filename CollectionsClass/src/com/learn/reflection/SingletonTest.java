package com.learn.reflection;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.sql.SQLException;

import org.junit.jupiter.api.Test;

class SingletonTest {

	@Test
	void testSingletonM() throws ClassNotFoundException, SQLException {
		
		
		assertEquals(Singleton.SingletonM().hashCode(), Singleton.SingletonM().hashCode());
		
	}

	@Test
	void testMain() throws ClassNotFoundException, SQLException {
		
		assertEquals(Singleton.SingletonM().hashCode(), Singleton.SingletonM().hashCode());
	}

}
