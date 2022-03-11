package com.mocadev.cleancode.policy;

/**
 * 임대차일 때 중계수수료를 계산해주는 클래스
 *
 * @author chcjswo
 * @version 1.0.0
 * @blog https://mocadev.tistory.com
 * @github https://github.com/chcjswo
 * @since 2022-03-12
 **/
public class RentBrokeragePolicy implements BrokeragePolicy {

	@Override
	public BrokerageRule createBrokerageRule(Long price) {
		BrokerageRule rule;
		if (price < 50_000_000) {
			rule = new BrokerageRule(0.5, 250000L);
		} else if (price < 100000000) {
			rule = new BrokerageRule(0.4, 400000L);
		} else if (price < 300000000) {
			rule = new BrokerageRule(0.3, null);
		} else if (price < 600000000) {
			rule = new BrokerageRule(0.4, null);
		} else {
			rule = new BrokerageRule(0.8, null);
		}
		return rule;
	}
}
