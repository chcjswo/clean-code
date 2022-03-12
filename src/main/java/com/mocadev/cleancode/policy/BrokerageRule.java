package com.mocadev.cleancode.policy;

import lombok.AllArgsConstructor;
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
@AllArgsConstructor
public class BrokerageRule {

	private Double brokeragePercent;
	@Nullable
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
