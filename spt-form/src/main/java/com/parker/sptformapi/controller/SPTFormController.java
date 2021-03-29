package com.parker.sptformapi.controller;

import com.parker.sptformapi.dao.SPTRepository;
import com.parker.sptformapi.dto.SpecialPaymentTermForm;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.Optional;

@RestController
@RefreshScope
public class SPTFormController {

    @Autowired
    SPTRepository sptRepo;

    @RequestMapping(value = "/forms", method = RequestMethod.POST)
    @ResponseStatus(HttpStatus.CREATED)
    public SpecialPaymentTermForm createForm(@RequestBody @Valid SpecialPaymentTermForm form){
        return sptRepo.save(form);
    }

    @RequestMapping( value = "/forms", method = RequestMethod.GET)
    @ResponseStatus(HttpStatus.OK)
    public String getAllForms(){
        return "Here are the forms";
    }

    @RequestMapping( value = "/forms/{form_id}", method = RequestMethod.GET)
    @ResponseStatus(HttpStatus.OK)
    public Optional<SpecialPaymentTermForm> findFormById(@PathVariable("form_id") Integer id){
        return sptRepo.findById(id);
    }

    @RequestMapping( value = "/forms/{form_id}", method = RequestMethod.PUT)
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void  updateForm(@PathVariable("form_id") Integer id,
                            @RequestBody @Valid SpecialPaymentTermForm form){
        sptRepo.saveAndFlush(form);
    }

    @RequestMapping( value = "/forms/{form_id}", method = RequestMethod.DELETE)
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void deleteForm(@PathVariable("form_id") Integer id){
        sptRepo.deleteById(id);
    }

}
