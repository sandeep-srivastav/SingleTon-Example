package pages;

import helper.ExcelUtil;

import java.io.IOException;

public class ReadTestMap {

    ExcelUtil excelUtil = new ExcelUtil();

    public String getTestDataFromTestMap(String workbookName, String sheetName,
                                                          String testcase, String key){

        String testData = null;
        try{
            testData = excelUtil.getKeyValuePair(workbookName, sheetName, testcase, key);
        }
        catch (IOException ioException){
            System.out.println("No file found !!!");
        }
        return testData;
    }
}
