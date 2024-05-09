package com.app.sentDataInPdfForm.config;

import java.awt.Color;
import java.io.IOException;
import java.util.List;

import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Component;

import com.app.sentDataInPdfForm.dto.User;
import com.fasterxml.jackson.core.Base64Variant.PaddingReadBehaviour;
import com.lowagie.text.*;
import com.lowagie.text.pdf.PdfCell;
import com.lowagie.text.pdf.PdfPCell;
import com.lowagie.text.pdf.PdfPTable;
import com.lowagie.text.pdf.PdfTable;
import com.lowagie.text.pdf.PdfWriter;

@Component
public class ResponseExport {
	public void export(HttpServletResponse response,  List<User> list) throws DocumentException, IOException {
		response.setContentType("application/pdf");
	    response.setHeader("Content-Disposition", "attachment:filename=report.pdf");
	    Document document = new Document(PageSize.A4);
	   
	    PdfWriter.getInstance(document, response.getOutputStream());
	    document.open();
	    Font font = FontFactory.getFont(FontFactory.HELVETICA_BOLD);
        font.setSize(18);
        font.setColor(Color.BLUE);
        Paragraph paragraph = new Paragraph("List Of User",font);
        paragraph.setAlignment(Paragraph.ALIGN_CENTER);
       document.add(paragraph);
       PdfPTable pdfTable = new PdfPTable(3);
       writePdfHeader(pdfTable);
       writeData(pdfTable,list);
       document.add(pdfTable);
       document.close();
	}
	private void writePdfHeader(PdfPTable pdfPTable) {
		PdfPCell cell = new PdfPCell();
		cell.setPadding(5);
		Font font = FontFactory.getFont(FontFactory.HELVETICA);
        font.setColor(Color.BLACK);

		cell.setPhrase(new Phrase("Id",font));
		pdfPTable.addCell(cell);
		cell.setPhrase(new Phrase("Name",font));
		pdfPTable.addCell(cell);
		cell.setPhrase(new Phrase("Salary",font));
		pdfPTable.addCell(cell);   
		
	}
	private void writeData(PdfPTable table,List<User> list) {
		for(User u : list) {
			table.addCell(String.valueOf(u.getId()));
			table.addCell(String.valueOf(u.getName()));
			table.addCell(String.valueOf(u.getSalary()));
		}
	}
}
