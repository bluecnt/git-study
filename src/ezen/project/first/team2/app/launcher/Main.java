////////////////////////////////////////////////////////////////////////////////
// [SGLEE:20231112SUN_233800] Created
////////////////////////////////////////////////////////////////////////////////

package ezen.project.first.team2.app.launcher;

import ezen.project.first.team2.app.common.StatusManager;

public class Main extends StatusManager {
	public static final int PAGE_NUM_SPLASH = 1000;
	public static final int PAGE_NUM_MAIN = 2000;

	@Override
	protected void onInit() {
		SplashPage splashPage = new SplashPage();
		MainPage mainPage = new MainPage();

		try {
			this.addPage(splashPage);
			this.addPage(mainPage);
		} catch (Exception e) {
			e.printStackTrace();
		}
		//
	}
	
	@Override
	protected void onRun() {
		this.selectPageByNum(PAGE_NUM_SPLASH);
	}
	
	public static void main(String[] args) {
		(new Main()).run();
	}
}
