package cmcc.dbi.service.impl;

import cmcc.dbi.entity.InspectionModel;
import cmcc.dbi.mapper.InspectionModelMapper;
import cmcc.dbi.service.InspectionModelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class InspectionModelImpl implements InspectionModelService {

    @Autowired
    private InspectionModelMapper inspectionModelMapper;

    /**
     * 创建巡检模板
     * @param inspectionModel
     */
    public void addInspectionModel(InspectionModel inspectionModel) {
        inspectionModelMapper.addInspectionModel(inspectionModel);
    }

    /**
     * 删除巡检模板
     * @param modelId
     */
    public void deleteInspectionModel(Long modelId) {
        inspectionModelMapper.deleteInspectionModel(modelId);
    }

    /**
     * 更新巡检模板
     * @param inspectionModel
     */
    public void updateInspectionModel(InspectionModel inspectionModel) {
        inspectionModelMapper.updateInspectionModel(inspectionModel);
    }

    /**
     * 查看巡检模板细节
     * @return
     */
    public InspectionModel getInspectionModel() {
        InspectionModel model = inspectionModelMapper.getInspectionModel();
        return model;
    }
}
