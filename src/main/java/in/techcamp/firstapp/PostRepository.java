package in.techcamp.firstapp;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface PostRepository {
    //(発行したいSQL)
    @Select("select * from posts")
    //返り値のデータ型 findAll()メソッド
    List<PostEntity> findAll();

    //データ保存用のメソッドを定義
    @Insert("insert into posts (memo) values (#{memo})")
    void insert(String memo);
}
