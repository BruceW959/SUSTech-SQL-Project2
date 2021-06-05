package cn.edu.sustech.cs307.factory;

import cn.edu.sustech.cs307.ReferenceServices.ReferenceStudentService;
import cn.edu.sustech.cs307.database.SQLDataSource;
import cn.edu.sustech.cs307.service.CourseService;
import cn.edu.sustech.cs307.service.StudentService;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;


public class ReferenceServiceFactory extends ServiceFactory {
    public ReferenceServiceFactory() {
        registerService(StudentService.class, new ReferenceStudentService());

        // registerService(<interface name>.class, new <your implementation>());
    }
}