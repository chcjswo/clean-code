package com.mocadev.cleancode.policy;

import com.mocadev.cleancode.exception.ErrorCode;
import com.mocadev.cleancode.exception.HouseUtilsException;
import java.util.List;

/**
 * @author chcjswo
 * @version 1.0.0
 * @blog https://mocadev.tistory.com
 * @github https://github.com/chcjswo
 * @since 2022-03-12
 **/
public interface BrokeragePolicy {

	List<BrokerageRule> getRules();

	default Long calculate(Long price) {
		final BrokerageRule brokerageRule = getRules().stream()
			.filter(rule -> price < rule.getLessThan())
			.findFirst()
			.orElseThrow(() -> new HouseUtilsException(ErrorCode.INTERNAL_ERROR));
		return brokerageRule.calcMaxBrokerage(price);
	}

}
