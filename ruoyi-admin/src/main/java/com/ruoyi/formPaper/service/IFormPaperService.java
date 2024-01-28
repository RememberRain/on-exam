package com.ruoyi.formPaper.service;

import com.ruoyi.formPaper.domain.FormPaper;

/**
 * 组卷Service接口
 * @author 何建宇
 */
public interface IFormPaperService {
    /**
     * 新增组卷
     *
     * @param formPaper 组卷
     * @return 结果
     */
    public int addChoiceFormPaper(FormPaper formPaper);

    public int addTfFormPaper(FormPaper formPaper);

    public int addSubFormPaper(FormPaper formPaper);
}
