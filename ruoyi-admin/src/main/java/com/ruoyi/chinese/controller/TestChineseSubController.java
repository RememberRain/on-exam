package com.ruoyi.chinese.controller;

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
import com.ruoyi.chinese.domain.TestChineseSub;
import com.ruoyi.chinese.service.ITestChineseSubService;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 主观题Controller
 * 
 * @author lyj
 * @date 2024-01-18
 */
@RestController
@RequestMapping("/chinese/chineseSub")
public class TestChineseSubController extends BaseController
{
    @Autowired
    private ITestChineseSubService testChineseSubService;

    /**
     * 查询主观题列表
     */
    @PreAuthorize("@ss.hasPermi('chinese:chineseSub:list')")
    @GetMapping("/list")
    public TableDataInfo list(TestChineseSub testChineseSub)
    {
        startPage();
        List<TestChineseSub> list = testChineseSubService.selectTestChineseSubList(testChineseSub);
        return getDataTable(list);
    }

    /**
     * 导出主观题列表
     */
    @PreAuthorize("@ss.hasPermi('chinese:chineseSub:export')")
    @Log(title = "主观题", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, TestChineseSub testChineseSub)
    {
        List<TestChineseSub> list = testChineseSubService.selectTestChineseSubList(testChineseSub);
        ExcelUtil<TestChineseSub> util = new ExcelUtil<TestChineseSub>(TestChineseSub.class);
        util.exportExcel(response, list, "主观题数据");
    }

    /**
     * 获取主观题详细信息
     */
    @PreAuthorize("@ss.hasPermi('chinese:chineseSub:query')")
    @GetMapping(value = "/{questionId}")
    public AjaxResult getInfo(@PathVariable("questionId") String questionId)
    {
        return success(testChineseSubService.selectTestChineseSubByQuestionId(questionId));
    }

    /**
     * 新增主观题
     */
    @PreAuthorize("@ss.hasPermi('chinese:chineseSub:add')")
    @Log(title = "主观题", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody TestChineseSub testChineseSub)
    {
        return toAjax(testChineseSubService.insertTestChineseSub(testChineseSub));
    }

    /**
     * 修改主观题
     */
    @PreAuthorize("@ss.hasPermi('chinese:chineseSub:edit')")
    @Log(title = "主观题", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody TestChineseSub testChineseSub)
    {
        return toAjax(testChineseSubService.updateTestChineseSub(testChineseSub));
    }

    /**
     * 删除主观题
     */
    @PreAuthorize("@ss.hasPermi('chinese:chineseSub:remove')")
    @Log(title = "主观题", businessType = BusinessType.DELETE)
	@DeleteMapping("/{questionIds}")
    public AjaxResult remove(@PathVariable String[] questionIds)
    {
        return toAjax(testChineseSubService.deleteTestChineseSubByQuestionIds(questionIds));
    }
}
