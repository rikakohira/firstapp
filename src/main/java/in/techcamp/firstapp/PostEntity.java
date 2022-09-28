package in.techcamp.firstapp;

import lombok.AllArgsConstructor;

//コンストラクタを自動生成
@AllArgsConstructor
public class PostEntity {
    private long id;
    private String memo;

    //ゲッター・セッター
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getMemo() {
        return memo;
    }

    public void setMemo(String memo) {
        this.memo = memo;
    }
}
