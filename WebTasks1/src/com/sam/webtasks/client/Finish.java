package com.sam.webtasks.client;

import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.HTML;
import com.google.gwt.user.client.ui.RootPanel;
import com.google.gwt.user.client.ui.TextArea;
import com.google.gwt.user.client.ui.VerticalPanel;
import com.sam.webtasks.basictools.Names;
import com.sam.webtasks.basictools.PHP;
import com.sam.webtasks.iotask2.IOtask2BlockContext;

public class Finish {
	public static void Run() {
		if (SessionInfo.experimentType == Names.EXPERIMENT_MTURK) {
			final HTML goodbyeText = new HTML("Thank you for taking part. You scored a total of " + IOtask2BlockContext.getTotalPoints() + " points."
					+ "<br><br>If you would like "
					+ "to contact the experimenter you can email "
					+ "<a href=\"mailto:sam.gilbert@ucl.ac.uk\">sam.gilbert@ucl.ac.uk</a>."
					+ "<br><br>To receive your payment "
					+ "please copy the survey code below into the Mechanical Turk website:" + "<br><br>" + SessionInfo.rewardCode);

			final HTML commentText = new HTML("<br><br>Do you have any concerns about "
					+ "this experiment, or is there anything else you would like to tell " + "the experimenter?");

			final TextArea commentTextArea = new TextArea();

			commentTextArea.setCharacterWidth(128);
			commentTextArea.setVisibleLines(4);

			final Button button = new Button("Submit");

			final VerticalPanel commentPanel = new VerticalPanel();

			commentPanel.add(commentText);
			commentPanel.add(commentTextArea);
			commentPanel.add(button);

			RootPanel.get().add(goodbyeText);
			RootPanel.get().add(commentPanel);
		
			button.addClickHandler(new ClickHandler() {
				public void onClick(ClickEvent event) {
					RootPanel.get().remove(commentPanel);
				
					PHP.logData("comment", commentTextArea.getText(), false);
				}
			});
		} else if (SessionInfo.experimentType == Names.EXPERIMENT_STANDALONE) {
			final HTML goodbyeText = new HTML("You have now completed the experiment. Thank you for taking part");
			RootPanel.get().add(goodbyeText);
		}
	}
}
