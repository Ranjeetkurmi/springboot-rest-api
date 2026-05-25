package com.example.demo.demo.contoller;


import com.example.demo.demo.model.Student;
import jakarta.annotation.Nullable;
import org.springframework.http.ResponseEntity;
import org.springframework.resilience.annotation.ConcurrencyLimit;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.print.attribute.standard.RequestingUserName;

@RestController
@RequestMapping("/students")
public class StudentController {




    @GetMapping("/getStudent")
    public Student getStudent(@RequestHeader("username") String username){
        System.out.println(username);
        return new Student(1L,username);

    }

    @PostMapping("/poststudent")
    ResponseEntity<Student>test( @RequestBody Student requestBody){
        System.out.println(requestBody.getRollNumber());
        System.out.println(requestBody.getUsername());

        return ResponseEntity.ok(new Student(3L,"sass"));
    }

    @PutMapping("/putstudent")
    ResponseEntity<Student>update(@RequestParam String name,@RequestBody Student student){

        System.out.println(name);

        System.out.println(student.getUsername()+" "+ student.getRollNumber());
        return ResponseEntity.ok(student);
    }

    @DeleteMapping("/deleteStudent/{id}")
    ResponseEntity<Student>delete(@PathVariable int id,@RequestHeader String authorization,@RequestParam String name){

        System.out.println("PathVariable : "+id+" header : "+authorization+" requestParam "+name);
        return ResponseEntity.ok(new Student(4L,"testUserName"));
    }

    @RequestMapping(value = "/otherWayDelete", method = RequestMethod.DELETE)
    ResponseEntity<String>otherWay(){
        return ResponseEntity.ok("test");
    }

}
