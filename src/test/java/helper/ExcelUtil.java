package helper;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class ExcelUtil {

    Map <String, Map<String, String>>  testDataMap = new HashMap<String, Map<String, String>>();

    public void readFile(String strWorkBookName, String strSheetName) throws IOException {

        File file = new File("src/test/resources/"+strWorkBookName);
        FileInputStream fileInputStream  = new FileInputStream(file);
        Workbook workBook = new XSSFWorkbook(fileInputStream);
        Sheet sheet = workBook.getSheet(strSheetName);
        int i = 0;
        String parentKey = "";
        Iterator<Row> rowIterator = sheet.iterator();

        while (rowIterator.hasNext()) {

            Row row = rowIterator.next();
            //if(i != 0) {

                Iterator <Cell> cellIterator = row.cellIterator();

                Map <String, String> cellValue = new HashMap<String, String>();

                while (cellIterator.hasNext()) {
                    Cell cell = cellIterator.next();

                    if(cell.getColumnIndex() == 0)
                        parentKey = cell.getStringCellValue();

                    switch (cell.getCellType()) {
                        case Cell.CELL_TYPE_STRING:
                            if(cell.getColumnIndex() == 0)
                                cellValue.put("TestCase",cell.getStringCellValue());
                            if(cell.getColumnIndex() == 1)
                                cellValue.put("Origin",cell.getStringCellValue());
                            if(cell.getColumnIndex() == 2)
                                cellValue.put("Destination",cell.getStringCellValue());
                            if(cell.getColumnIndex() == 3)
                                cellValue.put("Date",cell.getStringCellValue());
                    }
                }
            testDataMap.put(parentKey, cellValue);
            //}
            i++;
        }
    }

    public String getKeyValuePair(String strWorkBookName, String strSheetName, String strKey, String strKeyType) throws IOException {

        if (testDataMap.isEmpty()) {
            readFile(strWorkBookName, strSheetName);
        }
        Map<String,String> getMapObject = testDataMap.get(strKey);
        System.out.println("The Key is " + strKey + " " + "and the Value of " + strKeyType + " is " + getMapObject.get(strKeyType));
        return getMapObject.get(strKeyType);
    }
}

