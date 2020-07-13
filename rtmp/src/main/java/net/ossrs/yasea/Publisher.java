package net.ossrs.yasea;

/**
 * @author :Reginer in  2020/7/13 17:16.
 * 联系方式:QQ:282921012
 * 功能描述:
 */
public interface Publisher {
    void setFps(int fps);

    void setBitRate(int bit);

    void setResolution(int width, int height);
}
