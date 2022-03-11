package com.mocadev.cleancode.controller;

import com.mocadev.cleancode.contants.ActionType;
import com.mocadev.cleancode.policy.BrokeragePolicy;
import com.mocadev.cleancode.policy.BrokeragePolicyFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author chcjswo
 * @version 1.0.0
 * @blog https://mocadev.tistory.com
 * @github https://github.com/chcjswo
 * @since 2022-03-12
 **/
@RestController
public class BrokerageQueryController {

	@GetMapping("/api/calc/brokerage")
	public Long calcBrokerage(@RequestParam ActionType actionType,
							  @RequestParam Long price) {
		final BrokeragePolicy brokeragePolicy = BrokeragePolicyFactory.of(actionType);
		return brokeragePolicy.calculate(price);
	}
}
