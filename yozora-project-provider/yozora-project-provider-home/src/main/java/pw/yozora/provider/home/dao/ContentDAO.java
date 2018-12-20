package pw.yozora.provider.home.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;
import pw.yozora.provider.home.entity.Content;

import java.util.List;

/**
 * 描述： content dao
 *
 * @author ChenJianChuan
 * @date 2018/12/12 17:29
 */
public interface ContentDAO extends JpaRepository<Content, Long> {

    /**
     * 根据类型查询
     *
     * @param type
     * @return
     */
    List<Content> findAllByType(int type);

    /**
     * 修改
     *
     * @param content
     */
    @Transactional
    @Modifying
    @Query(value = "update yp_home_content y  set y.title=:title, y.content=:content where y.id=:id", nativeQuery = true)
    void updateContent(String title, String content, Long id);
}
