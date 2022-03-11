package com.mocadev.cleancode.contants;

import lombok.AllArgsConstructor;

/**
 * @author chcjswo
 * @version 1.0.0
 * @blog https://mocadev.tistory.com
 * @github https://github.com/chcjswo
 * @since 2022-03-12
 **/
@AllArgsConstructor
public enum ActionType {

	PURCHASE("매매"),
	RENT("임대차");

	private String description;
}
