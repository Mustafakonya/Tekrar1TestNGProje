package com.techproed.excelautomation;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.testng.annotations.Test;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class WriteExcel {

    @Test
    public void test() throws IOException {
    String path = "/Users/admin/IdeaProjects/Tekrar1TestNGProje/src/test/resources/ULKELER (1).xlsx";
    FileInputStream fileInputStream = new FileInputStream(path);
    Workbook workbook = WorkbookFactory.create(fileInputStream);
    FileOutputStream fileOutputStream = new FileOutputStream(path);


    workbook.getSheetAt(0).getRow(0).createCell(3).setCellValue("NUFUS");
    workbook.getSheetAt(0).getRow(1).createCell(1).setCellValue("80000000");
    workbook.getSheetAt(0).getRow(2).createCell(3).setCellValue("10000000");

    Cell silmekIstedigimizHucre = workbook.getSheetAt(0).getRow(0).getCell(1);
    workbook.getSheetAt(0).getRow(0).removeCell(silmekIstedigimizHucre);

    Row silmekIstedigimizSatir = workbook.getSheetAt(0).getRow(1);
    workbook.getSheetAt(0).removeRow(silmekIstedigimizSatir);

    workbook.write(fileOutputStream);
    fileInputStream.close();
    fileOutputStream.close();
    workbook.close();
    }
}
