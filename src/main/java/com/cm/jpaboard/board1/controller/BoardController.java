package com.cm.jpaboard.board1.controller;


import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Slf4j
@Controller
public class BoardController {

    @GetMapping("/")
    public String main(){
        log.info("####### main #####" );
        return "redirect:board";
    }

    @GetMapping("board")
    public String boardList(){
        log.info("####### boardList #####" );
        return "list";
    }



}
