package cmcc.dbi.controller;

import cmcc.dbi.dto.ItemPageQueryDTO;
import cmcc.dbi.entity.InspectionItem;
import cmcc.dbi.result.PageResult;
import cmcc.dbi.result.Result;
import cmcc.dbi.service.InspectionItemService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/admin/inspection/item")
@Api("巡检项相关业务")
@Slf4j
public class InspectionItemController {

    @Autowired
    private InspectionItemService inspectionItemService;

    /**
     * 创建巡检项
     * @param inspectionItem
     * @return
     */
    @PostMapping
    @ApiOperation("创建巡检项")
    public Result CreateInspectionItem(InspectionItem inspectionItem){
        // 将选择的巡检脚本封装成巡检项
        inspectionItemService.addInspectionItem(inspectionItem);
        return Result.success();
    }

    /**
     * 编辑巡检项
     * @param inspectionItem
     * @return
     */
    @PostMapping("/update")
    @ApiOperation("编辑巡检项")
    public Result UpdateInspectionItem(InspectionItem inspectionItem){
        return Result.success();
    }

    /**
     * 删除巡检项
     * @param itemId
     * @return
     */
    @PostMapping("/delete")
    @ApiOperation("删除巡检项")
    public Result DeleteInspectionItem(Integer itemId){
        return Result.success();
    }

    /**
     * 查询巡检项
     * @param itemId
     * @return
     */
    @GetMapping("/detail")
    @ApiOperation("查询巡检项")
    public Result<InspectionItem> getInspectionItem(Integer itemId){
        return Result.success();
    }

    /**
     * 查看巡检项列表
     * @param
     * @return
     */
    @GetMapping("/list")
    @ApiOperation("查看巡检项列表")
    public Result<PageResult> getInspectionItemList(ItemPageQueryDTO itemPageQueryDTO){
        PageResult pageResult = inspectionItemService.pageQuery(itemPageQueryDTO);
        return Result.success(pageResult);
    }

}
