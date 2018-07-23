package com.mook.excel.helper;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.mook.excel.helper.annotation.Sheet;
import com.mook.excel.helper.util.ClassAssistant;

public class ClassAssistantTest {

    @Test
    public void getSheetNameTest() {
        assertEquals("A", ClassAssistant.getSheetName(A.class));
        assertEquals("List", ClassAssistant.getSheetName(B.class));
    }
    
    
    
    static class A {}
    
    @Sheet(name = "List")
    static class B{}
    
}