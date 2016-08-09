/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package machinetoolstore.core.util;

import machinetoolstore.core.model.FileKeeper;
import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

/**
 *
 * @author main
 */
@Component
public class ExcelFileValidator implements Validator {

    @Override
    public boolean supports(Class<?> clazz) {
        return FileKeeper.class.isAssignableFrom(clazz);
    }

    @Override
    public void validate(Object target, Errors errors) {
        FileKeeper file = (FileKeeper) target;
        
        System.out.println(file.getFile().getContentType());
        System.out.println(file.getFile().getName());
        System.out.println(file.getFile().getOriginalFilename());
        System.out.println(file.getFile().getSize());
        
        if(file.getFile() != null) {
            if(file.getFile().getSize() == 0) {
                errors.rejectValue("file", "missing.file");
            }
        } else if(file.getFile() != null) {
            if(!file.getFile().getContentType().equals("application/vnd.openxmlformats-officedocument.spreadsheetml.sheet")) {
                errors.rejectValue("file", "missing.expansion");
            }
        }
        
        
    }
    
}
