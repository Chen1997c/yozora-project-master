package pw.yozora.provider.home.web.fronted;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import pw.yozora.common.util.Constant;
import pw.yozora.common.util.JsonResult;
import pw.yozora.provider.home.entity.Carousel;
import pw.yozora.provider.home.service.CarouselService;

import java.util.List;

/**
 * 描述： Carousel 服务提供者
 *
 * @author ChenJianChuan
 * @date 2018/12/17　11:55
 */
@RestController
@RequestMapping("/api/home")
public class CarouselFeignProvider {

    @Autowired
    private CarouselService carouselService;

    @GetMapping("/carousels")
    public JsonResult getAll() {
        List<Carousel> carousels = carouselService.getAll();
        return JsonResult.responseSuccess(carousels);
    }

    @DeleteMapping("/carousel/{id}")
    public JsonResult removeCarousel(@PathVariable Long id) {
        carouselService.deleteCarousel(id);
        return JsonResult.responseSuccess(Constant.DELETE_SUCCESS_MESSGE.getContent());
    }

    @PostMapping("/carousel")
    public JsonResult addCarousel(@RequestParam("files") List<MultipartFile> files) {
        carouselService.saveCarousel(files);
        return JsonResult.responseSuccess(Constant.ADD_SUCCESS_MESSGE.getContent());
    }
}
