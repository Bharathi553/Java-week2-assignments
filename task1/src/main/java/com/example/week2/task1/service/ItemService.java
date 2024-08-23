package com.example.week2.task1.service;

import com.example.week2.task1.model.Item;
import com.example.week2.task1.repository.ItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Service
public class ItemService {

    @Autowired
    private ItemRepository itemRepository;

    @GetMapping
    public List<Item> getAllItem(){
        return itemRepository.findAll();
    }
    @PostMapping
    public Item createItem(Item item){
        return itemRepository.save(item);
    }

    public Item updateItem(Long id, Item itemDetails) {
        Item item=itemRepository.findById(id).orElseThrow(() -> new RuntimeException("Item not found"));

        item.setName(itemDetails.getName());
        item.setDescription(itemDetails.getDescription());
        item.setQuantity(itemDetails.getQuantity());
        item.setPrice(itemDetails.getPrice());

        return itemRepository.save(item);
    }

    public void deleteItem(Long id) {
        Item item=itemRepository.findById(id).orElseThrow(() -> new RuntimeException("Item not found"));
        itemRepository.delete(item);
    }
}
