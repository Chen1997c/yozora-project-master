package pw.yozora.provider.home.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import pw.yozora.provider.home.entity.Carousel;

/**
 * 描述： content dao
 *
 * @author ChenJianChuan
 * @date 2018/12/15 11:34
 */
public interface CarouselDAO extends JpaRepository<Carousel, Long> {
}
