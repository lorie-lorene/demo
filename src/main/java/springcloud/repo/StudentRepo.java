package springcloud.repo;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;

import springcloud.model.Student;
import java.util.List;


@RepositoryRestResource
@Repository
public interface StudentRepo  extends MongoRepository<Student,String> {
 
    Student  findByIdS(String idS);

}
