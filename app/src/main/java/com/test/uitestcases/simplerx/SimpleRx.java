package com.test.uitestcases.simplerx;

import io.reactivex.disposables.CompositeDisposable;

public class SimpleRx {

    private static final SimpleRx ourInstance = new SimpleRx();

    private static final CompositeDisposable bag = new CompositeDisposable();

    public static SimpleRx getInstance() {
        return ourInstance;
    }

    private SimpleRx() {

    }
}
