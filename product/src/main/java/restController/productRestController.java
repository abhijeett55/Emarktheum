package restController;

import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.RequiredArgsConstructor;
import repositories.productRepository;
import entities.product;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import repositories.productRepository;
import openFeign.userRestClient;
import services.productServive;


@RequestMapping("/product")
@RequiredArgsConstructor

@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class productRestController {

    @Autowired
    private productServive productSer;

    @Autowired
    private productRepository productRepo;

    @Autowired
    private userRestClient userfn;


    @GetMapping()
    public product getProduct(@PathVariable("id") String id) {
        product p = productRepo.findById(id).get();
        return p;
    }

    @GetMapping("/user-products")
    public List<product> getProductByUserId(HttpServletRequest request) {
       String id = userfn.getUserId(request.getHeader("Authorization"));
       return productRepo.findAllByUserId(id);
    }

    @CrossOrigin(origins = "http://localhost:4200")
    @PostMapping("/create")
    public String create(@RequestBody productRequest pRequest) {
        String id = userfn.getUserId(Request.getHeader("Authorization"));

        product prod = new product(
            pRequest.getLable(),
            pRequest.getTitle(),
            pRequest.getLocation(),
            pRequest.getSurface(),
            pRequest.getprice(),
            pRequest.getDescription(),
            pRequest.isSold(),
            pRequest.isVerified(),
            id,
            pRequest.getSellerAddress(),
            pRequest.getImages(),
            pRequest.getCategory()
        );

            productRepo.save(prod);
            return "Real Estate registered successfully!";
    }


    @GetMapping("/allProducts")
    public List<product> getAllproduct() {
        return (productSer.getAllProduct());
    }

    @PostMapping("/verify/{id}")
    public String verify(@PathVariable("id") String id) {
        product p = productRepo.findById(id).get();
        p.setVerified(true);
        productRepo.save(p);
        return "Product verified successfully!";
    }

    @PostMapping("/delete/{id}")
    public String delete(@PathVariable("id") String id) {
        product p = productRepo.findById(id).get();

        productRepo.delete(p);
        return "Product deleted successfully!";
    }

    @PostMapping("/sold/{id}")
    public product sold(@PathVariable("id") String id) {
       product p = productRepo.findById(id).get();
       p.setSold(true);
        return productRepo.save(p); 
    }

    @GetMapping("/isVerified")
    public List<product> isVerified() {
        return productRepo.findByVerified(true);
    }

    @GetMapping("/isSold")
    public List<product> isSold() {
        return productRepo.findBySold(true);
    }    
}