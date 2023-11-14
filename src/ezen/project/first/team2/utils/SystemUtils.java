////////////////////////////////////////////////////////////////////////////////
//
// [SGLEE:20231113MON_014000] Created
//
////////////////////////////////////////////////////////////////////////////////

package ezen.project.first.team2.utils;

import java.awt.event.ActionListener;

import javax.swing.Timer;

public class SystemUtils {
	public static void setTimeout(int delayInMillis, ActionListener listener) {
		Timer t = new Timer(delayInMillis, e -> {
			listener.actionPerformed(e);
			Timer t2 = (Timer)e.getSource();
			t2.stop();
		});
		t.start();
	}
	
	//
}
