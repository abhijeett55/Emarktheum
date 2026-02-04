package entities;

import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@AllArgsConstructor
@NoArgsConstructor

public class category {
    @Id
    private String id;
    private String label;
    public category(String label) {
        super();
        this.label = label;
    }
}