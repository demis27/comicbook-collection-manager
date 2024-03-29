package org.demis27.cbc.comicbook.operations;

import io.micronaut.http.HttpResponse;
import io.micronaut.http.MediaType;
import io.micronaut.http.annotation.Body;
import io.micronaut.http.annotation.Delete;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.annotation.PathVariable;
import io.micronaut.http.annotation.Post;
import io.micronaut.http.annotation.Put;
import org.demis27.cbc.domain.Comicbook;

import java.util.List;

public interface ComicbookOperations {

    @Get(value = "/", produces = MediaType.APPLICATION_JSON) HttpResponse<List<Comicbook>> list();

    @Get(value = "/{id}", produces = MediaType.APPLICATION_JSON) HttpResponse<Comicbook> get(@PathVariable String id);

    @Post(value = "/", consumes = MediaType.APPLICATION_JSON, produces = MediaType.APPLICATION_JSON)
    HttpResponse<Comicbook> post(@Body Comicbook person);

    @Put(value = "/{id}", consumes = MediaType.APPLICATION_JSON, produces = MediaType.APPLICATION_JSON)
    HttpResponse<Comicbook> put(@PathVariable String id, @Body Comicbook comicbook);

    @Delete(value = "/{id}") HttpResponse delete(@PathVariable String id);
}
