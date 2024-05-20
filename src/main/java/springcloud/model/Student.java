package springcloud.model;

import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Document
public class Student {

    private String idS;
    private String nameComplet;
    private String filiere;
    private String frameWork;
}
