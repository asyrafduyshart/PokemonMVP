package com.asyraf.pokemon.runner;

import android.app.Application;
import android.content.Context;

import com.asyraf.pokemon.MvpStarterApplication;
import io.appflate.restmock.android.RESTMockTestRunner;

/**
 * Created by ravindra on 4/2/17.
 */
public class TestRunner extends RESTMockTestRunner {

    @Override
    public Application newApplication(ClassLoader cl, String className, Context context)
            throws InstantiationException, IllegalAccessException, ClassNotFoundException {
        return super.newApplication(cl, MvpStarterApplication.class.getName(), context);
    }

}
