package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
@Controller
public class MainController {

    @GetMapping(value = "/demo")
    @ResponseBody
    /* URL 과의 매핑을 담당
       @GetMapping 에 http://localhost:8080과 같은 도메인명과 포트는 적지 않는다.
       --> 도메인명과 포트는 서버 설정에 따라 변하기 때문이다.
    */
    public String index() {
        return "안녕하세요 sbb에 오신것을 환영합니다.!! 사실 환영하지 않습니다.";
    }

    @GetMapping("/")
    public String root(){
        return "redirect:/question/list";
    }
}
