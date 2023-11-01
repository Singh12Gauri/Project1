package readWrite;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class XlsWriteDataEx {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		XSSFWorkbook workbook = new XSSFWorkbook();
		XSSFSheet sheet1 = workbook.createSheet("Sheet1");
		
		XSSFRow r0 =sheet1.createRow(0);
		XSSFCell c0 = r0.createCell(0);
		c0.setCellValue("Facebook ");
		XSSFCell c1 = r0.createCell(1);
		c1.setCellValue("Login");
		
		XSSFRow r1 =sheet1.createRow(1);
		XSSFCell c = r1.createCell(0);
		c.setCellValue("Username ");
		XSSFCell cc = r1.createCell(1);
		cc.setCellValue("Admin ");
		
		XSSFRow r2 =sheet1.createRow(2);
		XSSFCell ca = r2.createCell(0);
		ca.setCellValue("Password ");
		XSSFCell cq = r2.createCell(1);
		cq.setCellValue("HR12345 ");
		
		File f =new File("C:\\Users\\Rahul Harshvardhan\\eclipse-workspace\\MavenGauriHRM\\src\\test\\resources\\excelfile\\TestData.xls");
		FileOutputStream fos=new FileOutputStream(f);
		workbook.write(fos);
		fos.close();
		workbook.close();
		
		System.out.println("Excel workbook created sucessfully");
		
	}

}
