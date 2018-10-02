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
import com.itextpdf.layout.property.HorizontalAlignment;


import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
 
public class GeracaoPDF {
 
    
    public void criarPdf(String dest, Locacao l) throws IOException {
        File file = new File(dest);
        file.getParentFile().mkdirs();
        
        //Initialize PDF writer
        PdfWriter writer = new PdfWriter(dest);

        //Initialize PDF document
        PdfDocument pdf = new PdfDocument(writer);
        // Inicializa o documento
        Document document = new Document(pdf, PageSize.A4);

        
        
        PdfFont titulo = PdfFontFactory.createFont(StandardFonts.TIMES_BOLD);
        Paragraph ptitulo = new Paragraph("COMPROVANTE DE LOCAÇÃO").setFont(titulo);
        ptitulo.setPaddingLeft(140);
        ptitulo.setFontSize(18);
        document.add(ptitulo);
        
        // parágrafo "Dados da Locadora"
        PdfFont marcador1 = PdfFontFactory.createFont(StandardFonts.TIMES_BOLD);
        Paragraph p1 = new Paragraph("Dados da Locadora");
        p1.setFontSize(10);
        p1.setFont(marcador1);            
        // parágrafo "Dados do Locatario"
        PdfFont marcador2 = PdfFontFactory.createFont(StandardFonts.TIMES_BOLD);
        Paragraph p2 = new Paragraph("Dados do Locatário");
        p2.setFontSize(10);
        p2.setFont(marcador2);      
        // parágrafo "Dados do Veículo"
        PdfFont marcador3 = PdfFontFactory.createFont(StandardFonts.TIMES_BOLD);
        Paragraph p3 = new Paragraph("Dados do Veículo");
        p3.setFontSize(10);
        p3.setFont(marcador3);  
        // parágrafo "Dados da Locação"
        PdfFont marcador4 = PdfFontFactory.createFont(StandardFonts.TIMES_BOLD);
        Paragraph p4 = new Paragraph("Dados da Locação");
        p4.setFontSize(10);
        p4.setFont(marcador4); 

        // adiciona tabelas no PDF
        List<Table> tabelas = new ArrayList<>();
        tabelas = gerarTabelas(l);
        document.add(p1);
        document.add(tabelas.get(0));
        document.add(p2);
        document.add(tabelas.get(1));
        document.add(p3);
        document.add(tabelas.get(2));
        document.add(p4);
        document.add(tabelas.get(3));
        
        Paragraph branco = new Paragraph(" ");
        document.add(branco);
        Paragraph branco2 = new Paragraph(" ");
        document.add(branco2);
        Paragraph branco3 = new Paragraph(" ");
        document.add(branco3);
        Paragraph branco4 = new Paragraph(" ");
        document.add(branco4);
        // adiciona linhas de assinatura
        PdfFont assinatura = PdfFontFactory.createFont(StandardFonts.TIMES_BOLD);
        Paragraph a1 = new Paragraph("ASSINATURA DO VENDEDOR ");
        a1.setFontSize(12);
        a1.setPaddingLeft(180);
        a1.setFont(assinatura);          
        
        PdfFont linha = PdfFontFactory.createFont(StandardFonts.TIMES_BOLD);
        Paragraph a2 = new Paragraph("___________________________________________________");
        a2.setFontSize(12);
        a2.setPaddingLeft(110);
        a2.setFont(assinatura); 
        
        PdfFont assinatura2 = PdfFontFactory.createFont(StandardFonts.TIMES_BOLD);
        Paragraph a3 = new Paragraph("ASSINATURA DO LOCATÁRIO ");
        a3.setPaddingLeft(180);
        a3.setFontSize(12);
        
        a3.setFont(assinatura2);          
        
        PdfFont linha2 = PdfFontFactory.createFont(StandardFonts.TIMES_BOLD);
        Paragraph a4 = new Paragraph("___________________________________________________");
        a4.setFontSize(12);
        a4.setPaddingLeft(110);
        a4.setHorizontalAlignment(HorizontalAlignment.CENTER);
        a4.setFont(linha2); 
        
        document.add(a1);
        document.add(a2);
        document.add(a3);
        document.add(a4);
        //Fechar documento
        document.close();
    }
    public List<Table> gerarTabelas(Locacao l) throws IOException {
        List<Table> tabelas = new ArrayList<>();
        
        // dados Locadora
        Table table1 = new Table(new float[] {25, 75}) // in points
        .setWidth(100) //100 pt
        .setFixedLayout();
        table1.setFontSize(10);
        PdfFont marcador = PdfFontFactory.createFont(StandardFonts.TIMES_ROMAN);
        table1.setWidth(500);
        table1.setFont(marcador);
        
        table1.setHorizontalAlignment(HorizontalAlignment.CENTER);
        table1.addCell("Nome da Locadora: ");
        table1.addCell(l.getNomeLocadora());
        table1.addCell("Endereço da Locadora: ");
        table1.addCell(l.getEnderecoLocadora());
        table1.addCell("CNPJ: ");
        table1.addCell(l.getCnpjLocadora());
        table1.addCell("E-mail: ");
        table1.addCell(l.getEmailLocadora());
        tabelas.add(table1);
        
        // dados Locatário
        Table table2 = new Table(new float[] {25, 75}) // in points
        .setWidth(100) //100 pt
        .setFixedLayout();
        table2.setFontSize(10);
        table2.setWidth(500);
        table2.setFont(marcador);
        
        table2.setHorizontalAlignment(HorizontalAlignment.CENTER);
        table2.addCell("Nome: ");
        table2.addCell(l.getNomeLocatario());
        table2.addCell("Data de Nascimento: ");
        table2.addCell(l.getNascLocatario());
        table2.addCell("Endereço: ");
        table2.addCell(l.getEnderecoLocatario());
        table2.addCell("Telefone: ");
        table2.addCell(l.getTelefoneLocatario());
        table2.addCell("E-mail: ");
        table2.addCell(l.getEmailLocatario()); 
        table2.addCell("CNH: ");
        table2.addCell(l.getCnhLocatario());
        table2.addCell("CPF: ");
        table2.addCell(l.getCpfLocatario());
        tabelas.add(table2);
        
        // dados do Veículo
        Table table3 = new Table(new float[] {25, 75}) // in points
        .setWidth(100) //100 pt
        .setFixedLayout();
        table3.setFontSize(10);
        table3.setWidth(500);
        table3.setFont(marcador);
        
        table3.setHorizontalAlignment(HorizontalAlignment.CENTER);
        table3.addCell("Marca: ");
        table3.addCell(l.getMarca());
        table3.addCell("Modelo: ");
        table3.addCell(l.getModelo());
        table3.addCell("Cor: ");
        table3.addCell(l.getCor());
        table3.addCell("Tipo de Combustível: ");
        table3.addCell(l.getTipoComb());
        table3.addCell("Capacidade do Tanque: ");
        table3.addCell(String.valueOf(l.getCapaciTanque()));
        table3.addCell("Quantidade de Combustível: ");
        table3.addCell(String.valueOf(l.getQuantTanque())); 
        table3.addCell("Placa: ");
        table3.addCell(l.getPlaca());
        table3.addCell("Ano de Lançamento: ");
        table3.addCell(l.getAnoLancamento());
        tabelas.add(table3);
        
        // dados da Locação
        Table table4 = new Table(new float[] {25, 75}) // in points
        .setWidth(100) //100 pt
        .setFixedLayout();
        table4.setFontSize(10);
        table4.setWidth(500);
        table4.setFont(marcador);
        
        table4.setHorizontalAlignment(HorizontalAlignment.CENTER);
        table4.addCell("Data de Saída: ");        
        table4.addCell(l.getDataSaida()); 
        table4.addCell("Horário de Saída: ");        
        table4.addCell(l.getHorarioSaida()); 
        table4.addCell("Devolução prevista para: ");        
        table4.addCell(l.getDataDevolucao()); 
        tabelas.add(table4);
        
        return tabelas;
    }
}