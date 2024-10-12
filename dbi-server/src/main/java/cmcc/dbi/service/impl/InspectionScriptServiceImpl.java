package cmcc.dbi.service.impl;

import cmcc.dbi.dto.ScriptPageQueryDTO;
import cmcc.dbi.entity.InspectionScript;
import cmcc.dbi.mapper.InspectionScriptMapper;
import cmcc.dbi.result.PageResult;
import cmcc.dbi.service.InspectionScriptService;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
* @author Wang
* @description 针对表【inspectionscript】的数据库操作Service实现
* @createDate 2024-10-11 09:22:10
*/
@Service
public class InspectionScriptServiceImpl implements InspectionScriptService {

    @Autowired
    private InspectionScriptMapper inspectionScriptMapper;

    /**
     * 添加巡检脚本
     * @param inspectionScript
     * @return
     */
    public void addInspectionscript(InspectionScript inspectionScript) {
        inspectionScriptMapper.addInspectionscript(inspectionScript);
    }

    /**
     * 删除巡检脚本
     * @param scriptId
     */
    public void deleteInspectionScript(Long scriptId) {
        inspectionScriptMapper.deleteInspectionScript(scriptId);
    }

    /**
     * 编辑: 更新巡检脚本
     * @param inspectionScript
     */
    public void updateInspectionScript(InspectionScript inspectionScript) {
        inspectionScriptMapper.updateInspectionScript(inspectionScript);
    }

    /**
     * 查询巡检脚本细节
     * @return
     */
    public InspectionScript getInspectionScript(Long scriptId) {
        InspectionScript inspectionScript = inspectionScriptMapper.getInspectionScript(scriptId);
        return inspectionScript;
    }

    /**
     * 分页查询巡检脚本
     * @param scriptPageQueryDTO
     * @return
     */
    public PageResult pageQuery(ScriptPageQueryDTO scriptPageQueryDTO) {
        // select * from inspection_script limit 0,10
        //开始分页查询
        PageHelper.startPage(scriptPageQueryDTO.getPage(), scriptPageQueryDTO.getPageSize());
        Page<InspectionScript> page = inspectionScriptMapper.pageQuery(scriptPageQueryDTO);

        long total = page.getTotal();
        List<InspectionScript> records = page.getResult();

        return new PageResult(total, records);
    }
}




