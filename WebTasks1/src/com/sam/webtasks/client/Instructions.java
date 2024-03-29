package com.sam.webtasks.client;

import com.sam.webtasks.iotask2.IOtask2BlockContext;

public class Instructions {

	public static String Get(int index) {
		String i="";
		 
		switch(index) {
		case 0:
			i="In this experiment you will have a simple task to do.<br><br>"
                    + "You will see several yellow circles inside a box. "
                    + "Inside each circle will be a number. <br><br>"
                    + "You can move them around using your mouse. Your task is to drag them to the bottom "
                    + "of the box in sequence. "
                    + "Please start by dragging 1 all the way to the bottom. "
                    + "This will make it disappear. Then drag 2 to the bottom, then 3, "
                    + "and so on.<br><br>";
			break;
		case 1:
			i="Now you will continue the same task, but sometimes there will be something else to "
                    + "do.<br><br>As well as dragging each circle in turn to the "
                    + "bottom of the screen, there will sometimes be special "
                    + "circles that you should drag in another direction (left, top, or right) instead of towards the bottom.<br><br>"
                    + "These special circles will initially appear in a different colour "
                    + "when they are first shown on the screen, instead of yellow. This is an "
                    + "instruction telling you where they should go.<br><br>"
                    + "For example, suppose that the circle with 7 in it was first shown in blue "
                    + "when it appeared on the screen. That would be an instruction that "
                    + "when you get to 7 in the sequence, you should drag that circle "
                    + "to the blue side of the box (left) instead of the bottom.<br><br>"
                    + "You will still be able to drag any "
                    + "circle to the bottom of the box, but you should try to "
                    + "remember to drag these special circles to the instructed "
                    + "location instead.";
			break;
		case 2:
			i="Now we are going to explain a strategy that can make the task easier.<br><br>"
                    + "When you see a special circle, you can set a reminder by immediately dragging it to a "
                    + "different part of the box. For example, if a circle initially appeared in blue, you "
                    + "could immediately drag it next to the blue (left) side of the box. Then, when "
                    + "you get to that circle in the sequence its location would remind you where it is supposed "
                    + "to go.<br><br>Please now try the task again, using this strategy to help you.";
			break;
		case 3:
			i="From now on you will score 10 points every time you drag one of the special circles to the correct "
					+ "location.<br><br>Please try to score as many points as you can.";
			break;
		case 4:
			i="You have scored " + IOtask2BlockContext.getTotalPoints() + " points so far.<br><br>Now, you "
					+ "will have to do the task just using your <b>own memory</b>, and the computer will not let you set any reminders.";
			break;
		case 5:
			i="You have scored " + IOtask2BlockContext.getTotalPoints() + " points so far.<br><br>Now, you "
					+ "will have to do the task using the strategy of setting <b>reminders</b> for every special circle. The computer will "
					+ "only let you continue if you set reminders for all the special circles.";
			break;
		case 6:
			i="We would now like you to predict how well you will be able to do in the rest of the experiment "
					+ "<b>when you use your own memory.</b><br><br>Please use the scale below to indicate what percentage of "
                    + "the special circles you will correctly drag to the instructed side of the square, on average. 100% "
                    + "would mean that you always get every single one correct. 0% would mean that you can never "
                    + "get any of them correct.<br><br>Please remember that you should just answer about your ability "
                    + "to do the task with your <b>own memory</b>.";
			break;
		case 7:
			i="Now, please predict how well you will be able to do in the rest of the experiment "
					+ "<b>when you use reminders.</b><br><br>Please use the scale below to indicate what percentage of "
                    + "the special circles you will correctly drag to the instructed side of the square, on average. 100% "
                    + "would mean that you always get every single one correct. 0% would mean that you can never "
                    + "get any of them correct.<br><br>Please remember that you should just answer about your ability "
                    + "to do the task with <b>reminders</b>.";
			break;
		case 8:
			i="From now on, you will be given a choice between two options when you do the task. One option will be to do the task "
	                + "without being able to set any reminders. If you choose this option, you will always score "
	                + "10 points for every special circle you remember.<br><br>The other option will be to "
	                + "do the task with reminders, but in this case each special circle will be worth "
	                + "fewer points. For example, you might be told that if you want to use reminders, "
	                + "each special circle will be worth only 5 points.<br><br>You should choose whichever "
	                + "option you think will score you the most points. <br><br>So if, for example, you "
	                + "thought you would earn more points by setting reminders and scoring 5 points for "
	                + "each special circle, you should choose this option. But if you thought you would "
	                + "score more points by just using your own memory and earning 10 points for each special "
	                + "circle, you should choose this option instead.";
			break;
		case 9:
			i="When you are presented with a choice like this, it is completely up to you. "
                    + "You should do whatever you think will allow you to score the highest number of points.<br><br>"
                    + "You are now in the final part of the experiment. When the progress bar above is complete the experiment will "
                    + "end.";
			break;
		case 10:
			i="You have now finished doing the task. But we would like you to make some more predictions. Suppose you had to do the "
					+ "task again using your <b>own memory</b>. What percentage of the special circles do you think you would be "
					+ "able to correctly drag to the instructed side of the square, on average? 100% would mean that you always "
					+ "get every single one correct. 0% would mean that you could never get any of them correct.<br><br>Please "
					+ "remember that you should just answer about your ability to do the task with your <b>own memory</b>.";
			break;
		case 11:
			i="Now please tell us you well you would be able to do the task if you had to use <b>reminders</b>. What percentage of "
					+ "the special circles do you think you would be able to correctly drag to the instructed side of the square, on "
					+ "average? 100% would mean that you always get every single one correct. 0% would mean that you could never "
					+ "get any of them correct.<br><br>Please remember that you should just answer about your ability to do the task "
					+ "using <b>reminders</b>.";
			break;
		}

		return(i);	
	}
	
