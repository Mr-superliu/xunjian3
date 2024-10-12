package cmcc.dbi.controller;

import cmcc.dbi.dto.ScriptPageQueryDTO;
import cmcc.dbi.entity.InspectionScript;
import cmcc.dbi.result.PageResult;
import cmcc.dbi.result.Result;
import cmcc.dbi.service.InspectionScriptService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/admin/inspection/script")
@Api("巡检脚本相关业务")
@Slf4j
public class InspectionScriptController {

    @Autowired
    private InspectionScriptService inspectionScriptService;

    /**
     * 添加巡检脚本
     * @param inspectionScript
     * @return
     */
    @PostMapping
    @ApiOperation("创建巡检脚本")
    public Result creatInspectionScript(@RequestBody InspectionScript inspectionScript) {
        log.info("创建巡检脚本");
        inspectionScriptService.addInspectionscript(inspectionScript);
        return Result.success();

    }

    /**
     * 删除巡检脚本
     *
     * @param scriptId 巡检脚本ID
     * @return Result对象，表示操作结果
     */
    @PostMapping("/delete/{scriptId}")
    @ApiOperation("删除巡检脚本")
    public Result deleteInspectionScript(@PathVariable Long scriptId) {
        log.info("删除巡检脚本");
        inspectionScriptService.deleteInspectionScript(scriptId);
        return Result.success();
    }

    /**
     * 更新巡检脚本
     * @param inspectionScript
     * @return
     */
    @PostMapping("/update")
    @ApiOperation("更新巡检脚本")
    public Result updateInspectionScript(@RequestBody InspectionScript inspectionScript) {
        log.info("更新巡检脚本");
        inspectionScriptService.updateInspectionScript(inspectionScript);
        return Result.success();
    }

    /**
     * 查看巡检脚本细节
     * @return
     */
    @GetMapping("/{scriptId}")
    @ApiOperation("查看巡检脚本细节")
    public Result<InspectionScript> getInspectionScript(@PathVariable Long scriptId) {
        log.info("查看巡检脚本细节");
        InspectionScript inspectionScript = inspectionScriptService.getInspectionScript(scriptId);
        return Result.success(inspectionScript);
    }

    /**
     * 查看巡检脚本列表
     * @return
     */
    @GetMapping("/list")
    @ApiOperation("查看巡检脚本列表")
    public Result<PageResult> getInspectionScriptList(ScriptPageQueryDTO scriptPageQueryDTO) {
        log.info("查看巡检脚本列表");
        log.info("员工分页查询，参数为：{}", scriptPageQueryDTO);
        PageResult pageResult = inspectionScriptService.pageQuery(scriptPageQueryDTO);
        // TODO 实现查看巡检脚本表
        return Result.success(pageResult);
    }

}
