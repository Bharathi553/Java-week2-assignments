package com.example.week2.task1.controller;

import com.example.week2.task1.model.Item;
import com.example.week2.task1.service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/items")

public class ItemController {


    @Autowired
    private ItemService itemService;

    @GetMapping
    public List<Item> getAllItem(){
        return itemService.getAllItem();
    }

    @GetMapping("/{id}")
    public Item getItemById(@PathVariable Long id) {
        return itemService.getItemById(id);
    }

    @PostMapping
    public Item createItem( @RequestBody Item item){
        return itemService.createItem(item);
    }
    @PutMapping("/{id}")
    public Item updateItem(@PathVariable Long id, @RequestBody Item itemDetails){
       return itemService.updateItem(id, itemDetails);
    }

    @DeleteMapping("/{id}")
    public void deleteItem(@PathVariable Long id){
        itemService.deleteItem(id);
    }

}
