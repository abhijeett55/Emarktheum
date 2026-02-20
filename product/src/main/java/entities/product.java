package entities;

import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

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
    private String description;
    private boolean sold;
    private boolean verified;
    private String userId;
    private String sellerAddress;
    private List<String> images;

    @DBRef
    private category category;

    @Override
    public String toString() {
        return String.format(
            "Product{id = '%s', label = '%s', title='%s', location='%s', surface=%s, price=%s, description='%s', solde=%s, verified=%s, userId='%s', images=%s, category=%s }",
            id, label, title, location, surface, price , description, sold, verified, userId,
            images != null ? images.size() + "images" : "null",
            category != null ? category.getLabel() : "null"
        );
    }

    public product(String label, String title, String location, int surface, double price , String description, boolean sold, boolean verified, String userId, String sellerAddress, List<String> images, entities.category category) {
        super();
        this.label = label;
        this.title = title;
        this.location = location;
        this.surface = surface;
        this.price = price;
        this.description = description;
        this.sold = sold;
        this.verified = verified;
        this.userId = userId;
        this.sellerAddress = sellerAddress;
        this.images = images;
        this.category = category;
    }

}