package cn.zyy.controller;

import cn.zyy.domain.Item;
import cn.zyy.service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @Author: Zz
 * @Date: 2023/11/16/18:00
 * @Description: 致敬
 */
@RestController
@RequestMapping("/item")
public class ItemController {

    @Autowired
    ItemService itemService;

    @PostMapping
    public boolean save(@RequestBody Item item){
       return itemService.save(item);
    }

    @PutMapping
    public boolean update(@RequestBody Item item){
      return itemService.update(item);
    }

    @DeleteMapping("/{id}")
    public boolean delete(@PathVariable Long id){
        return itemService.delete(id);
    }

    @GetMapping("/{id}")
    public Item getById(@PathVariable Long id){
        return  itemService.getById(id);
    }

    @GetMapping
    public List<Item> list(){
        return itemService.lists();
    }
}
