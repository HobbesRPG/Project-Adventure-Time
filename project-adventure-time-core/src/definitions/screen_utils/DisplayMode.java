package definitions.screen_utils;

	import java.awt.Dimension;
	import java.awt.Toolkit;

	import com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration;

	public class DisplayMode {
		
		static Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		static LwjglApplicationConfiguration modeConfig = new LwjglApplicationConfiguration();
		
		public static double defaultWidth() {
			
			return screenSize.getWidth();
		}
		
		public static double defaultHeight() {
			
			return screenSize.getHeight();
		}
		
		public static void setDefaultSize() {
			
			modeConfig.width = (int) defaultWidth();
			modeConfig.height = (int) defaultHeight();
		}
		
		public static void setCustomSize(int width, int height) {
			
			modeConfig.width = width;
			modeConfig.height = height;
		}
		
		public static void fullscreen(boolean fs) {
			
			modeConfig.fullscreen = fs;
		}
}
