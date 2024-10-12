package cmcc.dbi.service.impl;

import cmcc.dbi.dto.ItemPageQueryDTO;
import cmcc.dbi.entity.InspectionItem;
import cmcc.dbi.mapper.InspectionItemMapper;
import cmcc.dbi.result.PageResult;
import cmcc.dbi.service.InspectionItemService;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class InspectionItemServiceImpl implements InspectionItemService {

    @Autowired
    private InspectionItemMapper inspectionItemMapper;

    @Override
    public void addInspectionItem(InspectionItem inspectionItem) {
        inspectionItemMapper.addItem(inspectionItem);
    }

    @Override
    public PageResult pageQuery(ItemPageQueryDTO itemPageQueryDTO) {
        PageHelper.startPage(itemPageQueryDTO.getPageNum(),10);
        Page<InspectionItem> page = inspectionItemMapper.pageQuery(itemPageQueryDTO);
        return null;
    }
}
