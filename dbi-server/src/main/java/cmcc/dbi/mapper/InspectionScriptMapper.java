package cmcc.dbi.mapper;

import cmcc.dbi.dto.ScriptPageQueryDTO;
import cmcc.dbi.entity.InspectionScript;
import com.github.pagehelper.Page;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;


@Mapper
public interface InspectionScriptMapper{


    /**
     * 新增巡检脚本
     * @param inspectionscript
     */
    @Insert("insert into inspection_script(" +
            "script_name,script_type,tech_stack,category_name," +
            "inspection_category,db_version,os_type,description," +
            "script_content,input,output)" +
            "values(" +
            "#{scriptName},#{scriptType},#{techStack},#{categoryName}," +
            "#{inspectionCategory},#{dbVersion},#{osType},#{description}," +
            "#{scriptContent},#{input},#{output})")
    void addInspectionscript(InspectionScript inspectionscript);


    /**
     * 删除巡检脚本
     * @param scriptId
     */
    @Delete("delete from inspection_script where script_id = #{scriptId}")
    void deleteInspectionScript(Long scriptId);

    /**
     * 更新巡检脚本
     * @param inspectionScript
     */
    void updateInspectionScript(InspectionScript inspectionScript);

    /**
     * 查询巡检脚本细节
     * @return
     */
    @Select("select * from inspection_script where script_id = #{scriptId}")
    InspectionScript getInspectionScript(Long scriptId);

    /**
     * 分页查询巡检脚本
     * @param scriptPageQueryDTO
     * @return
     */
    Page<InspectionScript> pageQuery(ScriptPageQueryDTO scriptPageQueryDTO);
}




