package cn.e3mall.controller;

import com.liuchaoya.bean.E3Result;
import com.liuchaoya.code.NetResultCode;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;

import cn.e3mall.interfaces.ItemService;
import cn.e3mall.pojo.TbItem;

/**
 * Created by liuchaoya on 2018/8/1.
 * For lukekeji bulu
 */
@Controller
public class ItemController {
    @Resource
    private ItemService itemService;

    @RequestMapping("/item/{itemId}")
    @ResponseBody
    private E3Result getItemById(@PathVariable Long itemId) {
        E3Result result = new E3Result();
        try{
            TbItem tbItem = itemService.getItemById(itemId);
            result.resultCode = 0;
            result.requestStatus = NetResultCode.SUCCESS;
            result.resultMsg = "成功";
            result.data = tbItem;
        }catch (Exception e){
            e.printStackTrace();
            result.requestStatus = NetResultCode.ERROR;
            result.resultMsg = "服务器异常了";
        }

        return result;
    }
}
