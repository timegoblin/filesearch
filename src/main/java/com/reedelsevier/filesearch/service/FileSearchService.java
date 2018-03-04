package com.reedelsevier.filesearch.service;

import java.util.List;

/**
 *
 */
public interface FileSearchService {

    /**
     *
     * @param words
     * @return
     */
    List<String> findFilesContainingAllWords(List<String> words) ;

}
