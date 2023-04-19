package br.com.toloni.uploadawss3.api.controllers;

import br.com.toloni.uploadawss3.application.services.S3Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;

@RestController
@RequestMapping("/api")
public class UploadController extends ResponseController {

    @Autowired
    private S3Service s3Service;

    @PostMapping("/upload")
    public ResponseEntity<ResponseController> uploadFile(@RequestBody MultipartFile multipartFile) {
        try {
            s3Service.uploadFile(multipartFile);
            return ResponseEntity.ok(new ResponseController("Success", "File uploaded successfully!"));
        } catch (IOException e) {
            e.printStackTrace();
            return ResponseEntity.badRequest().body(new ResponseController("Fail", e.getMessage()));
        }
    }
}
