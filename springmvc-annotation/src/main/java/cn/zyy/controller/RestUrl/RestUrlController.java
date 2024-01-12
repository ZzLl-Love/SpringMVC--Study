package cn.zyy.controller.RestUrl;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

/**
 * @Author: Zz
 * @Date: 2023/11/20/23:51
 * @Description: 致敬
 */
@RequestMapping("/rest")
@RestController
public class RestUrlController {

    /**
     * get 请求对应查询
     * @return
     */
    @GetMapping("/{id}")
    public String query(@PathVariable("id") String id){
        System.out.println("查询"+ id);
        return "@GetMapping查询到的物品"+id;
    }

    /**
     * post -- 保存
     */
    @PostMapping("/{id}")
    public String save(@PathVariable("id") String id){
        System.out.println("保存的id：" + id);
        return "@PostMapping 保存的物品id: " + id;
    }

    /**
     * 删除
     * @param id
     * @return
     */
    @DeleteMapping("/{id}")
    public String delete(@PathVariable("id") String id){
        System.out.println("删除的id: " + id);
        return "@DeleteMapping 删除的物品"+ id;
    }

    /**
     * 修改
     * @param id
     * @return
     */
    @PutMapping("/{id}")
    public String update(@PathVariable("id") String id){
        System.out.println("修改的id:" + id);
        return "@PutMapping 修改物品的id"+id;
    }
}
