package qsp;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class HandlingmultipleExceldata {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		FileInputStream fis = new FileInputStream("‪C:\\Users\\User\\Desktop\\Testpass.xlsx");
		Workbook wb = WorkbookFactory.create(fis);
		int rowcount = wb.getSheet("InvalidLogin").getLastRowNum();
		short cellcount = wb.getSheet("InvalidLogin").getRow(1).getLastCellNum();
		for(int i=1;i<=rowcount;i++) {
			for(int j=0;j<cellcount;j++) {
				data=wb.getSheet("InvalidLogin").getRow(j)
			}
		}

	}

}
