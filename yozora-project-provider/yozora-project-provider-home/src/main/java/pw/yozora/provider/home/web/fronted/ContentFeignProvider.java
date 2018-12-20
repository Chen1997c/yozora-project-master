package pw.yozora.provider.home.web.fronted;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pw.yozora.common.util.Constant;
import pw.yozora.common.util.JsonResult;
import pw.yozora.provider.home.entity.Content;
import pw.yozora.provider.home.service.ContentService;

import java.util.List;

/**
 * 描述： Content服务提供者
 *
 * @author ChenJianChuan
 * @date 2018/12/12　17:41
 */
@RestController
@RequestMapping("/api/home")
public class ContentFeignProvider {

    @Autowired
    private ContentService contentService;

    @GetMapping("/contents/{type}")
    public JsonResult getContent(@PathVariable int type) {
        List<Content> contents = contentService.listByType(type);
        return JsonResult.responseSuccess(contents);
    }

    @PostMapping("/content")
    public JsonResult addContent(@RequestBody Content content) {
        contentService.addContent(content);
        return JsonResult.responseSuccess(Constant.ADD_SUCCESS_MESSGE.getContent());
    }

    @DeleteMapping("/content/{id}")
    public JsonResult removeContent(@PathVariable Long id) {
        contentService.deleteContent(id);
        return JsonResult.responseSuccess(Constant.DELETE_SUCCESS_MESSGE.getContent());
    }

    @PutMapping("/content")
    public JsonResult updateContent(@RequestBody Content content) {
        contentService.updateContent(content);
        return JsonResult.responseSuccess(Constant.EDIT_SUCCESS_MESSGE.getContent());
    }
}
