package in.techcamp.firstapp;

import lombok.AllArgsConstructor;
import lombok.Data;

//コンストラクタを自動生成
@AllArgsConstructor
//ゲッター・セッターを省略
@Data
public class PostEntity {
    private long id;
    private String memo;
}
