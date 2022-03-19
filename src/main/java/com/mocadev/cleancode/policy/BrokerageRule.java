package com.mocadev.cleancode.policy;

import lombok.AllArgsConstructor;
import lombok.Getter;
import org.springframework.lang.Nullable;

/**
 * @author chcjswo
 * @version 1.0.0
 * @blog https://mocadev.tistory.com
 * @github https://github.com/chcjswo
 * @since 2022-03-12
 *
 * <p>
 *     가격이 특정 범위일 때 상한효율과 상한금액 가지는 클래스
 * </p>
 **/
@Getter
@AllArgsConstructor
public class BrokerageRule {

	private Long lessThan;
	private Double brokeragePercent;
	private Long limitAmount;

	public BrokerageRule(Long lessThan, Double brokeragePercent) {
		this(lessThan, brokeragePercent, Long.MAX_VALUE);
	}

	public Long calcMaxBrokerage(Long price) {
		return Math.min(multiplyPercent(price), limitAmount);
	}

	private Long multiplyPercent(Long price) {
		return Double.valueOf(Math.floor(brokeragePercent / 100 * price)).longValue();
	}
}
