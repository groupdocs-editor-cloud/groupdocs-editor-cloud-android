/**
 * --------------------------------------------------------------------------------------------------------------------
 * <copyright company="Aspose Pty Ltd">
 *   Copyright (c) Aspose Pty Ltd
 * </copyright>
 * <summary>
 *  Permission is hereby granted, free of charge, to any person obtaining a copy
 *  of this software and associated documentation files (the "Software"), to deal
 *  in the Software without restriction, including without limitation the rights
 *  to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 *  copies of the Software, and to permit persons to whom the Software is
 *  furnished to do so, subject to the following conditions:
 * 
 *  The above copyright notice and this permission notice shall be included in all
 *  copies or substantial portions of the Software.
 * 
 *  THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 *  IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 *  FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 *  AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 *  LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 *  OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 *  SOFTWARE.
 * </summary>
 * --------------------------------------------------------------------------------------------------------------------
 */

package com.groupdocs.cloud.editor.api;

import java.util.ArrayList;

public class TestFiles {
    
    public static TestFile NotExist = new TestFile("NotExist.docx", "some-folder/");
    
    public static TestFile PasswordProtectedDocx = new TestFile("password-protected.docx", "WordProcessing\\");
    public static TestFile FourPagesDocx = new TestFile("four-pages.docx", "WordProcessing\\");    

    public static TestFile FourSheetsXlsx = new TestFile("four-sheets.xlsx","Spreadsheet\\");
    public static TestFile FourSheetsProtectedXlsx = new TestFile("four-sheets-protected.xlsx", "Spreadsheet\\");
    public static TestFile SampleTsv = new TestFile("sample.tsv", "Spreadsheet\\");

    public static TestFile WithNotesPptx = new TestFile("with-notes.pptx","Presentation\\");
    public static TestFile WithHiddenSlidePptx = new TestFile("with-two-visible-and-one-hidden-slide.odp","Presentation\\");

    public static TestFile Txt = new TestFile("document.txt", "Text\\");

    static {
        PasswordProtectedDocx.setPassword("password");        
        FourSheetsProtectedXlsx.setPassword("password");
    }

    public static ArrayList<TestFile> GetList() {
        
        ArrayList<TestFile> files = new ArrayList<TestFile>();
        
        files.add(PasswordProtectedDocx);
        files.add(FourPagesDocx);
        files.add(FourSheetsXlsx);
        files.add(FourSheetsProtectedXlsx);
        files.add(SampleTsv);
        files.add(WithNotesPptx);
        files.add(WithHiddenSlidePptx);
        files.add(Txt);

        return files; 
    } 
}