package cn.isliu.simple;

import cn.isliu.FsHelper;
import cn.isliu.core.client.FsClient;

import java.util.ArrayList;
import java.util.List;


public class EmployeeMain {
    public static void main(String[] args) {
        String spreadsheetToken = "your spreadsheetToken";

        try (FsClient fsClient = FsClient.getInstance()) {
            fsClient.initializeClient("your appId", "your appSecret");

//            String sheetId = FsHelper.create("员工表", spreadsheetToken, Employee.class);
//            System.out.println("sheetId:" + sheetId);

//        List<Employee> data = FsHelper.read(sheetId, spreadsheetToken, Employee.class);
//        data.forEach(System.out::println);

            String sheetId = "xXjDa";
            List<Employee> data = new ArrayList<>();
            data.add(new Employee("1001", "张三", "张三@gmail.com", "部门A"));
            data.add(new Employee("1002", "李四", "李四@gmail.com", "部门A"));
            data.add(new Employee("1003", "王五", "王五@gmail.com", "部门B"));
            Object write = FsHelper.write(sheetId, spreadsheetToken, data);
            System.out.println(write);
        }
    }
}