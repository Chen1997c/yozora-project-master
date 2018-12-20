package pw.yozora.provider.home.service;

import org.springframework.web.multipart.MultipartFile;
import pw.yozora.provider.home.entity.Carousel;

import java.util.List;

/**
 * 描述： 轮播业务接口
 *
 * @author ChenJianChuan
 * @date 2018/12/17　11:35
 */
public interface CarouselService {

    /**
     * 查询全部
     * @return
     */
    List<Carousel> getAll();

    /**
     * 根据id删除
     * @param id
     */
    void deleteCarousel(Long id);

    /**
     * 保存
     * @param files
     */
    void saveCarousel(List<MultipartFile> files);
}
