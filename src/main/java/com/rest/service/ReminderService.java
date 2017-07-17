package com.rest.service;


import com.rest.entity.Remind;

import java.util.List;

public interface ReminderService {

    List<Remind> getAll();

    Remind getById(Long id);

    void delete(Long id);

    Remind save(Remind remind);
}
