package com.example.Dawily.controller;

import com.example.Dawily.model.Doctor;
import com.example.Dawily.service.DoctorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@Controller
public class DoctorController {

    @Autowired
    private DoctorService doctorService;

    @GetMapping("/alldoctor")
    public String getAllDoctors(Model model){
        List<Doctor> doctors = doctorService.findAllDoctors();
        model.addAttribute("doctors",doctors);
        return "doctors page";
    }

    @PostMapping("/adddoctor")
    public String addDoctor(Doctor doctor){
        Doctor result=doctorService.addDoctor(doctor);
        if(result==null){
            return "redirect:/";
        }
        return "redirect:/";
    }

    @GetMapping("/edit/{id}")
    public String getEditBookPage(Model model, @PathVariable Long Id) {
        Optional<Doctor> result = doctorService.findDoctorById(Id);
        model.addAttribute("bookToEdit", result);
        return "edit_doctor_page";
    }

    @PostMapping("/editDoctor")
    public String editBook(@ModelAttribute BookModel book) {
        bookService.edit(book);
        return "redirect:/doctors";
    }



}
