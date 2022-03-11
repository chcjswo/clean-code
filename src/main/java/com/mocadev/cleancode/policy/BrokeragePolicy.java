package com.mocadev.cleancode.policy;

/**
 * @author chcjswo
 * @version 1.0.0
 * @blog https://mocadev.tistory.com
 * @github https://github.com/chcjswo
 * @since 2022-03-12
 **/
public interface BrokeragePolicy {

	BrokerageRule createBrokerageRule(Long price);

	default Long calculate(Long price) {
		final BrokerageRule brokerageRule = createBrokerageRule(price);
		return brokerageRule.calcMaxBrokerage(price);
	}

}
