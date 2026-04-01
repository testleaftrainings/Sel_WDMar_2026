package week5.day3;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;


public class ReadExcel {
    /*
    Step1-> Set path for workbook
    step2-> Get into the sheet
    Step3-> Get into Row values
    Step4-> Get into cell values
    Step5-> Read Data from workbook and print
    Step6-> close the workbook
     sample code : 
     XSSFWorkbook wbook ;
     wbook = new XSSFWorkbook(filePath);
     String a1 = wbook.getSheetAt(0).getRow(0).getCell(0).getStringCellValue();
     String a2 = wbook.getSheetAt(0).getRow(0).getCell(1).getStringCellValue();
     System.out.println(a1+"|"+a2);
     wbook.close();
    */
       public static void main(String[] args) throws IOException {
        // C:\MarSel\sel_java_mar --> ./
        String filePath ="./data/CreateLead.xlsx";
        XSSFWorkbook wbook ;
        wbook = new XSSFWorkbook(filePath);
        // returns -->XSSFSheet ,XSSFRow, XSSFCell
        XSSFSheet sheet = wbook.getSheet("sheet1");
        int totalRowCount = sheet.getLastRowNum();
        short totalCellCount = sheet.getRow(totalRowCount).getLastCellNum();
        for(int i = 0 ; i<= totalRowCount; i++){// outer for loop ---> each row in the workbook
            System.out.print("|\t");
            for(int j = 0 ; j<totalCellCount; j++ ){ // inner for loop ---> each cell in the workbook
              String data =  sheet.getRow(i).getCell(j).getStringCellValue();
               System.out.print(data+"\t|\t");
        }
        System.out.println();
    }
        wbook.close();
    }
}
