package com.leaftaps.utils;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class DataLibrary {

    public static String[][] readDataFromExcel(String fileName) throws IOException {
        String filePath ="./data/"+fileName+".xlsx";
        XSSFWorkbook wbook ;
        wbook = new XSSFWorkbook(filePath);
        XSSFSheet sheet = wbook.getSheet("sheet1");
        int totalRowCount = sheet.getLastRowNum();
        System.out.println("total row count is "+totalRowCount);
        short totalCellCount = sheet.getRow(totalRowCount).getLastCellNum();
        System.out.println("total column count is "+totalCellCount);                        
        String[][] data = new String[totalRowCount][totalCellCount];
        for(int i = 1 ; i<= totalRowCount; i++){
            System.out.print("|");
            for(int j = 0 ; j<totalCellCount; j++ ){
               data[i-1][j] =  sheet.getRow(i).getCell(j).getStringCellValue();
               System.out.print(data[i-1][j]+"|");
        }
        System.out.println();
    }
        wbook.close();
        return data;
    }

}
