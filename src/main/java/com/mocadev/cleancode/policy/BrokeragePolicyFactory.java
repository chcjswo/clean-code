package com.mocadev.cleancode.policy;

import com.mocadev.cleancode.contants.ActionType;
import com.mocadev.cleancode.exception.ErrorCode;
import com.mocadev.cleancode.exception.HouseUtilsException;

/**
 * @author chcjswo
 * @version 1.0.0
 * @blog https://mocadev.tistory.com
 * @github https://github.com/chcjswo
 * @since 2022-03-12
 **/
public class BrokeragePolicyFactory {

	private static final RentBrokeragePolicy rentBrokeragePolicy = new RentBrokeragePolicy();
	private static final PurchaseBrokeragePolicy purchaseBrokeragePolicy = new PurchaseBrokeragePolicy();

	public static BrokeragePolicy of(ActionType actionType) {
		switch (actionType) {
			case RENT:
				return rentBrokeragePolicy;
			case PURCHASE:
				return purchaseBrokeragePolicy;
			default:
				throw new HouseUtilsException(ErrorCode.INVALID_REQUEST, "해당 actionType에 대한 정책이 존재하지 않습니다.");
		}
	}
}
