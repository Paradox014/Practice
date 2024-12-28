package excelOperation;

import org.apache.commons.io.FileUtils;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyExcelDemo {
    @Test
    public void demo() throws IOException, NullPointerException{
        String fileloc = System.getProperty("user.dir")+".\\datafiles\\Project-Management-Sample-Data.xlsx";
        FileInputStream fis = new FileInputStream(fileloc);
        Workbook wb = new XSSFWorkbook(fis);

        Sheet sheet = wb.getSheetAt(0);
        int totalRows= sheet.getLastRowNum();
        System.out.println("Total rows "+totalRows);
        int totalColumn = sheet.getRow(0).getLastCellNum();
        System.out.println("Total rows "+totalColumn);

        Row value =sheet.getRow(0);
        sheet.getRow(47).createCell(0).setCellValue(value.toString());

        FileOutputStream fos = new FileOutputStream(fileloc);
        wb.write(fos);



    }
}
