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
import com.ruoyi.math.domain.TestMathTf;
import com.ruoyi.math.service.ITestMathTfService;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 判断题Controller
 * 
 * @author lyj
 * @date 2024-01-18
 */
@RestController
@RequestMapping("/math/mathTf")
public class TestMathTfController extends BaseController
{
    @Autowired
    private ITestMathTfService testMathTfService;

    /**
     * 查询判断题列表
     */
    @PreAuthorize("@ss.hasPermi('math:mathTf:list')")
    @GetMapping("/list")
    public TableDataInfo list(TestMathTf testMathTf)
    {
        startPage();
        List<TestMathTf> list = testMathTfService.selectTestMathTfList(testMathTf);
        return getDataTable(list);
    }

    /**
     * 导出判断题列表
     */
    @PreAuthorize("@ss.hasPermi('math:mathTf:export')")
    @Log(title = "判断题", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, TestMathTf testMathTf)
    {
        List<TestMathTf> list = testMathTfService.selectTestMathTfList(testMathTf);
        ExcelUtil<TestMathTf> util = new ExcelUtil<TestMathTf>(TestMathTf.class);
        util.exportExcel(response, list, "判断题数据");
    }

    /**
     * 获取判断题详细信息
     */
    @PreAuthorize("@ss.hasPermi('math:mathTf:query')")
    @GetMapping(value = "/{questionId}")
    public AjaxResult getInfo(@PathVariable("questionId") String questionId)
    {
        return success(testMathTfService.selectTestMathTfByQuestionId(questionId));
    }

    /**
     * 新增判断题
     */
    @PreAuthorize("@ss.hasPermi('math:mathTf:add')")
    @Log(title = "判断题", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody TestMathTf testMathTf)
    {
        return toAjax(testMathTfService.insertTestMathTf(testMathTf));
    }

    /**
     * 修改判断题
     */
    @PreAuthorize("@ss.hasPermi('math:mathTf:edit')")
    @Log(title = "判断题", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody TestMathTf testMathTf)
    {
        return toAjax(testMathTfService.updateTestMathTf(testMathTf));
    }

    /**
     * 删除判断题
     */
    @PreAuthorize("@ss.hasPermi('math:mathTf:remove')")
    @Log(title = "判断题", businessType = BusinessType.DELETE)
	@DeleteMapping("/{questionIds}")
    public AjaxResult remove(@PathVariable String[] questionIds)
    {
        return toAjax(testMathTfService.deleteTestMathTfByQuestionIds(questionIds));
    }
}
