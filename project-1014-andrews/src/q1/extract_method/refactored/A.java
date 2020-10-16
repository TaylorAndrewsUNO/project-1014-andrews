package q1.extract_method.refactored;

import java.util.List;

public class A {
   Node m1(List<Node> nodes, String p) {
      printOutNode(nodes, p);
      return null;
   }

   Edge m2(List<Edge> edgeList, String p) {
	  printOutEdge(edgeList, p);
      return null;
   }

   private void printOutNode(List<Node> listIn, String p) {
	   for (Node thisElement : listIn) {
		   if(thisElement.contains(p)) {
			   System.out.println(thisElement);
		   }
	   }
   }
   private void printOutEdge(List<Edge> listIn, String p) {
	   for (Edge thisElement : listIn) {
		   if(thisElement.contains(p)) {
			   System.out.println(thisElement);
		   }
	   }
   }
}

class Node {
   String name;

   public boolean contains(String p) {
      return name.contains(p);
   }
}

class Edge {
   String name;

   public boolean contains(String p) {
       return name.contains(p);
   }
}