package com.stackroute.giphyservice.domain;


import org.springframework.data.annotation.Id;

import java.util.List;

public class Image {
    private String imageId;
    private String defaultUrl;
    private String defaultWidth;
    private String defaultHeight;
    private String defaultSize;
    private List<ImageRepresentation> imageRepresentations;




}
