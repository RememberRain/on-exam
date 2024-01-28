package com.ruoyi.formPaper.service.impl;

import com.ruoyi.formPaper.domain.FormPaper;
import com.ruoyi.formPaper.mapper.FormPaperMapper;
import com.ruoyi.formPaper.service.IFormPaperService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author 何建宇
 */
@Service
public class FormPaperServiceImpl implements IFormPaperService {
    @Autowired
    FormPaperMapper formPaperMapper;
    /**
     * 新增选择题组卷
     *
     * @param formPaper 试卷管理
     * @return 结果
     */
    @Override
    public int addChoiceFormPaper(FormPaper formPaper)
    {
        return formPaperMapper.addChoiceFormPaper(formPaper);
    }

    @Override
    public int addTfFormPaper(FormPaper formPaper)
    {
        return formPaperMapper.addTfFormPaper(formPaper);
    }

    @Override
    public int addSubFormPaper(FormPaper formPaper)
    {
        return formPaperMapper.addSubFormPaper(formPaper);
    }
}
