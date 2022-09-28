package in.techcamp.firstapp;

public class PostEntity {
    private long id;
    private String memo;

    //コンストラクタ
    public PostEntity(long id, String memo) {
        this.id = id;
        this.memo = memo;
    }

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
