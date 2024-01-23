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
import com.ruoyi.chinese.domain.TestChineseTf;
import com.ruoyi.chinese.service.ITestChineseTfService;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 判断题Controller
 * 
 * @author lyj
 * @date 2024-01-18
 */
@RestController
@RequestMapping("/chinese/chineseTf")
public class TestChineseTfController extends BaseController
{
    @Autowired
    private ITestChineseTfService testChineseTfService;

    /**
     * 查询判断题列表
     */
    @PreAuthorize("@ss.hasPermi('chinese:chineseTf:list')")
    @GetMapping("/list")
    public TableDataInfo list(TestChineseTf testChineseTf)
    {
        startPage();
        List<TestChineseTf> list = testChineseTfService.selectTestChineseTfList(testChineseTf);
        return getDataTable(list);
    }

    /**
     * 导出判断题列表
     */
    @PreAuthorize("@ss.hasPermi('chinese:chineseTf:export')")
    @Log(title = "判断题", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, TestChineseTf testChineseTf)
    {
        List<TestChineseTf> list = testChineseTfService.selectTestChineseTfList(testChineseTf);
        ExcelUtil<TestChineseTf> util = new ExcelUtil<TestChineseTf>(TestChineseTf.class);
        util.exportExcel(response, list, "判断题数据");
    }

    /**
     * 获取判断题详细信息
     */
    @PreAuthorize("@ss.hasPermi('chinese:chineseTf:query')")
    @GetMapping(value = "/{questionId}")
    public AjaxResult getInfo(@PathVariable("questionId") String questionId)
    {
        return success(testChineseTfService.selectTestChineseTfByQuestionId(questionId));
    }

    /**
     * 新增判断题
     */
    @PreAuthorize("@ss.hasPermi('chinese:chineseTf:add')")
    @Log(title = "判断题", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody TestChineseTf testChineseTf)
    {
        return toAjax(testChineseTfService.insertTestChineseTf(testChineseTf));
    }

    /**
     * 修改判断题
     */
    @PreAuthorize("@ss.hasPermi('chinese:chineseTf:edit')")
    @Log(title = "判断题", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody TestChineseTf testChineseTf)
    {
        return toAjax(testChineseTfService.updateTestChineseTf(testChineseTf));
    }

    /**
     * 删除判断题
     */
    @PreAuthorize("@ss.hasPermi('chinese:chineseTf:remove')")
    @Log(title = "判断题", businessType = BusinessType.DELETE)
	@DeleteMapping("/{questionIds}")
    public AjaxResult remove(@PathVariable String[] questionIds)
    {
        return toAjax(testChineseTfService.deleteTestChineseTfByQuestionIds(questionIds));
    }
}
