public class testPost {
	GDimension size = new GDimension(5,5);
	GDimension location = new GDimension(100,100);
	Post post = new Post();
	
	public static void main(String args[]) {
		
		System.out.println(postWorks());
		
	}

	private boolean postWorks() {
		return(sizeWorks() && locationWorks() && nodesWork())
	}

	private boolean sizeWorks() {
		post.setSize(size);
		return post.getSize().equals(size);
	}

	private boolean locationWorks() {
		post.setLocation(location)
		return post.getLocation().equals(location);
	}

	private boolean nodesWork() {
		boolean nodesWork = TRUE;
		//Test to see if we can set the right numbers of nodes
		for(int i = 2; i <= 4; i++) {
			post.setNumberofNodes(i)	
			nodesWork = (post.getNumberofNodes()==i);
		}
		//Test to see if we can set an impossible number of nodes
		nodesWork = !post.setNumberofNodes(0);
		nodesWork = !post.setNumberofNodes(1);
		nodesWork = !post.setNumberofNodes(5);
		nodesWork = !post.setNumberofNodes(-1);
	}
	
}