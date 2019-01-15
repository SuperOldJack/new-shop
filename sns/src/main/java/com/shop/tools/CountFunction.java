package com.shop.tools;

import java.util.Map;

@FunctionalInterface
public interface CountFunction {
	int getCount(Map<String, Object> map);
}
