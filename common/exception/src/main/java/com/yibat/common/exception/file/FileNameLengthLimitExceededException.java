package com.yibat.common.exception.file;

/**
 * 文件名称超长限制异常类
 *
 * @author 十八子
 * @date 2022/02/16
 */
public class FileNameLengthLimitExceededException extends FileException {
    private static final long serialVersionUID = 1L;

    public FileNameLengthLimitExceededException(int defaultFileNameLength) {
        super("upload.filename.exceed.length", new Object[] { defaultFileNameLength });
    }
}
