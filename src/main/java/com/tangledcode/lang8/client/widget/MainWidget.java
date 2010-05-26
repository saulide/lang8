package com.tangledcode.lang8.client.widget;

import com.google.gwt.core.client.GWT;
import com.google.gwt.dom.client.Element;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.uibinder.client.UiTemplate;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.LayoutPanel;
import com.google.gwt.user.client.ui.SimplePanel;
import com.google.gwt.user.client.ui.Widget;
import com.tangledcode.lang8.client.presenter.MainPresenter.Display;

public class MainWidget extends Composite implements Display {

    private static MainWidgetUiBinder uiBinder = GWT.create(MainWidgetUiBinder.class);

    @UiField LayoutPanel content;
    @UiField Element title;
    @UiField SimplePanel menu;

    private Widget widget;

    @UiTemplate("ui/MainWidget.ui.xml")
    interface MainWidgetUiBinder extends UiBinder<Widget, MainWidget> {
    }

    public MainWidget() {
        initWidget(uiBinder.createAndBindUi(this));
    }

    public void addContent(org.enunes.gwt.mvp.client.view.Display display) {
        this.removeContent();

        this.widget = display.asWidget();
        this.content.add(this.widget);
    }

    public void addMenu(org.enunes.gwt.mvp.client.view.Display display) {
        this.menu.setWidget(display.asWidget());
    }

    public void setTitle(String title) {
        this.title.setInnerText(title);
    }

    public void removeContent() {
        if(this.widget != null) {
            this.content.remove(this.widget);
        }
    }

    public Widget asWidget() {
        return this;
    }

}
