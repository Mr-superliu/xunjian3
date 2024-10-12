package cmcc.dbi.mapper;

import cmcc.dbi.entity.InspectionModel;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface InspectionModelMapper {

    /**
     * 创建巡检模板
     * @param inspectionModel
     */
    @Insert("insert into inspection_model(model_name,create_people,create_time,db_id," +
            "inspection_item_num,error_item_num,report_path,inspection_status) " +
            "values(#{modelName},#{createPeople},#{createTime},#{dbId},#{inspectionItemNum}," +
            "#{errorItemNum},#{reportPath},#{inspectionStatus})")
    public void addInspectionModel(InspectionModel inspectionModel);

    /**
     * 删除巡检模板
     * @param modelId
     */
    @Delete("delete from inspection_model where model_id=#{modelId}")
    void deleteInspectionModel(Long modelId);

    /**
     * 更新巡检模板
     * @param inspectionModel
     */
    void updateInspectionModel(InspectionModel inspectionModel);

    /**
     * 获取巡检模板细节
     * @return
     */
    @Select("select * from inspection_model")
    InspectionModel getInspectionModel();
}
