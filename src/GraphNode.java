/************************************************
 * Name: Grant Von Hagen (251307427)
 * Class: GraphNode.java
 * Class: 2210 
 * Description: Graph Node holds int name and boolean marked
 *************************************************************/
public class GraphNode {

int name;
boolean mark;
	
	public GraphNode(int name) {

		this.name = name;
		this.mark = false;
	}

	
/**
 * Sets mark as whatever you pass through parameter
 * @param mark True/False
 */
	public void mark(boolean mark) {
		this.mark = mark;
		
	}
	/**
	 * 
	 * @return Marked True/False
	 */
	public boolean isMarked() {
		return mark;
	}
	/**
	 * 
	 * @return int Name
	 */
	public int getName() {
		return name;
	}
	
}
