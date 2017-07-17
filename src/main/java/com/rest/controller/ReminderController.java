package com.rest.controller;

import com.rest.entity.Remind;
import com.rest.repository.RemindRepository;
import com.rest.service.ReminderServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.List;

@RestController
public class ReminderController {

    @Autowired
    private ReminderServiceImpl service;

    @RequestMapping(value = "/reminders",method = RequestMethod.GET)
    @ResponseBody
    public List<Remind> getAllReminders(){
        return service.getAll();
    }

    @RequestMapping(value = "/reminders/{id}",method = RequestMethod.GET)
    @ResponseBody
    public Remind getReminder(@PathVariable("id") long id){
        return service.getById(id);
    }


    @RequestMapping(value = "/reminders",method = RequestMethod.POST)
    @ResponseBody
    public Remind saveReminder(@RequestBody Remind remind){
        return service.save(remind);
    }

    @RequestMapping(value = "/reminders/{id}",method = RequestMethod.GET)
    @ResponseBody
    public void delete(@PathVariable("id") long id){
        service.delete(id);
    }
}
