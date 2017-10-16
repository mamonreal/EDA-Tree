package practica2;

import material.tree.BreadthFirstTreeIterator;
import material.tree.Tree;

/**
 *
 * @author mtgonzal
 */
public class TreeSizeCalculator {
    /**
     * @param t
     * @return the size of the tree t
     */
    private Tree tree;
	
	public int size(Tree t){
        int size = 0;
        BreadthFirstTreeIterator it = new BreadthFirstTreeIterator<>(t);
        while (it.hasNext()) {
        	size++;
        	it.next();
        }
        return size;
    }
}
