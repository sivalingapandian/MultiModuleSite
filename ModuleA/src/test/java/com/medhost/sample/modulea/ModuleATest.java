package com.medhost.sample.modulea;

import org.junit.Assert;

import static org.junit.Assert.*;

/**
 * Created by pandian on 4/29/15.
 */
public class ModuleATest {

    @org.junit.Test
    public void shoudReturnNameOfTheModule() throws Exception {
        Assert.assertEquals("modulea", ModuleA.whoAreYou());
    }
}