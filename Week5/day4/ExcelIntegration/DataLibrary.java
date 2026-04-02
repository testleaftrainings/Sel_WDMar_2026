package com.testng.sample;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class DataLibrary {
                 // 
     public static String[][] readDataFromExcel(String fileName) throws IOException {
        // C:\MarSel\sel_java_mar --> ./
        String filePath ="./data/"+fileName+".xlsx";
        XSSFWorkbook wbook ;
        wbook = new XSSFWorkbook(filePath);
        // returns -->XSSFSheet ,XSSFRow, XSSFCell
        XSSFSheet sheet = wbook.getSheet("sheet1");
        int totalRowCount = sheet.getLastRowNum();
        System.out.println("total row count is "+totalRowCount);
        short totalCellCount = sheet.getRow(totalRowCount).getLastCellNum();
        System.out.println("total column count is "+totalCellCount);
                                     //3 [0,1,2]    //4[0,1,2,3]                         
        String[][] data = new String[totalRowCount][totalCellCount];
        for(int i = 1 ; i<= totalRowCount; i++){// outer for loop ---> each row in the workbook
            System.out.print("|");
            for(int j = 0 ; j<totalCellCount; j++ ){ // inner for loop ---> each cell in the workbook
               data[i-1][j] =  sheet.getRow(i).getCell(j).getStringCellValue();
               System.out.print(data[i-1][j]+"|");
        }
        System.out.println();
    }
        wbook.close();
        return data;
    }

}
