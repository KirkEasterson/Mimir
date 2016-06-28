package view;

import java.util.EventListener;

public interface SAINviewListener extends EventListener
{
	// What if analysis hyperlink clicked
	public void whatIfAnalysisClicked(SAINviewEvent ev);
}
