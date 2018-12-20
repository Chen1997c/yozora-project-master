package pw.yozora.provider.home.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pw.yozora.common.exception.BusinessException;
import pw.yozora.provider.home.dao.ContentDAO;
import pw.yozora.provider.home.entity.Content;
import pw.yozora.provider.home.service.ContentService;

import java.util.Date;
import java.util.List;

/**
 * 描述： content业务实现类
 *
 * @author ChenJianChuan
 * @date 2018/12/12　17:32
 */
@Service
public class ContentServiceImpl implements ContentService {

    @Autowired
    private ContentDAO contentDAO;

    @Override
    public List<Content> listByType(int type) {
        try {
            return contentDAO.findAllByType(type);
        }catch (Exception e) {
            throw new BusinessException("查询内容异常");
        }
    }

    @Override
    public void addContent(Content content) {
        try {
            content.setCreateTime(new Date());
            content.setUpdateTime(new Date());
            contentDAO.save(content);
        }catch (Exception e) {
            throw new BusinessException("添加内容异常");
        }
    }

    @Override
    public void deleteContent(Long id) {
        try {
            contentDAO.deleteById(id);
        }catch (Exception e) {
            throw new BusinessException("添加内容异常");
        }
    }

    @Override
    public void updateContent(Content content) {
        try {
            contentDAO.updateContent(content.getTitle(),content.getContent(),content.getId());
        }catch (Exception e) {
            throw new BusinessException("修改内容异常");
        }
    }
}
