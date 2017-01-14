////////////////////
// Kirk Easterson //
// CST 242 Final ///
////////////////////

package view;

import java.util.EventListener;

public interface SAINeditViewListener extends EventListener
{
	public String updateNameClicked();
	
	public void updateMajorClicked();
	
	public String updateUserNameClicked();
	
	public String updatePasswordClicked();
	
	public double updateGpaClicked();
	
	public void updateCoursesTookClicked();
	
	public void updateCoursesTookOther();
	
	public void updateCoursesTookFailed();
	
	public void updateCoursesTookTaking();
	
	// Update button method
	public void saveButtonClicked(SAINeditViewEvent ev);
	
}
