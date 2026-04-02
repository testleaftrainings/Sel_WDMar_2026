################################################################################################

# Steps to do Excel Integration:

1. Create 2- dimensional array in the ReadExcel Class with rowCount and columnCount
String[][] testRecord = new String[rowCount][columnCount];

2. Push stringCellValue to the Array
DataProvider what index value it will be started - 0
Excel program what index value for row - 1

convert excel into DataProvider
testRecord[i-1][j]=stringCellValue;

3. Close the workbook and return the data
excel.close();
return testRecord;

4. Change main method to a normal static method -retrain the static keyword
public static String[][] extractDataFromExcel(){
}

5. Inside the testcase within the dataLibrary() call the extractDataFromExcel() from ReadExcel Class and return the testRecord
@DataProvider(name="extractData")
public String[][] dataLibrary() throws IOException {
    
return ReadExcel.readExcel();

6.inside excel program craete one input agrs and pass variable inside workbook
 (./data/"+fileName+".xlsx)
 
7. inside the BaseClass or PSM  and declare a fileName globally
 
public String fileName; ------------ > Global declaration
@DataProvider(name="extractData")
public String[][] dataLibrary() throws IOException {
return ReadExcel.extractDataFromExcel(fileName); 
}
8. Create sendLeadData() inside each testcase and annotate with @BeforeTest and mention the filename here
@BeforeTest
public void sendLeadData() {
fileName="ClassName";
} 
9. Finally , run from the xml file

##########################################################################