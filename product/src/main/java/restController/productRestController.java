package restController;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.RequiredArgsConstructor;




@RequestMapping("/product")
@RequiredArgsConstructor

@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class productRestController {
    @Autowired
    private productService productService;
}