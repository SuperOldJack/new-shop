package com.shop.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.shop.pojo.Card;
import com.shop.service.CardService;

@Controller
@RequestMapping("/card")
public class CardControlle {
	@Autowired
	private CardService cardService;
	
	@RequestMapping("/getCard")
	@ResponseBody
	public List<Card> getCardList(){
		List<Card> queryAllCard = cardService.queryAllCard();
		return queryAllCard;
	}
}
