package io.jmlim.study.module.controller;

import io.jmlim.study.module.service.BService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Slf4j
@Controller
@RequiredArgsConstructor
public class IndexController {

    private final BService bService;

    @GetMapping(value = {"", "/"})
    public String index() {

        log.info("----------------> {}", bService.testMethod());
        return "index";
    }
}
