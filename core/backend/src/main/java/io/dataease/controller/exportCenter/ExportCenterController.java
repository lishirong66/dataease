package io.dataease.controller.exportCenter;

import com.github.xiaoymin.knife4j.annotations.ApiSupport;
import io.dataease.dto.ExportTaskDTO;
import io.dataease.service.exportCenter.ExportCenterService;
import org.springframework.web.bind.annotation.*;
import javax.annotation.Resource;
import javax.servlet.http.HttpServletResponse;
import java.util.List;

@ApiSupport(order = 31)
@RequestMapping("exportCenter")
@RestController
public class ExportCenterController {

    @Resource
    private ExportCenterService exportCenterService;



    @PostMapping("/exportTasks/{status}")
    public List<ExportTaskDTO> exportTasks(@PathVariable String status) {
        return exportCenterService.exportTasks(status);
    }


    @GetMapping("/delete/{id}")
    public void  delete(@PathVariable String id){
        exportCenterService.delete(id);
    }

    @PostMapping("/delete")
    public void  delete(@RequestBody List<String> ids){
        exportCenterService.delete(ids);
    }

    @PostMapping("/deleteAll/{type}")
    public void  deleteAll(@PathVariable String type){
        exportCenterService.deleteAll(type);
    }

    @GetMapping("/download/{id}")
    public void download(@PathVariable String id, HttpServletResponse response) throws Exception {
        exportCenterService.download(id, response);
    }

    @PostMapping("/retry/{id}")
    public void  retry(@PathVariable String id){
        exportCenterService.retry(id);
    }

}
