package in.techcamp.firstapp;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
//PostControllerクラス
public class PostController {
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
    public String showList(){
        return "index";
    }
}
