
package net.sf.robocode.ui.battleview;

import java.awt.geom.Rectangle2D;
import java.io.Serializable;

public class RescueArea implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private final Rectangle2D.Double[] rescueArea;
	
	public RescueArea(Rectangle2D.Double[] rescueArea) {
		this.rescueArea = rescueArea;
	}
		
	public int getX(int index) {
		return (int) rescueArea[index].x;
	}
	
	public int getY(int index) {
		return (int) rescueArea[index].y;
	}
	
	public int getWidth(int index) {
		return (int) rescueArea[index].width;
	}
	
	public int getHeight(int index) {
		return (int) rescueArea[index].height;
	}

}
