package com.ruoyi.result.controller;

import java.util.List;
import javax.servlet.http.HttpServletResponse;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.ruoyi.common.annotation.Log;
import com.ruoyi.common.core.controller.BaseController;
import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.common.enums.BusinessType;
import com.ruoyi.result.domain.PaperResult;
import com.ruoyi.result.service.IPaperResultService;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 考试结果Controller
 * 
 * @author lyj
 * @date 2024-01-19
 */
@RestController
@RequestMapping("/result/result")
public class PaperResultController extends BaseController
{
    @Autowired
    private IPaperResultService paperResultService;

    /**
     * 查询考试结果列表
     */
    @PreAuthorize("@ss.hasPermi('result:result:list')")
    @GetMapping("/list")
    public TableDataInfo list(PaperResult paperResult)
    {
        startPage();
        List<PaperResult> list = paperResultService.selectPaperResultList(paperResult);
        return getDataTable(list);
    }

    /**
     * 导出考试结果列表
     */
    @PreAuthorize("@ss.hasPermi('result:result:export')")
    @Log(title = "考试结果", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, PaperResult paperResult)
    {
        List<PaperResult> list = paperResultService.selectPaperResultList(paperResult);
        ExcelUtil<PaperResult> util = new ExcelUtil<PaperResult>(PaperResult.class);
        util.exportExcel(response, list, "考试结果数据");
    }

    /**
     * 获取考试结果详细信息
     */
    @PreAuthorize("@ss.hasPermi('result:result:query')")
    @GetMapping(value = "/{paperId}")
    public AjaxResult getInfo(@PathVariable("paperId") String paperId)
    {
        return success(paperResultService.selectPaperResultByPaperId(paperId));
    }

    /**
     * 新增考试结果
     */
    @PreAuthorize("@ss.hasPermi('result:result:add')")
    @Log(title = "考试结果", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody PaperResult paperResult)
    {
        return toAjax(paperResultService.insertPaperResult(paperResult));
    }

    /**
     * 修改考试结果
     */
    @PreAuthorize("@ss.hasPermi('result:result:edit')")
    @Log(title = "考试结果", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody PaperResult paperResult)
    {
        return toAjax(paperResultService.updatePaperResult(paperResult));
    }

    /**
     * 删除考试结果
     */
    @PreAuthorize("@ss.hasPermi('result:result:remove')")
    @Log(title = "考试结果", businessType = BusinessType.DELETE)
	@DeleteMapping("/{paperIds}")
    public AjaxResult remove(@PathVariable String[] paperIds)
    {
        return toAjax(paperResultService.deletePaperResultByPaperIds(paperIds));
    }
}
