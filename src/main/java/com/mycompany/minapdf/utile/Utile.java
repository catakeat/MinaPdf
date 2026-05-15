/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.minapdf.utile;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.pdmodel.PDPage;
import java.util.UUID;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

/**
 *
 * @author catalin.arsulescu
 */
public class Utile {

    String tempFolder = "temp_files";
    private static String lastFileCreated;
    private static final ObservableList<String> recentFiles = FXCollections.observableArrayList();

    private String getTempFolder() {
        String folderName = tempFolder;
        File directory = new File(folderName);
        if (!directory.exists()) {
            directory.mkdir();
        }
        return directory.toString();
    }

    public String createOnePageDocument() throws IOException {

        String randomFileName = createRandomFileName();
        String fullPath = getTempFolder() + File.separator + randomFileName;
        try (PDDocument document = new PDDocument()) {
            PDPage firstPage = new PDPage();
            document.addPage(firstPage);
            document.save(fullPath);
            fullPath = getTempFolder() + File.separator + randomFileName;
        }
        return fullPath;

    }

    public String createRandomFileName() {
        String fileName = UUID.randomUUID().toString();

        return fileName + ".pdf";
    }

    public static ObservableList<String> getRecentFiles() {

        return recentFiles;

    }

    public static String getLastFilePath() {
        return lastFileCreated;
    }
}
