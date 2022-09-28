package in.techcamp.firstapp;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;

import java.util.List;

@Controller
@RequiredArgsConstructor
//PostControllerクラス
public class PostController {
    private final PostRepository postRepository;
    @GetMapping("/hello")
    //showHello()メソッド
    public String showHello(Model model){
        var sampleText = "サンプルテキスト";
        model.addAttribute("sampleText", sampleText);
        //hello.htmlを呼び出し
        return "hello";
    }
    @GetMapping
    //showList()メソッド
    public String showList(Model model){
        //findAll()メソッドでデータベースからデータを取得
        var postList = postRepository.findAll();
        model.addAttribute("postList", postList);
        return "index";
    }
    @GetMapping("/postForm")
    //データを一時保管しビューで呼び出す
    public String showPostForm(@ModelAttribute("postForm") PostForm form){
        return "postForm";
    }
}
