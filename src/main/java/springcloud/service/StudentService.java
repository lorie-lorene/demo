package springcloud.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.stereotype.Service;

import lombok.NoArgsConstructor;
import springcloud.model.Student;
import springcloud.repo.StudentRepo;
import springcloud.web.controler.StudentClient;

@Service

public class StudentService {
//     private MongoTemplate mongoTemplate;
//     @Autowired
//     private StudentRepo repository;

//     public List <Student> getStudAll(){
//         List <Student> t1=repository.findAll();
//         return t1;
//     }

//     public void create(Student st){
//         repository.save(st);
//     }

//      public Student getStudentById( String id){
//         Student student=repository.findByIdS(id);
//         return student;
//     }

//     public void deleteStudent(String id){
//         repository.deleteById(id);
//     }
//     public Student updateStudent(String id, Student new_student){
//         Student existing_Student=repository.findByIdS(id);
//         if ( existing_Student.getIdS()!= null){
//         existing_Student.setFiliere(new_student.getFiliere());
//         existing_Student.setFrameWork(new_student.getFrameWork());
//         existing_Student.setNameComplet(new_student.getNameComplet());
        
//              return repository.save(existing_Student);
//         }
//         else{
//             return null;
//         }
//     }

//    /***************************************************/
//     public List<Student> getAllStudentFromMongoDB(){
//         return repository.findAll();
//    } 
//     public Optional<Student> getStudentByIdFromMongoDB(String id){

//         return repository.findById(id);
//    }
//     public Student createStudentInMongo( Student student){
//         return repository.save(student);

//     }
//     // public Student updateStudentFromMongo(Student student, String id){
//     //     student.setId(id);
//     //     return repository.save(student);
//     // }
//     public void deleteStudentFromMongo(String id){
//          repository.deleteById(id);
//     }

//      /***************************************************/
//      /* Method avec la configuration mongo si les données ne sont pas stocké en local

//     public List<Student> getAllStudentFromMongoDB(){
//         return mongoTemplate.findAll(Student.class);
//    } 
//     public Student getStudentByIdFromMongoDB(String id){
//         Criteria query;
//         query=Criteria.where("id").is(id);
//         return mongoTemplate.findById(query,Student.class);
//    }
//     public Student createStudentInMongo( Student student){
//         return mongoTemplate.save(student);

//     }
//     public Student updateStudentFromMongo(Student student, String id){
//         student.setId(id);
//         return mongoTemplate.save(student);
//     }
//          public void deleteStudentFromMongo(String id)  
//        Query query= new Query(Criteria.where("id").is(id));
//          ;
//          mongoTemplate.remove(query,Student.class);
//     }
//     */
}
