/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package machinetoolstore.core.controller;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.util.Arrays;
import java.util.Enumeration;
import java.util.List;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.validation.Valid;
import machinetoolstore.core.model.CompareWrapper;
import machinetoolstore.core.model.FileKeeper;
import machinetoolstore.core.model.MachineFilter;
import machinetoolstore.core.model.MultiFileKeeper;
import machinetoolstore.core.model.ThreeRollMill;
import machinetoolstore.core.model.ThreeRollMillWrapper;
import machinetoolstore.core.service.ActionService;
import machinetoolstore.core.util.ExcelFileValidator;
import machinetoolstore.core.util.ExcelParser;
import machinetoolstore.core.util.FileUploader;
import machinetoolstore.core.util.PdfGenerator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.util.FileCopyUtils;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;


/**
 *
 * @author main
 */
@Controller
public class PageController {
    
    @Autowired
    ExcelParser excelParser;
    
    @Autowired
    ExcelFileValidator excelFileValidator;
    
    @Autowired
    private ActionService actionService;
    
    @InitBinder("fileKeeper")
    public void initBinderFileKeeper(WebDataBinder binder) {
        binder.setValidator(excelFileValidator);
    }
    
    @RequestMapping(value = {"/", "/index", "/home"}, method = RequestMethod.GET)
    public String getIndexPage(ModelMap map) {
        return "index";
    }
    
    @RequestMapping(value = {"/machines"}, method = RequestMethod.GET)
    public String getMachinesPage(ModelMap map) {
        List<ThreeRollMillWrapper> list = actionService.findAll();
        map.addAttribute("machines_list", list);
        return "machines";
    }
    
    @RequestMapping(value = {"/machine-{id}"}, method = RequestMethod.GET)
    public String getSelectedMachine(@PathVariable Integer id, ModelMap map) {
        ThreeRollMill selected = actionService.getById(id);
        map.addAttribute("machine", selected);
        return "machine";
    }
    
    
    @RequestMapping(value={"/filter"}, method = RequestMethod.POST, produces = "application/json")
    public @ResponseBody List<ThreeRollMillWrapper> getByFilter(@RequestBody MachineFilter machineFilter) {
        List<ThreeRollMillWrapper> list = actionService.searchByFilter(machineFilter);
        return list;
    }
    
    @RequestMapping(value = {"/compare"}, method = RequestMethod.GET)
    public String getComparePage(ModelMap map) {
        return "compare";
    }
    
    @RequestMapping(value= {"/compare"}, method = RequestMethod.POST, produces = "application/json")
    public @ResponseBody List<CompareWrapper> getByComparator(@RequestBody Integer[] matchData) {
        List<CompareWrapper> list = actionService.searchByMatcher(matchData);
        return list;
    }
    
    @RequestMapping(value={"/download-pdf-{id}"}, method = RequestMethod.GET)
    public void downloadGeneratedPdfById(HttpServletResponse response, @PathVariable("id") int id) throws Exception{
        String fileName = "machine-pdf-" + id + ".pdf";
        if(new File(PdfGenerator.getGeneratedFilesPath() + fileName).exists()) {
            File pdfFile = new File(PdfGenerator.getGeneratedFilesPath() + fileName);
            response.setContentType("application/octet-stream");
            response.setHeader("Content-Disposition", String.format("inline; filename=\"" + pdfFile.getName() +"\""));
            response.setContentLength((int) pdfFile.length());
            InputStream inputStream = new BufferedInputStream(new FileInputStream(pdfFile), 1024);
            FileCopyUtils.copy(inputStream, response.getOutputStream());
        } else {
            PdfGenerator.getGeneratedPdfByArtifact(actionService.getById(id), fileName);
            File pdfFile = new File(PdfGenerator.getGeneratedFilesPath() + fileName);
            response.setContentType("application/octet-stream");
            response.setHeader("Content-Disposition", String.format("inline; filename=\"" + pdfFile.getName() +"\""));
            response.setContentLength((int) pdfFile.length());
            InputStream inputStream = new BufferedInputStream(new FileInputStream(pdfFile), 1024);
            FileCopyUtils.copy(inputStream, response.getOutputStream());
        }
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    //Переделать!!!!
    
    @RequestMapping(value = {"/admin"}, method = RequestMethod.GET)
    public String adminPage(ModelMap map) {
        FileKeeper fileKeeper = new FileKeeper();
        MultiFileKeeper multiFileKeeper = new MultiFileKeeper();
        ThreeRollMill empty = new ThreeRollMill();
        map.addAttribute("multiFileKeeper", multiFileKeeper);
        map.addAttribute("fileKeeper", fileKeeper);
        map.addAttribute("object", empty);
        return "admin";
    }
    
    @RequestMapping(value = {"/excel-import"}, method = RequestMethod.POST)
    public String importFile(@Valid FileKeeper fileKeeeper, BindingResult result, ModelMap map) {
        ThreeRollMill empty = new ThreeRollMill();
        if(result.hasErrors()) {
            System.out.println("Valid error");
            map.addAttribute("object", empty);
            return "admin";
        } else {
            MultipartFile multipartFile = fileKeeeper.getFile();
            FileUploader.upload(multipartFile);
            ThreeRollMill trm = excelParser.doExcelParse(multipartFile.getOriginalFilename());
            System.out.println(trm);
            actionService.addThreeRollMill(trm);
            map.addAttribute("object", trm);
            return "admin";
        }
    }
}
