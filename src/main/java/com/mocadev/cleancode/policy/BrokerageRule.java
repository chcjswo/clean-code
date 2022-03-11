package com.mocadev.cleancode.policy;

import lombok.AllArgsConstructor;

/**
 * @author chcjswo
 * @version 1.0.0
 * @blog https://mocadev.tistory.com
 * @github https://github.com/chcjswo
 * @since 2022-03-12
 **/
@AllArgsConstructor
public class BrokerageRule {

	private Double brokeragePercent;
	private Long limitAmount;

	public Long calcMaxBrokerage(Long price) {
		if (limitAmount == null) {
			return multiplyPercent(price);
		}
		return Math.min(multiplyPercent(price), limitAmount);
	}

	private Long multiplyPercent(Long price) {
		return Double.valueOf(Math.floor(brokeragePercent / 100 * price)).longValue();
	}
}
