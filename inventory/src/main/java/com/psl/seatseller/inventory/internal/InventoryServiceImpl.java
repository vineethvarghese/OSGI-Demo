package com.psl.seatseller.inventory.internal;

import com.psl.seatseller.inventory.Inventory;
import com.psl.seatseller.inventory.InventoryService;
import org.springframework.stereotype.Service;

@Service("inventoryService")
public class InventoryServiceImpl implements InventoryService {
    public Inventory getInventory(Long id) {
        return new Inventory("BLR_MUM", "KA05-MD234");
    }
}
