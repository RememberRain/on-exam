package com.ruoyi.paper.controller;

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
import com.ruoyi.paper.domain.Paper;
import com.ruoyi.paper.service.IPaperService;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 试卷管理Controller
 * 
 * @author ruoyi
 * @date 2024-01-19
 */
@RestController
@RequestMapping("/paper/paper")
public class PaperController extends BaseController
{
    @Autowired
    private IPaperService paperService;

    /**
     * 查询试卷管理列表
     */
    @PreAuthorize("@ss.hasPermi('paper:paper:list')")
    @GetMapping("/list")
    public TableDataInfo list(Paper paper)
    {
        startPage();
        List<Paper> list = paperService.selectPaperList(paper);
        return getDataTable(list);
    }

    /**
     * 导出试卷管理列表
     */
    @PreAuthorize("@ss.hasPermi('paper:paper:export')")
    @Log(title = "试卷管理", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, Paper paper)
    {
        List<Paper> list = paperService.selectPaperList(paper);
        ExcelUtil<Paper> util = new ExcelUtil<Paper>(Paper.class);
        util.exportExcel(response, list, "试卷管理数据");
    }

    /**
     * 获取试卷管理详细信息
     */
    @PreAuthorize("@ss.hasPermi('paper:paper:query')")
    @GetMapping(value = "/{paperId}")
    public AjaxResult getInfo(@PathVariable("paperId") String paperId)
    {
        return success(paperService.selectPaperByPaperId(paperId));
    }

    /**
     * 新增试卷管理
     */
    @PreAuthorize("@ss.hasPermi('paper:paper:add')")
    @Log(title = "试卷管理", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody Paper paper)
    {
        return toAjax(paperService.insertPaper(paper));
    }

    /**
     * 修改试卷管理
     */
    @PreAuthorize("@ss.hasPermi('paper:paper:edit')")
    @Log(title = "试卷管理", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody Paper paper)
    {
        return toAjax(paperService.updatePaper(paper));
    }

    /**
     * 删除试卷管理
     */
    @PreAuthorize("@ss.hasPermi('paper:paper:remove')")
    @Log(title = "试卷管理", businessType = BusinessType.DELETE)
	@DeleteMapping("/{paperIds}")
    public AjaxResult remove(@PathVariable String[] paperIds)
    {
        return toAjax(paperService.deletePaperByPaperIds(paperIds));
    }
}
