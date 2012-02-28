/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package hello;

import javax.microedition.midlet.*;
import javax.microedition.lcdui.*;
import org.netbeans.microedition.lcdui.LoginScreen;

/**
 * @author ermh
 */
public class HelloMIDlet extends MIDlet implements CommandListener {
	
	private boolean midletPaused = false;
//<editor-fold defaultstate="collapsed" desc=" Generated Fields ">//GEN-BEGIN:|fields|0|
	private Command exitCommand;
	private LoginScreen loginScreen;
//</editor-fold>//GEN-END:|fields|0|

	/**
	 * The HelloMIDlet constructor.
	 */
	public HelloMIDlet() {
	}

//<editor-fold defaultstate="collapsed" desc=" Generated Methods ">//GEN-BEGIN:|methods|0|
//</editor-fold>//GEN-END:|methods|0|
//<editor-fold defaultstate="collapsed" desc=" Generated Method: initialize ">//GEN-BEGIN:|0-initialize|0|0-preInitialize
	/**
	 * Initializes the application.
	 * It is called only once when the MIDlet is started. The method is called before the <code>startMIDlet</code> method.
	 */
	private void initialize() {//GEN-END:|0-initialize|0|0-preInitialize
		// write pre-initialize user code here
//GEN-LINE:|0-initialize|1|0-postInitialize
		// write post-initialize user code here
	}//GEN-BEGIN:|0-initialize|2|
//</editor-fold>//GEN-END:|0-initialize|2|

//<editor-fold defaultstate="collapsed" desc=" Generated Method: startMIDlet ">//GEN-BEGIN:|3-startMIDlet|0|3-preAction
	/**
	 * Performs an action assigned to the Mobile Device - MIDlet Started point.
	 */
	public void startMIDlet() {//GEN-END:|3-startMIDlet|0|3-preAction
		// write pre-action user code here
		switchDisplayable(null, getLoginScreen());//GEN-LINE:|3-startMIDlet|1|3-postAction
		// write post-action user code here
	}//GEN-BEGIN:|3-startMIDlet|2|
//</editor-fold>//GEN-END:|3-startMIDlet|2|

//<editor-fold defaultstate="collapsed" desc=" Generated Method: resumeMIDlet ">//GEN-BEGIN:|4-resumeMIDlet|0|4-preAction
	/**
	 * Performs an action assigned to the Mobile Device - MIDlet Resumed point.
	 */
	public void resumeMIDlet() {//GEN-END:|4-resumeMIDlet|0|4-preAction
		// write pre-action user code here
//GEN-LINE:|4-resumeMIDlet|1|4-postAction
		// write post-action user code here
	}//GEN-BEGIN:|4-resumeMIDlet|2|
//</editor-fold>//GEN-END:|4-resumeMIDlet|2|

//<editor-fold defaultstate="collapsed" desc=" Generated Method: switchDisplayable ">//GEN-BEGIN:|5-switchDisplayable|0|5-preSwitch
	/**
	 * Switches a current displayable in a display. The <code>display</code> instance is taken from <code>getDisplay</code> method. This method is used by all actions in the design for switching displayable.
	 * @param alert the Alert which is temporarily set to the display; if <code>null</code>, then <code>nextDisplayable</code> is set immediately
	 * @param nextDisplayable the Displayable to be set
	 */
	public void switchDisplayable(Alert alert, Displayable nextDisplayable) {//GEN-END:|5-switchDisplayable|0|5-preSwitch
		// write pre-switch user code here
		Display display = getDisplay();//GEN-BEGIN:|5-switchDisplayable|1|5-postSwitch
		if (alert == null) {
			display.setCurrent(nextDisplayable);
		} else {
			display.setCurrent(alert, nextDisplayable);
		}//GEN-END:|5-switchDisplayable|1|5-postSwitch
		// write post-switch user code here
	}//GEN-BEGIN:|5-switchDisplayable|2|
//</editor-fold>//GEN-END:|5-switchDisplayable|2|

//<editor-fold defaultstate="collapsed" desc=" Generated Method: commandAction for Displayables ">//GEN-BEGIN:|7-commandAction|0|7-preCommandAction
	/**
	 * Called by a system to indicated that a command has been invoked on a particular displayable.
	 * @param command the Command that was invoked
	 * @param displayable the Displayable where the command was invoked
	 */
	public void commandAction(Command command, Displayable displayable) {//GEN-END:|7-commandAction|0|7-preCommandAction
		// write pre-action user code here
		if (displayable == loginScreen) {//GEN-BEGIN:|7-commandAction|1|24-preAction
			if (command == LoginScreen.LOGIN_COMMAND) {//GEN-END:|7-commandAction|1|24-preAction
				// write pre-action user code here
				exitMIDlet();//GEN-LINE:|7-commandAction|2|24-postAction
				// write post-action user code here
			}//GEN-BEGIN:|7-commandAction|3|7-postCommandAction
		}//GEN-END:|7-commandAction|3|7-postCommandAction
		// write post-action user code here
	}//GEN-BEGIN:|7-commandAction|4|24-postAction
//</editor-fold>//GEN-END:|7-commandAction|4|24-postAction


//<editor-fold defaultstate="collapsed" desc=" Generated Getter: exitCommand ">//GEN-BEGIN:|18-getter|0|18-preInit
	/**
	 * Returns an initiliazed instance of exitCommand component.
	 * @return the initialized component instance
	 */
	public Command getExitCommand() {
		if (exitCommand == null) {//GEN-END:|18-getter|0|18-preInit
			// write pre-init user code here
			exitCommand = new Command("Exit", Command.EXIT, 0);//GEN-LINE:|18-getter|1|18-postInit
			// write post-init user code here
		}//GEN-BEGIN:|18-getter|2|
		return exitCommand;
	}
//</editor-fold>//GEN-END:|18-getter|2|





//<editor-fold defaultstate="collapsed" desc=" Generated Getter: loginScreen ">//GEN-BEGIN:|22-getter|0|22-preInit
	/**
	 * Returns an initiliazed instance of loginScreen component.
	 * @return the initialized component instance
	 */
	public LoginScreen getLoginScreen() {
		if (loginScreen == null) {//GEN-END:|22-getter|0|22-preInit
			// write pre-init user code here
			loginScreen = new LoginScreen(getDisplay());//GEN-BEGIN:|22-getter|1|22-postInit
			loginScreen.setLabelTexts("Username", "Password");
			loginScreen.setTitle("Picasa Login");
			loginScreen.addCommand(LoginScreen.LOGIN_COMMAND);
			loginScreen.setCommandListener(this);
			loginScreen.setBGColor(-3355444);
			loginScreen.setFGColor(0);
			loginScreen.setUseLoginButton(false);
			loginScreen.setLoginButtonText("Login");//GEN-END:|22-getter|1|22-postInit
			// write post-init user code here
		}//GEN-BEGIN:|22-getter|2|
		return loginScreen;
	}
//</editor-fold>//GEN-END:|22-getter|2|

//<editor-fold defaultstate="collapsed" desc=" Generated Method: method ">//GEN-BEGIN:|28-if|0|28-preIf
	/**
	 * Performs an action assigned to the method if-point.
	 */
	public void method() {//GEN-END:|28-if|0|28-preIf
		// enter pre-if user code here
		if (true) {//GEN-LINE:|28-if|1|29-preAction
			// write pre-action user code here
//GEN-LINE:|28-if|2|29-postAction
			// write post-action user code here
		} else {//GEN-LINE:|28-if|3|30-preAction
			// write pre-action user code here
//GEN-LINE:|28-if|4|30-postAction
			// write post-action user code here
		}//GEN-LINE:|28-if|5|28-postIf
		// enter post-if user code here
	}//GEN-BEGIN:|28-if|6|
//</editor-fold>//GEN-END:|28-if|6|

//<editor-fold defaultstate="collapsed" desc=" Generated Method: loginFromSavedCredentials ">//GEN-BEGIN:|31-entry|0|32-preAction
	/**
	 * Performs an action assigned to the loginFromSavedCredentials entry-point.
	 */
	public void loginFromSavedCredentials() {//GEN-END:|31-entry|0|32-preAction
		// write pre-action user code here
//GEN-LINE:|31-entry|1|32-postAction
		// write post-action user code here
	}//GEN-BEGIN:|31-entry|2|
//</editor-fold>//GEN-END:|31-entry|2|

	/**
	 * Returns a display instance.
	 * @return the display instance.
	 */
	public Display getDisplay() {
		return Display.getDisplay(this);
	}

	/**
	 * Exits MIDlet.
	 */
	public void exitMIDlet() {
		switchDisplayable(null, null);
		destroyApp(true);
		notifyDestroyed();
	}

	/**
	 * Called when MIDlet is started.
	 * Checks whether the MIDlet have been already started and initialize/starts or resumes the MIDlet.
	 */
	public void startApp() {
		if (midletPaused) {
			resumeMIDlet();
		} else {
			initialize();
			startMIDlet();
		}
		midletPaused = false;
	}

	/**
	 * Called when MIDlet is paused.
	 */
	public void pauseApp() {
		midletPaused = true;
	}

	/**
	 * Called to signal the MIDlet to terminate.
	 * @param unconditional if true, then the MIDlet has to be unconditionally terminated and all resources has to be released.
	 */
	public void destroyApp(boolean unconditional) {
	}
}
