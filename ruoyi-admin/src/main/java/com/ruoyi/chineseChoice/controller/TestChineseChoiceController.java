package com.ruoyi.chineseChoice.controller;

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
import com.ruoyi.chineseChoice.domain.TestChineseChoice;
import com.ruoyi.chineseChoice.service.ITestChineseChoiceService;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 选择题Controller
 * 
 * @author lyj
 * @date 2024-01-17
 */
@RestController
@RequestMapping("/chineseChoice/choiceChoice")
public class TestChineseChoiceController extends BaseController
{
    @Autowired
    private ITestChineseChoiceService testChineseChoiceService;

    /**
     * 查询选择题列表
     */
    @PreAuthorize("@ss.hasPermi('chineseChoice:choiceChoice:list')")
    @GetMapping("/list")
    public TableDataInfo list(TestChineseChoice testChineseChoice)
    {
        startPage();
        List<TestChineseChoice> list = testChineseChoiceService.selectTestChineseChoiceList(testChineseChoice);
        return getDataTable(list);
    }

    /**
     * 导出选择题列表
     */
    @PreAuthorize("@ss.hasPermi('chineseChoice:choiceChoice:export')")
    @Log(title = "选择题", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, TestChineseChoice testChineseChoice)
    {
        List<TestChineseChoice> list = testChineseChoiceService.selectTestChineseChoiceList(testChineseChoice);
        ExcelUtil<TestChineseChoice> util = new ExcelUtil<TestChineseChoice>(TestChineseChoice.class);
        util.exportExcel(response, list, "选择题数据");
    }

    /**
     * 获取选择题详细信息
     */
    @PreAuthorize("@ss.hasPermi('chineseChoice:choiceChoice:query')")
    @GetMapping(value = "/{questionId}")
    public AjaxResult getInfo(@PathVariable("questionId") String questionId)
    {
        return success(testChineseChoiceService.selectTestChineseChoiceByQuestionId(questionId));
    }

    /**
     * 新增选择题
     */
    @PreAuthorize("@ss.hasPermi('chineseChoice:choiceChoice:add')")
    @Log(title = "选择题", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody TestChineseChoice testChineseChoice)
    {
        return toAjax(testChineseChoiceService.insertTestChineseChoice(testChineseChoice));
    }

    /**
     * 修改选择题
     */
    @PreAuthorize("@ss.hasPermi('chineseChoice:choiceChoice:edit')")
    @Log(title = "选择题", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody TestChineseChoice testChineseChoice)
    {
        return toAjax(testChineseChoiceService.updateTestChineseChoice(testChineseChoice));
    }

    /**
     * 删除选择题
     */
    @PreAuthorize("@ss.hasPermi('chineseChoice:choiceChoice:remove')")
    @Log(title = "选择题", businessType = BusinessType.DELETE)
	@DeleteMapping("/{questionIds}")
    public AjaxResult remove(@PathVariable String[] questionIds)
    {
        return toAjax(testChineseChoiceService.deleteTestChineseChoiceByQuestionIds(questionIds));
    }
}
