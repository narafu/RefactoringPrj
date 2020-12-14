package ch06;

public class ExplaningVar01 {

//	before

	private String platform;
	private String browser;
	private int resize;

	void before() {

		if ((platform.toUpperCase().indexOf("MAC") > -1) && (browser.toUpperCase().indexOf("IE") > -1)
				&& wasInitialized() && resize > 0) {
			// 기능코드
		}
	}

	private boolean wasInitialized() {
		// TODO Auto-generated method stub
		return false;
	}

//	after

	void after() {

		final boolean isMacOs = platform.toUpperCase().indexOf("MAC") > -1;
		final int isIEBrowser = browser.toUpperCase().indexOf("IE");
		final boolean wasResized = wasInitialized() && resize > 0;

		if (isMacOs && isIEBrowser > -1 && wasResized) {
			// 기능코드
		}
	}

}
