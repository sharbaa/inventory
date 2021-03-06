package com.inventory.inventorymgmt.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.inventory.inventorymgmt.model.Inventory;
import com.inventory.inventorymgmt.repository.InventoryRepository;

/**
 * 
 * @author badsharma
 *
 */
@Service
public class InventoryService {

	@Autowired
	private InventoryRepository inventoryRepository;
	
	
	/**
	 * 
	 * @return
	 */
	public List<Inventory>  getInventoryDetails(){
		return inventoryRepository.findAll();
	}

	/**
	 * 
	 * @param productInfo
	 */
	public void  saveInventoryDetails(Inventory inventoryInfo){
		 inventoryRepository.save(inventoryInfo);
	}
	
	/**
	 * 
	 * @param id
	 * @return
	 */
	public 	Inventory findByInventoryId(Integer id){
		return inventoryRepository.findByInvetoryId(id);
	}
	
	public void removeInventoryDetails(Integer id){
		inventoryRepository.deleteInventoryByInvetoryId(id);
	}
	
	/**
	 * 
	 * @param id
	 * @return
	 */
	public 	Inventory findInventoryByProductId(Integer id){
		return inventoryRepository.findByProuctId(id);
	}
}
