package com.minzheng.blog.constant;

import com.baomidou.mybatisplus.core.toolkit.IdWorker;

/**
 * 公共常量
 * @author: qinghong
 **/
public class CommonConst {

    /**
     * 否
     */
    public static final int FALSE = 0;

    /**
     * 是
     */
    public static final int TURE = 1;

    /**
     * 博主id
     */
    public static final int BLOGGER_ID = 1;

    /**
     * 默认用户昵称
     */
    public static final String DEFAULT_NICKNAME = "用户" + IdWorker.getId();

    /**
     * 默认用户头像
     */
    public static final String DEFAULT_AVATAR = "https://static.talkxj.com/photos/b553f564f81a80dc338695acb1b475d2.jpg";

    /**
     * 前端组件名
     */
    public static String COMPONENT = "Layout";

    /**
     * 网站域名
     */
    public static final String URL = "https://www.talkxj.com";

    /**
     * 文章页面路径
     */
    public static final String ARTICLE_PATH = "/articles/";

    /**
     * 友联页面路径
     */
    public static final String LINK_PATH = "/links";

}
