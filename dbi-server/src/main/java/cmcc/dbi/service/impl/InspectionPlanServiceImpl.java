package cmcc.dbi.service.impl;

import cmcc.dbi.entity.InspectionPlan;
import cmcc.dbi.mapper.InspectionPlanMapper;
import cmcc.dbi.service.InspectionPlanService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class InspectionPlanServiceImpl implements InspectionPlanService {

    @Autowired
    private InspectionPlanMapper inspectionPlanMapper;

    /**
     * 创建巡检计划
     * @param inspectionPlan
     */
    public void addInspectionPlan(InspectionPlan inspectionPlan) {
        inspectionPlanMapper.addInspectionPlan(inspectionPlan);
    }

    /**
     * 删除巡检计划
     * @param planId
     */
    public void deleteInspectionPlan(Long planId) {
        inspectionPlanMapper.deleteInspectionPlan(planId);
    }

    /**
     * 编辑：更新巡检计划
     * @param inspectionPlan
     */
    public void updateInspectionPlan(InspectionPlan inspectionPlan) {
        inspectionPlanMapper.updateInspectionPlan(inspectionPlan);
    }

    /**
     * 查看巡检计划细节
     */
    public InspectionPlan getInspectionPlan() {
        InspectionPlan inspectionPlan = inspectionPlanMapper.getInspectionPlan();
        return inspectionPlan;
    }



}
