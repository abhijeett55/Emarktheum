package entities;

import org.springframework.data.mongodb.core.mapping.Document;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@AllArgsConstructor
@NoArgsConstructor
@Document(collection = "product")
public class category {
    @Id
    private String id;
    private String label;
    public category(String label) {
        super();
        this.label = label;
    }
}