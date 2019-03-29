package utilities;


import java.util.ArrayList;

public class XlsDataReaderUtil {

        static XlsReader reader;

        public static ArrayList<Object[]> getDataFromExcel(){

            ArrayList<Object[]> myData = new ArrayList<Object[]>();
            try {
                reader = new XlsReader("/Users/kbmsiddique/Desktop/MavenTest/HBO/src/test/java/dataDriventest/Workbook2.xls");
            }
            catch (Exception e){
                e.printStackTrace();
            }
            // change only sheet name in line 19
            for (int rowNum =2; rowNum <= reader.getRowCount("Sheet1"); rowNum++){
                String  items = reader.getCellData("Sheet1", "items",rowNum );
//                String passCode = reader.getCellData("Sheet1","passCode", rowNum);
//                String message = reader.getCellData("Sheet1","message", rowNum);
                Object obj[] = {items};
                myData.add(obj);
            }
            return  myData;
        }
    }

