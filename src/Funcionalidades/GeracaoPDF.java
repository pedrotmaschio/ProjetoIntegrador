package Funcionalidades;

import Model.Locacao;

import com.itextpdf.io.font.constants.StandardFonts;
import com.itextpdf.kernel.font.PdfFont;
import com.itextpdf.kernel.font.PdfFontFactory;
import com.itextpdf.kernel.geom.PageSize;
import com.itextpdf.kernel.pdf.PdfDocument;
import com.itextpdf.kernel.pdf.PdfWriter;
import com.itextpdf.layout.Document;
import com.itextpdf.layout.element.Paragraph;
import com.itextpdf.layout.element.Table;
import com.itextpdf.layout.element.Cell;


import java.io.File;
import java.io.IOException;
 
public class GeracaoPDF {
 
    //public static final String DEST = "results/chapter01/hello_world.pdf";

    
    
    public void criarPdf(String dest, Locacao l) throws IOException {
        File file = new File(dest);
        file.getParentFile().mkdirs();
        
        //Initialize PDF writer
        PdfWriter writer = new PdfWriter(dest);

        //Initialize PDF document
        PdfDocument pdf = new PdfDocument(writer);
        // Inicializa o documento
        Document document = new Document(pdf, PageSize.A4);
        document.setMargins(30, 20, 20, 30);
        
        
        // Dados da locadora
        PdfFont titulo = PdfFontFactory.createFont(StandardFonts.TIMES_BOLD);
        Paragraph p = new Paragraph("CONTRATO DE LOCAÇÃO").setFont(titulo);
        document.add(p);
        document.add(gerarTabelaLocadora());
        
        //Close document
        document.close();
    }
    public Table gerarTabelaLocadora(){
        Table table = new Table(2);
        table.addCell("row 1; cell 1");
        table.addCell("row 1; cell 2");
        table.addCell("row 2; cell 1");
        table.addCell("row 2; cell 2");
        return table;
    }
}