package cmcc.dbi.service;

import cmcc.dbi.dto.ScriptPageQueryDTO;
import cmcc.dbi.entity.InspectionScript;
import cmcc.dbi.result.PageResult;

/**
* @author Wang
* @description 针对表【inspectionscript】的数据库操作Service
* @createDate 2024-10-11 09:22:10
*/
public interface InspectionScriptService{
    /**
     * 添加巡检脚本
     * @param InspectionScript
     */
    void addInspectionscript(InspectionScript InspectionScript);

    /**
     * 删除巡检脚本
     * @param scriptId
     */
    void deleteInspectionScript(Long scriptId);

    /**
     * 更新巡检脚本
     * @param inspectionScript
     */
    void updateInspectionScript(InspectionScript inspectionScript);

    /**
     * 查询巡检脚本细节
     * @return InspectionScript
     */
    InspectionScript getInspectionScript(Long scriptId);


    /**
     * 分页查询巡检脚本
     * @param scriptPageQueryDTO
     * @return
     */
    PageResult pageQuery(ScriptPageQueryDTO scriptPageQueryDTO);
}
