package com.stackroute.giphyservice.domain;

import org.springframework.data.annotation.Id;


public class ImageRepresentation {
    @Id
    private String representationId;
    private String url;
    private String width;
    private String height;
    private String size;


}
