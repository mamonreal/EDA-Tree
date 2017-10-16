package practica2;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import material.Position;
import material.tree.BreadthFirstTreeIterator;
import material.tree.Tree;
import material.tree.narytree.LinkedTree;
import material.tree.narytree.NAryTree;

public class LCRSTree<E> implements NAryTree<E> {

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
    	throw new RuntimeException("Not yet implemented");
    }

    /**
     * Returns whether a node is internal.
     * @param v
     * @return 
     */
    @Override
    public boolean isInternal(Position<E> v) {
    		throw new RuntimeException("Not yet implemented");
    }

    /**
     * Returns whether a node is external.
     * @param p
     * @return 
     */
    @Override
    public boolean isLeaf(Position<E> p) {
    		throw new RuntimeException("Not yet implemented");
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
    		throw new RuntimeException("Not yet implemented");
    }

    /**
     * Returns an iterable collection of the children of a node.
     * @param p
     */
    @Override
    public Iterable<? extends Position<E>> children(Position<E> p) {
    		throw new RuntimeException("Not yet implemented");
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

}
