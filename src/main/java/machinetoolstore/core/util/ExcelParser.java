/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package machinetoolstore.core.util;


import java.io.File;
import java.io.FileInputStream;
import java.util.ArrayList;
import machinetoolstore.core.model.ThreeRollMill;
import machinetoolstore.core.model.ThreeRollMillPhoto;
import machinetoolstore.core.model.ThreeRollMillVideo;
import machinetoolstore.core.service.ActionService;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.util.FileCopyUtils;
import org.springframework.web.multipart.MultipartFile;

/**
 *
 * @author main
 */
@Component
public class ExcelParser {
    
    private static final String UPLOAD_LOCATION = "/home/main/Data/Repository/MachinetoolWebStore/src/main/webapp/static/assets/files/";

    @Autowired
    ActionService actionService;
    
    public ThreeRollMill doExcelParse(String fileName) {
        String filePath = UPLOAD_LOCATION + fileName;
        File importFile = new File(filePath);
        ThreeRollMill entity = new ThreeRollMill();
        
        try(FileInputStream fis = new FileInputStream(importFile)) {
            int counter = 0;
                
            XSSFWorkbook xssf = new XSSFWorkbook(fis);
            XSSFSheet xssfSheet = xssf.getSheetAt(0);
        
            entity.setCommonId((int) xssfSheet.getRow(counter++).getCell(1).getNumericCellValue());
            entity.setType(xssfSheet.getRow(counter++).getCell(1).getStringCellValue());
            entity.setModel(xssfSheet.getRow(counter++).getCell(1).getStringCellValue());
            entity.setBrand(xssfSheet.getRow(counter++).getCell(1).getStringCellValue());
            entity.setManufacturer(xssfSheet.getRow(counter++).getCell(1).getStringCellValue());
            entity.setMachineState(xssfSheet.getRow(counter++).getCell(1).getStringCellValue());
            entity.setYearOfIssue((int) xssfSheet.getRow(counter++).getCell(1).getNumericCellValue());
            entity.setLocation(xssfSheet.getRow(counter++).getCell(1).getStringCellValue());
            entity.setSales(xssfSheet.getRow(counter++).getCell(1).getStringCellValue());
            entity.setMaterialThickness((int) xssfSheet.getRow(counter++).getCell(1).getNumericCellValue());
            entity.setMaterialWidth((int) xssfSheet.getRow(counter++).getCell(1).getNumericCellValue());
            entity.setBendingSpeed(xssfSheet.getRow(counter++).getCell(1).getNumericCellValue());
            entity.setMinDiameterMaxBend((int) xssfSheet.getRow(counter++).getCell(1).getNumericCellValue());
            entity.setTopRollDiameter((int) xssfSheet.getRow(counter++).getCell(1).getNumericCellValue());
            entity.setMiddleRollDiameter((int) xssfSheet.getRow(counter++).getCell(1).getNumericCellValue());
            entity.setDistanceOfBottomTwoRolls((int) xssfSheet.getRow(counter++).getCell(1).getNumericCellValue());
            entity.setMaterialProofStress((int) xssfSheet.getRow(counter++).getCell(1).getNumericCellValue());
            entity.setMainEnginePower(xssfSheet.getRow(counter++).getCell(1).getNumericCellValue());
            entity.setMachineDimensions(xssfSheet.getRow(counter++).getCell(1).getStringCellValue());
            entity.setMachineWeight((int) xssfSheet.getRow(counter++).getCell(1).getNumericCellValue());
            entity.setMachinePrice((int) xssfSheet.getRow(counter++).getCell(1).getNumericCellValue());
            entity.setDescription(xssfSheet.getRow(counter++).getCell(1).getStringCellValue());
            entity.setMainPhoto(xssfSheet.getRow(counter).getCell(1).getStringCellValue());
            
            ArrayList<ThreeRollMillPhoto> photoList = new ArrayList<>();
            for(int i = 0; i < 5; i++) {
                if(!(xssfSheet.getRow(counter).getCell(1).getStringCellValue()).equals("")) {
                    ThreeRollMillPhoto photo = new ThreeRollMillPhoto();
                    photo.setImageName(xssfSheet.getRow(counter).getCell(1).getStringCellValue());
                    photo.setThreeRollMill(entity);
                    photoList.add(photo);
                }
                counter++;
            }
            
            ArrayList<ThreeRollMillVideo> videoList = new ArrayList<>();
            for(int i = 0; i < 5; i++) {
                if(!(xssfSheet.getRow(counter).getCell(1).getStringCellValue()).equals("")) {
                    ThreeRollMillVideo video = new ThreeRollMillVideo();
                    video.setVideoUrl(xssfSheet.getRow(counter).getCell(1).getStringCellValue());
                    video.setThreeRollMill(entity);
                    videoList.add(video);
                }
                counter++;
            }
            
            entity.setPhotoList(photoList);
            entity.setVideoList(videoList);
            
        } catch(Exception e) {
                e.printStackTrace();
        }
        return entity;
    }
}
