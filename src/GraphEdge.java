/************************************************
 * Name: Grant Von Hagen (251307427)
 * Class: GraphEdge.java
 * Class: 2210 
 * Description: Holds data, Origin, Destination, Type and label of the edge
 *************************************************************/
public class GraphEdge {
	
	GraphNode Origin;
	GraphNode Destination;
	int type;
	String label;
	
	public GraphEdge(GraphNode u, GraphNode v, int type, String label) {
		
		this.Origin = u;
		this.Destination = v;
		this.type = type;
		this.label = label;
	}
	
/**
 * 
 * @return Origin GraphNode
 */
	public GraphNode firstEndpoint() {
		return this.Origin;
	}
	/**
	 * 
	 * @return Destination GraphNode
	 */
	public GraphNode secondEndpoint() {
		return this.Destination;
	}
	/**
	 * 
	 * @return int type
	 */
	public int getType() {
		return this.type;
	}
	/**
	 * 
	 * @param int type to set
	 */
	public void setype(int type) {
		this.type = type;
	}
	/**
	 * 
	 * @return String label
	 */
	public String getLabel() {
		return label;
	}
	/**
	 * 
	 * @param String label to set
	 */
	public void setLabel(String label) {
		this.label = label;
	}
	
}
