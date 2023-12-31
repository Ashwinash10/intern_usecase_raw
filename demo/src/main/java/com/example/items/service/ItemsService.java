package com.example.items.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

//import com.example.items.dto.ItemsDataDto;
import com.example.items.model.Items;
import com.example.items.repository.ItemRepo;

@Service
public class ItemsService {
	@Autowired
	private ItemRepo itemrepo;
	
	public boolean checkItemService(String itemName) {
		String itemDes= itemrepo.checkItem(itemName);
		if(itemDes==null) {
			return false;
		}
		return true;
	}
	
	public ResponseEntity<List<Items>> getAllItemsData(){
		List<Items> itemsList=itemrepo.findAll();
		return new ResponseEntity<>(itemsList,HttpStatus.OK);
	}
	
	public String getIndividualItemData(String ItemName){
		String item = itemrepo.getIndividualItemByName(ItemName);
		return item;
	}
}
