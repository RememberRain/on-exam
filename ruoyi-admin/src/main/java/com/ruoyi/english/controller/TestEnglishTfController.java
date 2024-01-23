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
import com.ruoyi.english.domain.TestEnglishTf;
import com.ruoyi.english.service.ITestEnglishTfService;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 判断题Controller
 * 
 * @author lyj
 * @date 2024-01-18
 */
@RestController
@RequestMapping("/english/englishTf")
public class TestEnglishTfController extends BaseController
{
    @Autowired
    private ITestEnglishTfService testEnglishTfService;

    /**
     * 查询判断题列表
     */
    @PreAuthorize("@ss.hasPermi('english:englishTf:list')")
    @GetMapping("/list")
    public TableDataInfo list(TestEnglishTf testEnglishTf)
    {
        startPage();
        List<TestEnglishTf> list = testEnglishTfService.selectTestEnglishTfList(testEnglishTf);
        return getDataTable(list);
    }

    /**
     * 导出判断题列表
     */
    @PreAuthorize("@ss.hasPermi('english:englishTf:export')")
    @Log(title = "判断题", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, TestEnglishTf testEnglishTf)
    {
        List<TestEnglishTf> list = testEnglishTfService.selectTestEnglishTfList(testEnglishTf);
        ExcelUtil<TestEnglishTf> util = new ExcelUtil<TestEnglishTf>(TestEnglishTf.class);
        util.exportExcel(response, list, "判断题数据");
    }

    /**
     * 获取判断题详细信息
     */
    @PreAuthorize("@ss.hasPermi('english:englishTf:query')")
    @GetMapping(value = "/{questionId}")
    public AjaxResult getInfo(@PathVariable("questionId") String questionId)
    {
        return success(testEnglishTfService.selectTestEnglishTfByQuestionId(questionId));
    }

    /**
     * 新增判断题
     */
    @PreAuthorize("@ss.hasPermi('english:englishTf:add')")
    @Log(title = "判断题", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody TestEnglishTf testEnglishTf)
    {
        return toAjax(testEnglishTfService.insertTestEnglishTf(testEnglishTf));
    }

    /**
     * 修改判断题
     */
    @PreAuthorize("@ss.hasPermi('english:englishTf:edit')")
    @Log(title = "判断题", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody TestEnglishTf testEnglishTf)
    {
        return toAjax(testEnglishTfService.updateTestEnglishTf(testEnglishTf));
    }

    /**
     * 删除判断题
     */
    @PreAuthorize("@ss.hasPermi('english:englishTf:remove')")
    @Log(title = "判断题", businessType = BusinessType.DELETE)
	@DeleteMapping("/{questionIds}")
    public AjaxResult remove(@PathVariable String[] questionIds)
    {
        return toAjax(testEnglishTfService.deleteTestEnglishTfByQuestionIds(questionIds));
    }
}
