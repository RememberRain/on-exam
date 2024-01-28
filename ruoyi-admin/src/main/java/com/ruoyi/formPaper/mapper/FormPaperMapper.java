package com.ruoyi.formPaper.mapper;

import com.ruoyi.formPaper.domain.FormPaper;

/** 组卷mapper接口 */
public interface FormPaperMapper {
    /**
     * 新增题目
     *
     * @param formPaper 试卷管理
     * @return 结果
     */
    public int addChoiceFormPaper(FormPaper formPaper);

    public int addTfFormPaper(FormPaper formPaper);

    public int addSubFormPaper(FormPaper formPaper);
    }
