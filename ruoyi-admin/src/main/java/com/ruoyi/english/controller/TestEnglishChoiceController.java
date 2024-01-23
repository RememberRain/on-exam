package com.ruoyi.english.controller;

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
import com.ruoyi.english.domain.TestEnglishChoice;
import com.ruoyi.english.service.ITestEnglishChoiceService;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 选择题Controller
 * 
 * @author lyj
 * @date 2024-01-18
 */
@RestController
@RequestMapping("/english/englishChoice")
public class TestEnglishChoiceController extends BaseController
{
    @Autowired
    private ITestEnglishChoiceService testEnglishChoiceService;

    /**
     * 查询选择题列表
     */
    @PreAuthorize("@ss.hasPermi('english:englishChoice:list')")
    @GetMapping("/list")
    public TableDataInfo list(TestEnglishChoice testEnglishChoice)
    {
        startPage();
        List<TestEnglishChoice> list = testEnglishChoiceService.selectTestEnglishChoiceList(testEnglishChoice);
        return getDataTable(list);
    }

    /**
     * 导出选择题列表
     */
    @PreAuthorize("@ss.hasPermi('english:englishChoice:export')")
    @Log(title = "选择题", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, TestEnglishChoice testEnglishChoice)
    {
        List<TestEnglishChoice> list = testEnglishChoiceService.selectTestEnglishChoiceList(testEnglishChoice);
        ExcelUtil<TestEnglishChoice> util = new ExcelUtil<TestEnglishChoice>(TestEnglishChoice.class);
        util.exportExcel(response, list, "选择题数据");
    }

    /**
     * 获取选择题详细信息
     */
    @PreAuthorize("@ss.hasPermi('english:englishChoice:query')")
    @GetMapping(value = "/{questionId}")
    public AjaxResult getInfo(@PathVariable("questionId") String questionId)
    {
        return success(testEnglishChoiceService.selectTestEnglishChoiceByQuestionId(questionId));
    }

    /**
     * 新增选择题
     */
    @PreAuthorize("@ss.hasPermi('english:englishChoice:add')")
    @Log(title = "选择题", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody TestEnglishChoice testEnglishChoice)
    {
        return toAjax(testEnglishChoiceService.insertTestEnglishChoice(testEnglishChoice));
    }

    /**
     * 修改选择题
     */
    @PreAuthorize("@ss.hasPermi('english:englishChoice:edit')")
    @Log(title = "选择题", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody TestEnglishChoice testEnglishChoice)
    {
        return toAjax(testEnglishChoiceService.updateTestEnglishChoice(testEnglishChoice));
    }

    /**
     * 删除选择题
     */
    @PreAuthorize("@ss.hasPermi('english:englishChoice:remove')")
    @Log(title = "选择题", businessType = BusinessType.DELETE)
	@DeleteMapping("/{questionIds}")
    public AjaxResult remove(@PathVariable String[] questionIds)
    {
        return toAjax(testEnglishChoiceService.deleteTestEnglishChoiceByQuestionIds(questionIds));
    }
}
