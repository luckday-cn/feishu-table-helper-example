package cn.isliu.simple;

import cn.isliu.FsHelper;
import cn.isliu.core.client.FsClient;


public class EmployeeMain {
    public static void main(String[] args) {
        String spreadsheetToken = "your spreadsheetToken";

        try (FsClient fsClient = FsClient.getInstance()) {
            fsClient.initializeClient("your appId", "your appSecret");

            String sheetId = FsHelper.create("员工表", spreadsheetToken, Employee.class);
            System.out.println("sheetId:" + sheetId);

//        List<OceanEngineExcel> data = FsHelper.read(sheetId, spreadsheetToken, Employee.class);
//        data.forEach(System.out::println);
//
//        Object write = FsHelper.write(sheetId, spreadsheetToken, data);
//        System.out.println(write);
        }
    }
}