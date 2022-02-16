package com.yibat.common.exception.file;

import com.yibat.common.exception.base.BaseException;

/**
 * 文件信息异常类
 *
 * @author 十八子
 * @date 2022/02/16
 */
public class FileException extends BaseException {
    private static final long serialVersionUID = 1L;

    public FileException(String code, Object[] args) {
        super("file", code, args, null);
    }

}
