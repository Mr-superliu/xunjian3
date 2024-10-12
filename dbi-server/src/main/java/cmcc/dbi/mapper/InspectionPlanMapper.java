package cmcc.dbi.mapper;

import cmcc.dbi.entity.InspectionPlan;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface InspectionPlanMapper {
    /**
     * 新增巡检计划
     * @param inspectionPlan
     */
    @Insert("insert into inspection_plan(" +
            "plan_name,create_people,start_time,end_time," +
            "exec_type,inspection_type,inspection_status," +
            "model_id,db_id,inspection_item_num,error_item_num,report_path) " +
            "values(" +
            "#{planName},#{createPeople},#{startTime},#{endTime},#{execType}," +
            "#{inspectionType},#{inspectionStatus},#{modelId},#{dbId},#{inspectionItemNum}," +
            "#{errorItemNum},#{reportPath}")
    void addInspectionPlan(InspectionPlan inspectionPlan);



    /**
     * 删除巡检计划
     * @param planId
     */
    @Delete("delete from inspection_plan where plan_id=#{planId}")
    void deleteInspectionPlan(Long planId);

    /**
     * 查看巡检计划细节
     */
    @Select("select * from inspection_plan")
    InspectionPlan getInspectionPlan();

    /**
     * 更新巡检计划
     * @param inspectionPlan
     */
    void updateInspectionPlan(InspectionPlan inspectionPlan);
}
