package practica2;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

import material.Position;
import material.tree.BreadthFirstTreeIterator;
import material.tree.Tree;
import material.tree.narytree.LinkedTree;
import material.tree.narytree.NAryTree;

public class LCRSTree<E> implements NAryTree<E> {

	private LCRSNode<E> root;
	
	/**
     * Creates an empty tree.
     */
    public LCRSTree() {
    		throw new RuntimeException("Not yet implemented");
    }

    /**
     * Returns whether the tree is empty.
     *
     * @return True if is empty.
     *
     */
    @Override
    public boolean isEmpty() {
    	return root == null;
    }

    /**
     * Returns whether a node is internal.
     * @param v
     * @return 
     */
    @Override
    public boolean isInternal(Position<E> v) {
    		return !isLeaf(v);
    }

    /**
     * Returns whether a node is external.
     * @param p
     * @return 
     */
    @Override
    public boolean isLeaf(Position<E> p) {
    		LCRSNode<E> node = checkPosition(p);
			return (node.leftChild == null)&&(node.rightSibling == null);
    }

    /**
     * Returns whether a node is the root.
     * @param p
     * @return 
     */
    @Override
    public boolean isRoot(Position<E> p) {
    		throw new RuntimeException("Not yet implemented");
    }

    /**
     * Returns the root of the tree.
     * @return 
     */
    @Override
    public Position<E> root() {
    		throw new RuntimeException("Not yet implemented");
    }

    /**
     * Returns the parent of a node.
     * @param p
     * @return 
     */
    @Override
    public Position<E> parent(Position<E> p) {
    		LCRSNode<E> node = checkPosition(p);
    		Position<E> pos = (Position<E>) node.parent;
    		if (pos == null)
    			throw new RuntimeException();
    		return pos;
    }

    /**
     * Returns an iterable collection of the children of a node.
     * @param p
     */
    @Override
    public Iterable<? extends Position<E>> children(Position<E> p) {
    	LCRSNode<E> node = checkPosition(p);
    	List<Position<E>> list = new LinkedList<>();
    	if (node.leftChild == null)
    		return list;
    	else {
    		list.add((Position<E>) node.leftChild);
    		while (node.rightSibling != null) {
    			list.add((Position<E>) node.rightSibling);
    			node = node.rightSibling;
    		}
    		return list;
    	}
    }

    /**
     * Returns an iterator of the elements stored at the nodes. The nodes are
     * visited according to a breath-first search
     */
    @Override
    public Iterator<Position<E>> iterator() {
    		throw new RuntimeException("Not yet implemented");
    }

 
    /**
     * Replaces the element at a node.
     */
    @Override
    public E replace(Position<E> p, E e) {
    		throw new RuntimeException("Not yet implemented");
    }

    /**
     * Adds a root node to an empty tree
     */
    @Override
    public Position<E> addRoot(E e) {
    		throw new RuntimeException("Not yet implemented");
    }

    /**
     * Swap the elements at two nodes
     */
    @Override
    public void swapElements(Position<E> p1, Position<E> p2) {
    		throw new RuntimeException("Not yet implemented");
    }

    /**
     * Add a new node whose parent is pointed by a given position.
     *
     * @param p The position of the parent, e the element stored in the new
     * created node.
     */
    @Override
    public Position<E> add(E element, Position<E> p) {
    		throw new RuntimeException("Not yet implemented");
    }

    /**
     * Add a new node whose parent is pointed by a given position, 
     * and set the child at the position n if possible.
     *
     * @param p The position of the parent, e the element stored in the new
     * created node.
     */
    @Override
    public Position<E> add(E element, Position<E> p, final int n) {
    		throw new RuntimeException("Not yet implemented");
    }
    
    
    
    /**
     * Remove a node and its corresponding subtree rooted at node.
     *
     * @param p The position of the node to be removed.
     */
    @Override
    public void remove(Position<E> p) {
    		throw new RuntimeException("Not yet implemented");
    }
    
    /**
     * Create un new tree from node v.
     *
     * @param v new root node
     * @return  The new tree.
     */
    public LinkedTree<E> subTree(Position<E> v) {
    		throw new RuntimeException("Not yet implemented");
    }    
    
    /**
     * Attach tree t as children of node p
     * @param p
     * @param t 
     */
    public void attach(Position<E> p, LinkedTree<E> t) {
    		throw new RuntimeException("Not yet implemented");
    }
    
    private LCRSNode<E> checkPosition(Position<E> p) {
    	if ((p == null) || !(p instanceof LCRSNode))
    		throw new RuntimeException("The position is invalid");
    	return (LCRSNode<E>) p;
    }
    
    private class LCRSNode<E> implements material.Position<E> {
    	
    	private E element;
    	private LCRSNode parent;
    	private LCRSNode leftChild;
    	private LCRSNode rightSibling;
    	private LCRSTree myTree;
    	
		@Override
		public E getElement() {
			return element;
		}
    	
    }

}
