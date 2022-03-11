package com.mocadev.cleancode.policy;

import com.mocadev.cleancode.contants.ActionType;

/**
 * @author chcjswo
 * @version 1.0.0
 * @blog https://mocadev.tistory.com
 * @github https://github.com/chcjswo
 * @since 2022-03-12
 **/
public class BrokeragePolicyFactory {

	public static BrokeragePolicy of(ActionType actionType) {
		switch (actionType) {
			case RENT:
				return new RentBrokeragePolicy();
			case PURCHASE:
				return new PurchaseBrokeragePolicy();
			default:
				throw new IllegalArgumentException("해당 actionType에 대한 정책이 존재하지 않습니다.");
		}
	}
}
