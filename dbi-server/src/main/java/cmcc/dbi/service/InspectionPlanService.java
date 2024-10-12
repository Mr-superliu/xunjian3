package cmcc.dbi.service;

import cmcc.dbi.entity.InspectionPlan;

import java.util.List;

public interface InspectionPlanService {

    /**
     * 创建巡检计划
     * @param inspectionPlan
     */
    void addInspectionPlan(InspectionPlan inspectionPlan);

    /**
     * 删除巡检计划
     * @param planId
     */
    void deleteInspectionPlan(Long planId);

    /**
     * 更新巡检计划
     * @param inspectionPlan
     */
    void updateInspectionPlan(InspectionPlan inspectionPlan);

    /**
     * 查看巡检计划细节
     */
    InspectionPlan getInspectionPlan();
}
