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
    private String title;
    private String location;
    private int surface;
    private double price;
    private String descriptions;
    private String userId;
    private String sellerAddress;
    private List<String> images;

}