package pw.yozora.provider.home.service;

import pw.yozora.provider.home.entity.Content;

import java.util.List;

/**
 * 描述： content 业务接口
 *
 * @author ChenJianChuan
 * @date 2018/12/12　17:32
 */
public interface ContentService {

    /**
     * 根据类型获取内容
     * @param type
     * @return
     */
    List<Content> listByType(int type);

    /**
     * 添加内容
     * @param content
     */
    void addContent(Content content);

    /**
     * 删除内容
     * @param id
     */
    void deleteContent(Long id);

    /**
     * 修改内容
     * @param content
     */
    void updateContent(Content content);
}
