package cmcc.dbi.mapper;


import cmcc.dbi.dto.ItemPageQueryDTO;
import cmcc.dbi.entity.InspectionItem;
import com.github.pagehelper.Page;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface InspectionItemMapper {

    void addItem(InspectionItem inspectionItem);

    Page<InspectionItem> pageQuery(ItemPageQueryDTO itemPageQueryDTO);
}
