package heater;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.ss.usermodel.FillPatternType;
import org.apache.poi.ss.usermodel.IndexedColors;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;


public class generate_excel {
	static SimpleDateFormat format = new SimpleDateFormat("dd-M-yy hh-m-ss");
	static Date date = new Date();  
	static String dateString = format.format(date);
	public static String file_path="C://Users//User DW//Desktop//";
	public static String FILE_EXTENSION = ".xlsx";
	static String filename= dateString  +FILE_EXTENSION;
	
	
	
	
	public void gen() {
		code cd=new code();
		
		XSSFWorkbook workbook=new XSSFWorkbook();
	     
		 XSSFSheet sheet=workbook.createSheet("data");
		 
		 
	 
				 try {	
				////////row 0///////
					Row headerrow0=sheet.createRow(0);
					 Cell cell0 = headerrow0.createCell(0);
					 cell0.setCellValue("stage1");
					 Cell cell1 = headerrow0.createCell(1);
					 cell1.setCellValue("stage2");
					 Cell cell2 = headerrow0.createCell(2);
					 cell2.setCellValue("stage3");
					 Cell cell3 = headerrow0.createCell(3);
					 cell3.setCellValue("stage4");
					 Cell cell4 = headerrow0.createCell(4);
					 cell4.setCellValue("stage5");
					 Cell cell5 = headerrow0.createCell(5);
					 cell5.setCellValue("stage6");
					 
					 ////cells style////////
					CellStyle cs=workbook.createCellStyle();
					cs.setFillBackgroundColor(IndexedColors.RED.getIndex());
					cs.setFillPattern(FillPatternType.THIN_BACKWARD_DIAG);
					cs.setFillForegroundColor(IndexedColors.BLUE.getIndex());
					cs.setWrapText(true);
					cell0.setCellStyle(cs);
					cell1.setCellStyle(cs);
					cell2.setCellStyle(cs);
					cell3.setCellStyle(cs);
					cell4.setCellStyle(cs);
					cell5.setCellStyle(cs); 
				///end row 0/////////////	 
				/////row 1////////////	 
					 Row headerrow1=sheet.createRow(1);
					 Cell cell10 = headerrow1.createCell(0);
					 Cell cell11 = headerrow1.createCell(1);
					 Cell cell12 = headerrow1.createCell(2);
					 Cell cell13 = headerrow1.createCell(3);
					 Cell cell14 = headerrow1.createCell(4);
					 Cell cell15 = headerrow1.createCell(5);
					
					 cell10.setCellValue((code.txtsumstage1.getText()));
					 cell11.setCellValue(String.valueOf(code.txtsumstages2.getText()));
					 cell12.setCellValue(String.valueOf(code.txtsumstages3.getText()));
					 cell13.setCellValue(String.valueOf(code.txtsumstages4.getText()));
					 cell14.setCellValue(String.valueOf(code.txtsumstages5.getText()));
					 cell15.setCellValue(String.valueOf(code.txtsumstages6.getText()));
					 ///////////end row 1//////////
					 
						
		FileOutputStream out=new FileOutputStream(new File(file_path+code.txttitle.getText()+"  "+dateString+""+FILE_EXTENSION));
					
							workbook.write(out);
							out.close();
							workbook.close();
						} catch (FileNotFoundException e1) {
							// TODO Auto-generated catch block
							e1.printStackTrace();
						} catch (IOException e1) {
							e1.printStackTrace();
						
						}
						
					
				
					
					  

		 
		
		
	}

}
