package springcloud.web.controler;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import springcloud.model.Student;
import springcloud.service.StudentService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@RestController
// serveur 
//@FeignClient(name="service-student",url="http://localhost:8082")
@RequestMapping("/student")

public class StudentClient {
   @Autowired
    private StudentService service;
    @GetMapping("")
    public List <Student> getStudentAll(){
        return service.getStudAll();
    }

    @PostMapping("/create")
    public String postMethodName(@RequestBody Student st) {
      service.create(st);
        return "success";
    }
    
    @GetMapping("{id}")
     public Student getStudentById(@PathVariable ("id") String id){
        return service.getStudentById(id);
     }

    @PutMapping("/update/{id}")
    public Student updateStudent(@PathVariable ("id")String id, @RequestBody Student student){
        Student st =service.updateStudent(id,student);
        return st;
    }

    @DeleteMapping("/delete/{id}")
    public void  deleteStudent(@PathVariable ("id") String id){
            service.deleteStudent(id);
    }

}
