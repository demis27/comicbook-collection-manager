package org.demis27.cbc.comicbook.operations;

import io.micronaut.http.client.annotation.Client;

@Client(id = "comicbook", path = "/comicbook/v1/comicbooks")
public interface ComicbookClient extends ComicbookOperations {

}
