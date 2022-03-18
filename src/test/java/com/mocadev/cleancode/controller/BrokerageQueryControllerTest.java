package com.mocadev.cleancode.controller;

import static org.junit.jupiter.api.Assertions.*;

import com.mocadev.cleancode.policy.PurchaseBrokeragePolicy;
import com.mocadev.cleancode.policy.RentBrokeragePolicy;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * @author chcjswo
 * @version 1.0.0
 * @blog https://mocadev.tistory.com
 * @github https://github.com/chcjswo
 * @since 2022-03-19
 **/
class BrokerageQueryControllerTest {

	PurchaseBrokeragePolicy purchaseBrokeragePolicy;
	RentBrokeragePolicy rentBrokeragePolicy;

	@BeforeEach
	public void setUp() {
		purchaseBrokeragePolicy = new PurchaseBrokeragePolicy();
		rentBrokeragePolicy = new RentBrokeragePolicy();
	}

	@Test
	void purchaseBrokeragePolicyTest() {
		assertEquals(purchaseBrokeragePolicy.calculate(30_000_000L), 180_000L);
	}

	@Test
	void rentBrokeragePolicyTest() {
		assertEquals(rentBrokeragePolicy.calculate(30_000_000L), 150_000L);
	}
}
