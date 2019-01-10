package com.shop.tools;

import java.util.List;
import java.util.Map;

@FunctionalInterface
public interface FindFunction<T> {
	List<T> find(Map map);
}
