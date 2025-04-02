package Cloud.demo.controller;

import Cloud.demo.service.BffService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/bff")
public class BffController {
    public BffController bffService;

    public BffController(BffController bffService) {
        this.bffService = bffService;
    }

    @GetMapping("/user/{userId}")
    public List<String>getById(@PathVariable int userId){
        return bffService.getById(userId);
    }
}
