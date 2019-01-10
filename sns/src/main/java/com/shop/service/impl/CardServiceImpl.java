package com.shop.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.shop.mapper.CardMapper;
import com.shop.pojo.Card;
import com.shop.service.CardService;

@Service("cardService")
public class CardServiceImpl implements CardService {

	@Autowired
	private CardMapper cardMapper;
	
	public List<Card> queryAllCard() {
		return cardMapper.selectAllCard();
	}

}
