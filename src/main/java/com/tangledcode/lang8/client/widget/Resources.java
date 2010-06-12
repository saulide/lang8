package com.tangledcode.lang8.client.widget;

import com.google.gwt.resources.client.ClientBundle;
import com.google.gwt.resources.client.ImageResource;

public interface Resources extends ClientBundle {

    @Source("com/tangledcode/lang8/public/images/valid.png")
    ImageResource valid();

    @Source("com/tangledcode/lang8/public/images/invalid.png")
    ImageResource invalid();

}