	public static String InfoText() {
        return ("We would like to invite you to participate in this research project. "
                + "You should only participate if you want to; choosing not to take part "
                + "will not disadvantage you in any way. Before you decide whether you "
                + "want to take part, please read the following information carefully and "
                + "discuss it with others if you wish. Ask us if there is anything that "
                + "is not clear or you would like more information.<br><br>"
                + "We are recruiting volunteers from the Amazon Mechanical Turk website to "
                + "take part in an experiment aiming to improve our understanding of human "
                + "attention and memory. You will see various objects on the screen like coloured, numbered circles, "
                + "and you will be asked to move them with your computer mouse. Sometimes you will be asked to remember "
                + "particular numbers and move the corresponding circle in a particular direction. You will be asked how "
                + "confident you are in your ability to solve the task. "
                + "The experiment "
                + "will last approximately 45 minutes and you will receive a payment of $7.50 via the "
                + "Amazon Mechanical Turk payment system. There are no anticipated risks or "
                + "benefits associated with participation in this study.<br><br>"
                + "It is up to you to decide whether or not to take part. If you choose "
                + "not to participate, you won't incur any penalties or lose any "
                + "benefits to which you might have been entitled. However, if you do "
                + "decide to take part, you can print out this information sheet and "
                + "you will be asked to fill out a consent form on the next page. "
                + "Even after agreeing to take "
                + "part, you can still withdraw at any time and without giving a reason. If you withdraw before the "
                + "end of the experiment, we will not retain your data and it will not be analysed."
                + "<br><br>All data will be collected and stored in accordance with the General Data Protection "
                + "Regulations 2018. Personal information is stored separately from test results, and researchers "
                + "on this project have no access to this data. Your personal information such as name and email "
                + "address is held by Amazon Mechanical Turk but the researchers on this project have no acccess "
                + "to this. Data from this experiment may be made available to the research community, for example by "
                + "posting them on websites such as the Open Science Framework (<a href=\"http://osf.io\">http://osf.io</a>). "
                + "It will not be possible to identify you from these data.<br><br>"
                + "We aim to publish the results of this project in scientific journals and book chapters. Copies of the "
                + "results can either be obtained directly from the scientific journals' websites or from us.<br><br>"
                + "Should you wish to raise a complaint, please contact the Principal Investigator of this project, "
                + "Dr Sam Gilbert (<a href=\"mailto:sam.gilbert@ucl.ac.uk\">sam.gilbert@ucl.ac.uk</a>). However, "
                + "if you feel your complaint has not been handled to your satisfaction, please be aware that you can "
                + "also contact the Chair of the UCL Research Ethics Committee (<a href=\"mailto:ethics@ucl.ac.uk\">ethics@ucl.ac.uk</a>).");
	}
}
