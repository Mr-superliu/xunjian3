package cmcc.dbi.service;

import cmcc.dbi.dto.ItemPageQueryDTO;
import cmcc.dbi.entity.InspectionItem;
import cmcc.dbi.result.PageResult;

public interface InspectionItemService {
    /**
     * 添加巡检项
     * @param inspectionItem
     */
    void addInspectionItem(InspectionItem inspectionItem);

    /**
     * 巡检项分页查询
     * @param itemPageQueryDTO
     * @return
     */
    PageResult pageQuery(ItemPageQueryDTO itemPageQueryDTO);
}
