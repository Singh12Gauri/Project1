package readWrite;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ReadXLS {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		// TODO Auto-generated method stub

		File f=new File("C:\\Users\\Rahul Harshvardhan\\eclipse-workspace\\MavenGauriHRM\\src\\test\\resources\\excelfile\\TestData.xls");
		
		FileInputStream fis= new FileInputStream(f);
		
		Workbook wb =WorkbookFactory.create(fis);
		Sheet sheet0=wb.getSheetAt(0);
		
		Row r0=sheet0.getRow(0);
		Cell c0=r0.getCell(0);
		System.out.println(c0);
		
// USE FOR EACH Loop 
		
		for(Row row0: sheet0) {
			for(Cell cell0: row0) {
				switch(cell0.getCellType())
				{
				case STRING:
					System.out.print(cell0.getStringCellValue()+" ");
					break;
				case BOOLEAN:
					System.out.print(cell0.getBooleanCellValue()+ " ");
					break;
					
				case NUMERIC:
					System.out.print(cell0.getNumericCellValue()+ " ");
					
					default:
						break;
				}
				
			}
			
			System.out.println();
		}
		fis.close();
		
	}

}
