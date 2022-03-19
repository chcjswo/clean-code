package com.mocadev.cleancode.policy;

import java.util.Arrays;
import java.util.List;
import lombok.Getter;

/**
 * 매매일 때 중계수수료를 계산해주는 클래스
 *
 * @author chcjswo
 * @version 1.0.0
 * @blog https://mocadev.tistory.com
 * @github https://github.com/chcjswo
 * @since 2022-03-12
 **/
@Getter
public class PurchaseBrokeragePolicy implements BrokeragePolicy {

	private final List<BrokerageRule> rules;

	public PurchaseBrokeragePolicy() {
		this.rules = Arrays.asList(
			new BrokerageRule(50_000_000L, 0.6, 250000L),
			new BrokerageRule(200000000L, 0.5, 800000L),
			new BrokerageRule(600000000L, 0.4),
			new BrokerageRule(900000000L, 0.5),
			new BrokerageRule(Long.MAX_VALUE, 0.9)
		);
	}

}
