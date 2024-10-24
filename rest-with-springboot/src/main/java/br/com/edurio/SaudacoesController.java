package br.com.edurio;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.atomic.AtomicLong;

//controller do padrao MVC
@RestController
public class SaudacoesController {
    private static final String template = "Hello, %s!";
    private final AtomicLong counter = new AtomicLong();

    //mapeamento
    @RequestMapping("/saudacoes")
    public Saudacoes saudacao(
            @RequestParam(value = "name", defaultValue = "World")
            String name) {
        return new Saudacoes(counter.incrementAndGet(),String.format(template, name));
    }
}
