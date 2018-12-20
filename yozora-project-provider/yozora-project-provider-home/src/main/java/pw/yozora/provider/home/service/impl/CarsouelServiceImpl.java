package pw.yozora.provider.home.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;
import org.springframework.web.multipart.MultipartFile;
import pw.yozora.common.exception.BusinessException;
import pw.yozora.provider.home.dao.CarouselDAO;
import pw.yozora.provider.home.entity.Carousel;
import pw.yozora.provider.home.service.CarouselService;

import java.io.File;
import java.io.IOException;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

/**
 * 描述： 轮播业务实现类
 *
 * @author ChenJianChuan
 * @date 2018/12/17　11:36
 */
@Service
public class CarsouelServiceImpl implements CarouselService {

    @Value("${carousel.img.url}")
    private String imgFolder;

    @Autowired
    private CarouselDAO carouselDAO;

    @Override
    public List<Carousel> getAll() {
        try {
            return carouselDAO.findAll();
        }catch (Exception e) {
            throw new BusinessException("查询轮播图片异常");
        }
    }

    @Override
    public void deleteCarousel(Long id) {
        try {
            carouselDAO.deleteById(id);
        }catch (Exception e) {
            throw new BusinessException("删除轮播图片异常");
        }
    }

    @Override
    public void saveCarousel(List<MultipartFile> files) {
        try {
            if(!CollectionUtils.isEmpty(files)) {
                files.forEach(file -> {
                    String fileType = file.getOriginalFilename().substring(file.getOriginalFilename().lastIndexOf('.'));
                    StringBuilder fileName = new StringBuilder();
                    fileName.append("carousel-").append(new Date().getTime()).append(".").append(fileType);
                    File fileSave = new File(this.imgFolder, fileName.toString());
                    try {
                        file.transferTo(fileSave);
                    } catch (IOException e) {
                        throw new BusinessException("保存轮播图片时存储图片异常");
                    }
                });
            }
        } catch (Exception e) {
            throw new BusinessException("保存轮播图片异常");
        }
    }
}
