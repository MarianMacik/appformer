package org.uberfire.annotations.processors;

import org.uberfire.client.annotations.WorkbenchClientEditor;
import org.uberfire.client.annotations.WorkbenchPartTitle;
import org.uberfire.lifecycle.GetContent;
import org.uberfire.lifecycle.SetContent;
import org.uberfire.lifecycle.GetPreview;

import com.google.gwt.user.client.ui.Widget;

import elemental2.promise.Promise;

@WorkbenchClientEditor(identifier = "editor")
public class WorkbenchClientEditorTest7 extends Widget {
    
    
    @WorkbenchPartTitle
    public String title() {
        return "title";
    }
    
    @SetContent
    public void setContent(String path, String content) {
        
    }
    
    @GetContent
    public Promise getContent() {
        return null;
    }
    
    @GetPreview
    public Promise getPreview() {
        return null;
    }

}