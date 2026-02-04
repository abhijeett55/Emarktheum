package entities;

import java.util.List;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class product {

    @Id
    private String id;
    private String label;
    private String title;
    private String location;
    private int surface;
    private double price;
    private String descriptions;
    private String userId;
    private String sellerAddress;
    private List<String> images;



    private category category;

    @Override
    public String toString() {
        return "product[id=" + id +"]";
    }

    public product(String label, String title, String location, int surface, double price) {
        super();
        this.label = label;
        this.title = title;
        //continue
    }

}