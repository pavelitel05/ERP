package com.example.nerzon.DAO;

import com.example.nerzon.entity.Task;

public interface TaskDAO {
    Task Save();
    Task Update();
    Task GetById();
}
