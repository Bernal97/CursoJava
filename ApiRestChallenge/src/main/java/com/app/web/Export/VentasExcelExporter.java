package com.app.web.Export;

import com.app.web.entity.DetVentas;
import com.app.web.entity.Ventas;


import java.io.IOException;
import java.util.List;

import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletResponse;

import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFFont;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class VentasExcelExporter {

    private XSSFWorkbook workbook;
    private XSSFSheet sheet;

    private List<DetVentas> listDetVentas;
    
    public void UserExcelExporter(List<Ventas> listVentas) {
        this.listDetVentas = listDetVentas;
        workbook = new XSSFWorkbook();
    }


    private void writeHeaderLine() {
        sheet = workbook.createSheet("Ventas");

        XSSFRow row = sheet.createRow(0);

        CellStyle style = workbook.createCellStyle();
        XSSFFont font = workbook.createFont();
        font.setBold(true);
        font.setFontHeight(16);
        style.setFont(font);

        createCell(row, 0, "Cliente", style);

    }

    private void createCell(XSSFRow row, int columnCount, Object value, CellStyle style) {
        sheet.autoSizeColumn(columnCount);
        XSSFCell cell = row.createCell(columnCount);
        if (value instanceof Integer) {
            cell.setCellValue((Integer) value);
        } else if (value instanceof Boolean) {
            cell.setCellValue((Boolean) value);
        }else {
            cell.setCellValue((String) value);
        }
        cell.setCellStyle(style);
    }

    private void writeDataLines() {
        int rowCount = 1;

        CellStyle style = workbook.createCellStyle();
        XSSFFont font = workbook.createFont();
        font.setFontHeight(14);
        style.setFont(font);

        for (DetVentas ventas : listDetVentas) {
            XSSFRow row = sheet.createRow(rowCount++);
            int columnCount = 0;

            createCell(row, columnCount++, ventas.getUna_venta().getUn_client().getNombre() , style );
            createCell(row, columnCount++, ventas.getUn_prod().getNombre_prod() , style);
            createCell(row, columnCount++, ventas.getCantidadProd() , style);

        }
    }

    public void export(HttpServletResponse response) throws IOException {
        writeHeaderLine();
        writeDataLines();

        ServletOutputStream outputStream = response.getOutputStream();
        workbook.write(outputStream);
        workbook.close();

        outputStream.close();

    }
}
