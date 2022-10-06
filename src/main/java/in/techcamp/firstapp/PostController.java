package in.techcamp.firstapp;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

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

    //一覧機能
    @GetMapping
    //List()メソッド
    public String showList(Model model){
        //findAll()メソッドでデータベースからデータを取得
        var postList = postRepository.findAll();
        model.addAttribute("postList", postList);
        return "index";
    }
    //投稿機能
    @GetMapping("/postForm")
    //データを一時保管しビューで呼び出す
    public String showPostForm(@ModelAttribute("postForm") PostForm form){

        return "postForm";
    }
    //投稿を保存
    @PostMapping("/posts")
    public String savePost(PostForm form){
        //SQLへのデータ保存
        postRepository.insert(form.getMemo());
        return "redirect:/";
    }
}
