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
import com.ruoyi.english.domain.TestEnglishSub;
import com.ruoyi.english.service.ITestEnglishSubService;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 主观题Controller
 * 
 * @author lyj
 * @date 2024-01-18
 */
@RestController
@RequestMapping("/english/englishSub")
public class TestEnglishSubController extends BaseController
{
    @Autowired
    private ITestEnglishSubService testEnglishSubService;

    /**
     * 查询主观题列表
     */
    @PreAuthorize("@ss.hasPermi('english:englishSub:list')")
    @GetMapping("/list")
    public TableDataInfo list(TestEnglishSub testEnglishSub)
    {
        startPage();
        List<TestEnglishSub> list = testEnglishSubService.selectTestEnglishSubList(testEnglishSub);
        return getDataTable(list);
    }

    /**
     * 导出主观题列表
     */
    @PreAuthorize("@ss.hasPermi('english:englishSub:export')")
    @Log(title = "主观题", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, TestEnglishSub testEnglishSub)
    {
        List<TestEnglishSub> list = testEnglishSubService.selectTestEnglishSubList(testEnglishSub);
        ExcelUtil<TestEnglishSub> util = new ExcelUtil<TestEnglishSub>(TestEnglishSub.class);
        util.exportExcel(response, list, "主观题数据");
    }

    /**
     * 获取主观题详细信息
     */
    @PreAuthorize("@ss.hasPermi('english:englishSub:query')")
    @GetMapping(value = "/{questionId}")
    public AjaxResult getInfo(@PathVariable("questionId") String questionId)
    {
        return success(testEnglishSubService.selectTestEnglishSubByQuestionId(questionId));
    }

    /**
     * 新增主观题
     */
    @PreAuthorize("@ss.hasPermi('english:englishSub:add')")
    @Log(title = "主观题", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody TestEnglishSub testEnglishSub)
    {
        return toAjax(testEnglishSubService.insertTestEnglishSub(testEnglishSub));
    }

    /**
     * 修改主观题
     */
    @PreAuthorize("@ss.hasPermi('english:englishSub:edit')")
    @Log(title = "主观题", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody TestEnglishSub testEnglishSub)
    {
        return toAjax(testEnglishSubService.updateTestEnglishSub(testEnglishSub));
    }

    /**
     * 删除主观题
     */
    @PreAuthorize("@ss.hasPermi('english:englishSub:remove')")
    @Log(title = "主观题", businessType = BusinessType.DELETE)
	@DeleteMapping("/{questionIds}")
    public AjaxResult remove(@PathVariable String[] questionIds)
    {
        return toAjax(testEnglishSubService.deleteTestEnglishSubByQuestionIds(questionIds));
    }
}
