package qsp;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class HandlingExcel {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		FileInputStream fis = new FileInputStream("C:\\Users\\User\\Desktop\\testscript.xlsx");
		Workbook wb = WorkbookFactory.create(fis);
		  String data = wb.getSheet("customername").getRow(1).getCell(2).toString();
		  System.out.println(data);
	}

}
