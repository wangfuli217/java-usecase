package com.demo.utils;

import com.demo.domain.Employee;
import org.junit.Test;

import java.util.Optional;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class SerializationTest {

    @Test
    public void toJson() {
        Employee person = new Employee(1, "lee ken", 18);
        Optional<String> json = Serialization.toJson(person);

        assertTrue(json.isPresent());
        System.out.println(json.get());
    }

    @Test
    public void fromJson() {
        Employee person = new Employee(1, "lee ken", 18);
        Optional<String> json = Serialization.toJson(person);
        assertTrue(json.isPresent());

        Optional<Employee> obj = Serialization.fromJson(json.get(), Employee.class);
        assertTrue(obj.isPresent());

        assertEquals(person, obj.get());

    }

    @Test
    public void normalize() {
        Employee person = new Employee(1, "<script>lee</script>", 18);
        Optional<String> json = Serialization.toJson(person);

        assertTrue(json.isPresent());
        System.out.println(Serialization.normalize(json.get()));
    }
}