package cmcc.dbi.controller;

import cmcc.dbi.entity.InspectionPlan;
import cmcc.dbi.result.Result;
import cmcc.dbi.service.InspectionPlanService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/admin/inspection/plan")
@Api("巡检计划相关业务")
@Slf4j
public class InspectionPlanController {

    @Autowired
    private InspectionPlanService inspectionPlanService;

    /**
     * 创建巡检计划
     * @param inspectionPlan
     * @return
     */
    @PostMapping
    @ApiOperation("创建巡检计划")
    public Result CreateInspectionPlan(InspectionPlan inspectionPlan){
        log.info("创建巡检计划");
        inspectionPlanService.addInspectionPlan(inspectionPlan);
        return Result.success();
    }

    /**
     * 删除巡检计划
     * @param planId
     * @return
     */
    @PostMapping("/delete")
    @ApiOperation("删除巡检计划")
    public Result DeleteInspectionPlan(Long planId){
        log.info("删除巡检计划");
        inspectionPlanService.deleteInspectionPlan(planId);
        return Result.success();
    }

    /**
     * 更新巡检计划
     * @param inspectionPlan
     * @return
     */
    @PostMapping("/update")
    @ApiOperation("更新巡检计划")
    public Result UpdateInspectionPlan(InspectionPlan inspectionPlan){
        log.info("更新巡检计划");
        inspectionPlanService.updateInspectionPlan(inspectionPlan);
        return Result.success();
    }

    /**
     * 查看巡检计划细节
     * @return
     */
    @GetMapping
    @ApiOperation("查看巡检计划细节")
    public Result<InspectionPlan> getInspectionPlan(){
        InspectionPlan inspectionPlan = inspectionPlanService.getInspectionPlan();
        return Result.success(inspectionPlan);
    }

    /**
     * 查看巡检计划列表
     * @return
     */
    @GetMapping("/list")
    @ApiOperation("查看巡检计划列表")
    public Result<List<InspectionPlan>> getInspectionPlanList(){
        log.info("查看巡检计划列表");
        // TODO: 这里待定，是否为分页查询
        return Result.success();
    }

}
