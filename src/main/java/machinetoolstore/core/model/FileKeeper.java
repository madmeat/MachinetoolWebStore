/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package machinetoolstore.core.model;

import org.springframework.web.multipart.MultipartFile;

/**
 *
 * @author main
 */
public class FileKeeper {
    
    private MultipartFile file;

    public MultipartFile getFile() {
        return file;
    }

    public void setFile(MultipartFile multupartFile) {
        this.file = multupartFile;
    }
}
