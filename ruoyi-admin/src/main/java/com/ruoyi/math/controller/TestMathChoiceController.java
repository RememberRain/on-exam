package com.ruoyi.math.controller;

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
import com.ruoyi.math.domain.TestMathChoice;
import com.ruoyi.math.service.ITestMathChoiceService;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 选择题Controller
 * 
 * @author lyj
 * @date 2024-01-18
 */
@RestController
@RequestMapping("/math/mathChoice")
public class TestMathChoiceController extends BaseController
{
    @Autowired
    private ITestMathChoiceService testMathChoiceService;

    /**
     * 查询选择题列表
     */
    @PreAuthorize("@ss.hasPermi('math:mathChoice:list')")
    @GetMapping("/list")
    public TableDataInfo list(TestMathChoice testMathChoice)
    {
        startPage();
        List<TestMathChoice> list = testMathChoiceService.selectTestMathChoiceList(testMathChoice);
        return getDataTable(list);
    }

    /**
     * 导出选择题列表
     */
    @PreAuthorize("@ss.hasPermi('math:mathChoice:export')")
    @Log(title = "选择题", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, TestMathChoice testMathChoice)
    {
        List<TestMathChoice> list = testMathChoiceService.selectTestMathChoiceList(testMathChoice);
        ExcelUtil<TestMathChoice> util = new ExcelUtil<TestMathChoice>(TestMathChoice.class);
        util.exportExcel(response, list, "选择题数据");
    }

    /**
     * 获取选择题详细信息
     */
    @PreAuthorize("@ss.hasPermi('math:mathChoice:query')")
    @GetMapping(value = "/{questionId}")
    public AjaxResult getInfo(@PathVariable("questionId") String questionId)
    {
        return success(testMathChoiceService.selectTestMathChoiceByQuestionId(questionId));
    }

    /**
     * 新增选择题
     */
    @PreAuthorize("@ss.hasPermi('math:mathChoice:add')")
    @Log(title = "选择题", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody TestMathChoice testMathChoice)
    {
        return toAjax(testMathChoiceService.insertTestMathChoice(testMathChoice));
    }

    /**
     * 修改选择题
     */
    @PreAuthorize("@ss.hasPermi('math:mathChoice:edit')")
    @Log(title = "选择题", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody TestMathChoice testMathChoice)
    {
        return toAjax(testMathChoiceService.updateTestMathChoice(testMathChoice));
    }

    /**
     * 删除选择题
     */
    @PreAuthorize("@ss.hasPermi('math:mathChoice:remove')")
    @Log(title = "选择题", businessType = BusinessType.DELETE)
	@DeleteMapping("/{questionIds}")
    public AjaxResult remove(@PathVariable String[] questionIds)
    {
        return toAjax(testMathChoiceService.deleteTestMathChoiceByQuestionIds(questionIds));
    }
}
