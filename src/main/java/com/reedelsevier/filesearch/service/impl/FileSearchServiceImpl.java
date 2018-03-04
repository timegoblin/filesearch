package com.reedelsevier.filesearch.service.impl;

import com.reedelsevier.filesearch.service.FileSearchService;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 *
 */
@Service
public class FileSearchServiceImpl implements FileSearchService{

    public List<String> findFilesContainingAllWords(List<String> words) {
        // Check the configured directory exists and accessible

        // As the directory exist and accessible.. determine the depth of search by finding all sub-directories

        // Single directory... scan it.. otherwise fork threads to process each sub-directory
        return null;
    }
}
