package com.bitzeche.jpasskit.server;

import org.restlet.Request;
import org.restlet.Response;
import org.restlet.resource.Finder;
import org.restlet.resource.ServerResource;

public final class PKPassResourceFactory extends Finder {

    private IPKRestletServerResourceFactory pkRestletServerResourceFactory;

    public PKPassResourceFactory(final IPKRestletServerResourceFactory pkRestletServerResourceFactory) {
        this.pkRestletServerResourceFactory = pkRestletServerResourceFactory;
    }

    @Override
    public ServerResource create(final Request request, final Response response) {
        return pkRestletServerResourceFactory.getPKPassResource();
    }

}