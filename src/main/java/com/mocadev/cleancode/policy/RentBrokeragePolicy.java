package com.mocadev.cleancode.policy;

import java.util.Arrays;
import java.util.List;
import lombok.Getter;

/**
 * 임대차일 때 중계수수료를 계산해주는 클래스
 *
 * @author chcjswo
 * @version 1.0.0
 * @blog https://mocadev.tistory.com
 * @github https://github.com/chcjswo
 * @since 2022-03-12
 **/
@Getter
public class RentBrokeragePolicy implements BrokeragePolicy {

	private final List<BrokerageRule> rules;

	public RentBrokeragePolicy() {
		this.rules = Arrays.asList(
			new BrokerageRule(50_000_000L, 0.5, 250000L),
			new BrokerageRule(100000000L, 0.4, 400000L),
			new BrokerageRule(300000000L, 0.3),
			new BrokerageRule(600000000L, 0.4),
			new BrokerageRule(Long.MAX_VALUE, 0.8)
		);
	}
}
