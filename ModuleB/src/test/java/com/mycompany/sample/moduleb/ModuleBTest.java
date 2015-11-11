package com.mycompany.sample.moduleb;

import org.junit.Assert;

/**
 * Created by pandian on 4/29/15.
 */
public class ModuleBTest {

    @org.junit.Test
    public void shoudReturnNameOfTheModule() throws Exception {
        Assert.assertEquals("moduleb", ModuleB.whoAreYou());
    }
}