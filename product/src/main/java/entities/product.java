package entities;

import java.util.List;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Document(collection = "product")
public class product {

    @Id
    private String id;
    private String label;
    private String title;
    private String location;
    private int surface;
    private double price;
    private String descriptions;
    private boolean sold;
    private boolean verified;
    private String userId;
    private String sellerAddress;
    private List<String> images;

    @DBRef
    private category category;

    @Override
    public String toString() {
        return "product";
    }

    public product(String label, String title, String location, int surface, double price , String descriptions, boolean sold, boolean verified, String userId, String sellersAddress, List<String> images, entities.category category) {
        super();
        this.label = label;
        this.title = title;
        this.location = location;
        this.surface = surface;
        this.price = price;
        this.descriptions = descriptions;
        this.sold = sold;
        this.verified = verified;
        this.userId = userId;
        this.sellerAddress = sellerAddress;
        this.images = images;
        this.category = category;
    }

}