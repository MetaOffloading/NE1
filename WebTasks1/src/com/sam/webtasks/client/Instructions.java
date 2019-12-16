package com.sam.webtasks.client;

public class Instructions {

	public static String Get(int index) {
		String i="";
		 
		switch(index) {
		case 0:
			i="Instructions about dragging to the bottom";
			break;
		case 1:
			i="Instructions about a single tarrget";
			break;
		case 2:
			i="Instructions about the offloading strategy";
			break;
		case 3:
			i="Forced internal trial, no feedback group.";
			break;
		case 4:
			i="Forced external trial, no feedback group.";
			break;
		case 5:
			i="Instructions about strategy choice and point scoring";
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
                + "attention and memory. Full instructions will be provided before the experiment begins. "
                + "The experiment "
                + "will last approximately 40 minutes. There are no anticipated risks or "
                + "benefits associated with participation in this study.<br><br>"
                + "It is up to you to decide whether or not to take part. If you choose "
                + "not to participate, you won't incur any penalties or lose any "
                + "benefits to which you might have been entitled. However, if you do "
                + "decide to take part, you can print out this information sheet and "
                + "you will be asked to fill out a consent form on the next page. "
                + "Even after agreeing to take "
                + "part, you can still withdraw at any time and without giving a reason. "
                + "<br><br>All data will be collected and stored in accordance with the UK Data "
                + "Protection Act 1998.");
    }

}
