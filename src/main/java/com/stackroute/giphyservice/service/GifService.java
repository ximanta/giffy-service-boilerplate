package com.stackroute.giphyservice.service;

import com.stackroute.giphyservice.domain.Gif;
import com.stackroute.giphyservice.exception.GifAlreadyExistsException;
import com.stackroute.giphyservice.exception.GifNotFoundException;

import java.util.List;

public interface GifService {
    Gif saveGif(Gif gif) throws GifAlreadyExistsException;

    boolean deleteGif(String gifId) throws GifNotFoundException;

    Gif updateCaptionForGif(String caption, String gifId) throws GifNotFoundException;

    List<Gif> getAllGifsFromWishList() throws Exception;

    Gif getByGiphyId(String giphyId);

}
