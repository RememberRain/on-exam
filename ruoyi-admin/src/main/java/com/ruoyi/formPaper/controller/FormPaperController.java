package com.ruoyi.formPaper.controller;

import com.ruoyi.common.annotation.Log;
import com.ruoyi.common.core.controller.BaseController;
import com.ruoyi.common.enums.BusinessType;
import com.ruoyi.formPaper.domain.FormPaper;
import com.ruoyi.formPaper.service.IFormPaperService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


/** 组卷管理Controller
 * @author 何建宇*/
@RestController
@RequestMapping("/formPaper/formPaper")
public class FormPaperController extends BaseController {
    @Autowired
    IFormPaperService formPaperService;

    @Log(title = "新增选择题入试卷", businessType = BusinessType.INSERT)
    @PostMapping("/choice")
    public int addChineseChoiceFormPaper(@RequestBody FormPaper formPaper){
        return formPaperService.addChoiceFormPaper(formPaper);
    }

    @Log(title = "新增判断题入试卷", businessType = BusinessType.INSERT)
    @PostMapping("/tf")
    public int addMathChoiceFormPaper(@RequestBody FormPaper formPaper){
        return formPaperService.addTfFormPaper(formPaper);
    }

    @Log(title = "新增主观题入试卷", businessType = BusinessType.INSERT)
    @PostMapping("/sub")
    public int addEnglishChoiceFormPaper(@RequestBody FormPaper formPaper){
        return formPaperService.addSubFormPaper(formPaper);
    }
}
