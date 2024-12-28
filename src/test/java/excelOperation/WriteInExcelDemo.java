package excelOperation;

import org.apache.poi.EmptyFileException;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class WriteInExcelDemo {
    @Test
    public void writeDemo() throws IOException, NullPointerException, EmptyFileException {
        String workbookLoc = System.getProperty("user.dir")+".\\datafiles\\Project-Management-Sample-Data.xlsx";
        FileInputStream fis = new FileInputStream(workbookLoc);
        Workbook wb = new XSSFWorkbook(fis);
        FileOutputStream fos = new FileOutputStream(workbookLoc);

        Sheet sheet1 = wb.getSheetAt(0);
        sheet1.getRow(0).createCell(7).setCellValue(900);
        wb.write(fos);

    }
}
