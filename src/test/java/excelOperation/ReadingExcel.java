package excelOperation;

import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;
import org.apache.commons.lang3.ObjectUtils;
import org.apache.poi.ss.formula.atp.Switch;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import static org.apache.poi.hssf.record.FormulaSpecialCachedValue.STRING;

public class ReadingExcel {

    @Test
    public void datadriven() throws IOException, FileNotFoundException, NullPointerException {
        String excelPath = ".\\datafiles\\Project-Management-Sample-Data.xlsx";
        FileInputStream fis = new FileInputStream(excelPath);
        XSSFWorkbook workbook = new XSSFWorkbook(fis);
        XSSFSheet sheet = workbook.getSheetAt(0);
        int rows = sheet.getLastRowNum();
        System.out.println("number of Rows : "+rows);
        int col = sheet.getRow(1).getLastCellNum();
        System.out.println("Number of Column : "+col);

        for(int r=0; r<rows; r++){
            for (int c=1; c<col; c++){
                XSSFRow row =sheet.getRow(r);
                if(row!=null){
                    System.out.print(" | ");
                    System.out.print(sheet.getRow(r).getCell(c).toString());
                    System.out.print("\t");
                }
            }
            System.out.println(" | ");
            }
        workbook.close();
        }


    }


