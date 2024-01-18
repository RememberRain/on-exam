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
import com.ruoyi.math.domain.TestMathSub;
import com.ruoyi.math.service.ITestMathSubService;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 主观题Controller
 * 
 * @author lyj
 * @date 2024-01-18
 */
@RestController
@RequestMapping("/math/mathSub")
public class TestMathSubController extends BaseController
{
    @Autowired
    private ITestMathSubService testMathSubService;

    /**
     * 查询主观题列表
     */
    @PreAuthorize("@ss.hasPermi('math:mathSub:list')")
    @GetMapping("/list")
    public TableDataInfo list(TestMathSub testMathSub)
    {
        startPage();
        List<TestMathSub> list = testMathSubService.selectTestMathSubList(testMathSub);
        return getDataTable(list);
    }

    /**
     * 导出主观题列表
     */
    @PreAuthorize("@ss.hasPermi('math:mathSub:export')")
    @Log(title = "主观题", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, TestMathSub testMathSub)
    {
        List<TestMathSub> list = testMathSubService.selectTestMathSubList(testMathSub);
        ExcelUtil<TestMathSub> util = new ExcelUtil<TestMathSub>(TestMathSub.class);
        util.exportExcel(response, list, "主观题数据");
    }

    /**
     * 获取主观题详细信息
     */
    @PreAuthorize("@ss.hasPermi('math:mathSub:query')")
    @GetMapping(value = "/{questionId}")
    public AjaxResult getInfo(@PathVariable("questionId") String questionId)
    {
        return success(testMathSubService.selectTestMathSubByQuestionId(questionId));
    }

    /**
     * 新增主观题
     */
    @PreAuthorize("@ss.hasPermi('math:mathSub:add')")
    @Log(title = "主观题", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody TestMathSub testMathSub)
    {
        return toAjax(testMathSubService.insertTestMathSub(testMathSub));
    }

    /**
     * 修改主观题
     */
    @PreAuthorize("@ss.hasPermi('math:mathSub:edit')")
    @Log(title = "主观题", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody TestMathSub testMathSub)
    {
        return toAjax(testMathSubService.updateTestMathSub(testMathSub));
    }

    /**
     * 删除主观题
     */
    @PreAuthorize("@ss.hasPermi('math:mathSub:remove')")
    @Log(title = "主观题", businessType = BusinessType.DELETE)
	@DeleteMapping("/{questionIds}")
    public AjaxResult remove(@PathVariable String[] questionIds)
    {
        return toAjax(testMathSubService.deleteTestMathSubByQuestionIds(questionIds));
    }
}
