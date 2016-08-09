/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package machinetoolstore.core.util;

import com.itextpdf.io.image.ImageDataFactory;
import com.itextpdf.kernel.font.PdfFont;
import com.itextpdf.kernel.font.PdfFontFactory;
import com.itextpdf.kernel.geom.PageSize;
import com.itextpdf.kernel.pdf.PdfDocument;
import com.itextpdf.kernel.pdf.PdfWriter;
import com.itextpdf.layout.Document;
import com.itextpdf.layout.border.Border;
import com.itextpdf.layout.element.*;
import com.itextpdf.layout.property.TextAlignment;
import machinetoolstore.core.model.ThreeRollMill;

/**
 *
 * @author main
 */
public class PdfGenerator {
    
    private static final String FONTS_PATH = "/home/main/Data/Repository/MachinetoolWebStore/src/main/webapp/static/assets/fonts/"; 
    private static final String GENERATED_FILES_PATH = "/home/main/Data/Repository/MachinetoolWebStore/src/main/webapp/static/assets/pdf/";
    private static final String IMAGE_PATH = "/home/main/Data/Repository/MachinetoolWebStore/src/main/webapp/static/assets/images/";
    
    public static String getGeneratedFilesPath() {
        return GENERATED_FILES_PATH;
    }
    
    public static boolean getGeneratedPdfByArtifact(ThreeRollMill artifact, String fileName) throws Exception {
        PdfWriter writer = new PdfWriter(GENERATED_FILES_PATH + fileName);
        PdfDocument pdfDocument = new PdfDocument(writer);
        Document document = new Document(pdfDocument, PageSize.A4);
        
        document.setMargins(15, 15, 15, 40);
        PdfFont mainFont = PdfFontFactory.createFont(FONTS_PATH + "calibril.ttf", "cp1251", false);

        //Header
        Paragraph headerParagraph = new Paragraph(artifact.getBrand() + " " + artifact.getModel());
        headerParagraph.setItalic();
        headerParagraph.setTextAlignment(TextAlignment.CENTER);
        headerParagraph.setFont(mainFont);
        headerParagraph.setFontSize(20);
        document.add(headerParagraph);

        //Image block witch characteristic
        Table table = new Table(3);
        table.setWidthPercent(100);

        //Image cell
        Cell imageCell = new Cell();
        imageCell.setBorder(Border.NO_BORDER);
        Image machineImage = new Image(ImageDataFactory.create(IMAGE_PATH + artifact.getMainPhoto()));
        machineImage.setWidth(100);
        machineImage.setHeight(100);
        imageCell.add(machineImage);

        //Main characteristic cell
        Cell mainCharacteristicCell = new Cell();
        List mainCharacteristicList = new List()
                .setSymbolIndent(5)
                .setListSymbol("\uFFFF")
                .setFont(mainFont)
                .setFontSize(12);
        mainCharacteristicList.add("ID:")
                .add("Производитель:")
                .add("Год производства:")
                .add("Местонахождение:")
                .add("Состояние:")
                .add("Цена, $:");
        mainCharacteristicCell.add(mainCharacteristicList);
        
        Cell valuesCell = new Cell();
        List valuesList = new List()
                .setSymbolIndent(5)
                .setListSymbol("\uFFFF")
                .setFont(mainFont)
                .setFontSize(12);
        valuesList.add(artifact.getId().toString())
                .add(artifact.getManufacturer())
                .add(artifact.getYearOfIssue().toString())
                .add(artifact.getLocation())
                .add(artifact.getMachineState())
                .add(artifact.getMachinePrice().toString());
        valuesCell.add(valuesList);
        
        table.addCell(imageCell);
        table.addCell(mainCharacteristicCell);
        table.addCell(valuesCell);

        //Paragraph
        Paragraph contentParagraph = new Paragraph("Основные характеристики");
        contentParagraph.setItalic();
        contentParagraph.setTextAlignment(TextAlignment.CENTER);
        contentParagraph.setFont(mainFont);
        contentParagraph.setFontSize(14);
        contentParagraph.setFixedPosition(1, 635, 600);
        document.add(contentParagraph);

        //Main table
        Table mainTable = new Table(2);
        mainTable.setFont(mainFont);
        mainTable.setFontSize(10);
        mainTable.setMarginTop(35);
        mainTable.addCell("Тип станка").addCell(artifact.getType());
        mainTable.addCell("Толщина материала, мм").addCell(artifact.getMaterialThickness().toString());
        mainTable.addCell("Ширина материала, мм").addCell(artifact.getMaterialWidth().toString());
        mainTable.addCell("Скорость гибки, м/мин").addCell(artifact.getBendingSpeed().toString());
        mainTable.addCell("Min диаметр при max сгибе, мм").addCell(artifact.getMinDiameterMaxBend().toString());
        mainTable.addCell("Диаметр верхнего ролика, мм").addCell(artifact.getTopRollDiameter().toString());
        mainTable.addCell("Диаметр среднего ролика, мм").addCell(artifact.getMiddleRollDiameter().toString());
        mainTable.addCell("Расстояние между нижними двумя волками, мм").addCell(artifact.getDistanceOfBottomTwoRolls().toString());
        mainTable.addCell("Условный предел текучести для гибочного листа, МПа").addCell(artifact.getMaterialProofStress().toString());
        mainTable.addCell("Мощность главного двигателя, кВт").addCell(artifact.getMainEnginePower().toString());
        mainTable.addCell("Габариты ДВШ, мм").addCell(artifact.getMachineDimensions());
        mainTable.addCell("Вес станка, кг").addCell(artifact.getMachineWeight().toString());
        mainTable.addCell("Описание").addCell(artifact.getDescription());
        
        document.add(table);
        document.add(mainTable);
        document.close();
        
        return true;
    }
}
