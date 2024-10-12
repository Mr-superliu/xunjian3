package cmcc.dbi.service;

import cmcc.dbi.entity.InspectionModel;

public interface InspectionModelService {

    /**
     * 创建巡检模板
     * @param inspectionModel
     */
    void addInspectionModel(InspectionModel inspectionModel);

    /**
     * 删除巡检模板
     * @param modelId
     */
    void deleteInspectionModel(Long modelId);

    /**
     * 更新巡检模板
     */
    void updateInspectionModel(InspectionModel inspectionModel);

    /**
     * 查看巡检模板细节
     * @return
     */
    InspectionModel getInspectionModel();
}
