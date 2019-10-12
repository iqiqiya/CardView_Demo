package iqiqiya.lanlana.cardview_demo;

/**
 * Author: iqiqiya
 * Date: 2019/10/12
 * Time: 21:41
 * Blog: blog.77sec.cn
 * Github: github.com/iqiqiya
 */
public class Msg {

    private int id;
    private int imgResId;
    private String title;
    private String content;

    public Msg(){

    }

    public Msg(int id, int imgResId, String title, String content) {
        this.id = id;
        this.imgResId = imgResId;
        this.title = title;
        this.content = content;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getImgResId() {
        return imgResId;
    }

    public void setImgResId(int imgResId) {
        this.imgResId = imgResId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

}
