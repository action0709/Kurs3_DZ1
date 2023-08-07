package com.SkyPro.Kurs3_DZ1.service;

import com.SkyPro.Kurs3_DZ1.model.Student;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

@Service
public class StudentService {
    private final Map<Long, Student> map = new HashMap<>();
    private Long COUNTER = 1L;
    public Student getById (Long id){
        return map.get(id);
    }
public Collection<Student> getAll(){
    return map.values();

}
public Student create (Student student){
    Long nextId = COUNTER++;
    map.put(student.getId(), student);
    return student
}
}
