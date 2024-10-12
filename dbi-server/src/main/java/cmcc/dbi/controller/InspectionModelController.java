package cmcc.dbi.controller;

import cmcc.dbi.entity.InspectionModel;
import cmcc.dbi.result.Result;
import cmcc.dbi.service.InspectionModelService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/admin/inspection/model")
@Api("巡检模板相关业务")
@Slf4j
public class InspectionModelController {

    private InspectionModelService inspectionModelService;

    /**
     * 创建巡检模板
     * @param inspectionModel
     * @return
     */
    @ApiOperation("创建巡检模板")
    @PostMapping
    public Result CreateInspectionModel(InspectionModel inspectionModel){
        log.info("创建巡检模板:{}",inspectionModel.getModelId());
        inspectionModelService.addInspectionModel(inspectionModel);
        return Result.success();
    }

    /**
     * 删除巡检模板
     * @param modelId
     * @return
     */
    @ApiOperation("删除巡检模板")
    @PostMapping("/delete")
    public Result DeleteInspectionModel(Long modelId){
        log.info("删除巡检模板:{}",modelId);
        inspectionModelService.deleteInspectionModel(modelId);
        return Result.success();
    }

    /**
     * 更新巡检模板
     * @param inspectionModel
     * @return
     */
    @ApiOperation("更新巡检模板")
    @PostMapping("/update")
    public Result UpdateInspectionModel(InspectionModel inspectionModel){
        log.info("更新巡检模板:{}",inspectionModel.getModelId());
        inspectionModelService.updateInspectionModel(inspectionModel);
        return Result.success();
    }

    @ApiOperation("查看巡检模板细节")
    @GetMapping
    public Result<InspectionModel> getInspectionModel(){
        log.info("查看巡检模板细节");
        InspectionModel model = inspectionModelService.getInspectionModel();
        return Result.success(model);
    }
}
