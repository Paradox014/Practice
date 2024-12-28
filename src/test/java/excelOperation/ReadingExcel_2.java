package excelOperation;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

import java.io.FileInputStream;
import java.io.IOException;

public class ReadingExcel_2 {
    @Test
    public void readFromExcel() throws IOException {
        String excelPath = System.getProperty("user.dir")+".\\datafiles\\Project-Management-Sample-Data.xlsx";
        FileInputStream fis = new FileInputStream(excelPath);
        XSSFWorkbook wb = new XSSFWorkbook(fis);
        int totalRows=wb.getSheet("Project Management Data").getLastRowNum();
        System.out.println(totalRows);
        int totalColumn=wb.getSheet("Project Management Data").getRow(1).getLastCellNum();
        System.out.println(totalColumn);

        for(int r=0;r<=totalRows;r++){
            for(int c=0;c<=totalColumn;c++){
                System.out.print(" | ");
                System.out.print(wb.getSheet("Project Management Data").getRow(r).getCell(c));
                System.out.print("\t");
            }
            System.out.println(" ");

        }

    }
}
