/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package machinetoolstore.core.util;

import java.io.File;
import org.springframework.util.FileCopyUtils;
import org.springframework.web.multipart.MultipartFile;

/**
 *
 * @author main
 */
public class FileUploader {
    private static final String UPLOAD_LOCATION = "/home/main/Data/Repository/MachinetoolWebStore/src/main/webapp/static/assets/files/";

    public static void upload(MultipartFile file) {
        try {
            FileCopyUtils.copy(file.getBytes(), new File(UPLOAD_LOCATION + file.getOriginalFilename()));
        } catch(Exception e) {
            e.printStackTrace();
        }
    }
}
