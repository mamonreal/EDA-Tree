/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica2;

import java.util.Deque;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

import material.Position;
import material.tree.Tree;

/**
 *
 * @author jvelez
 * @param <T>
 */
public class LeafIterator <T> implements Iterator<Position<T>> {
	
	private Deque<Position<T>> nodeQueue = new LinkedList<>();
	private final Tree<T> tree;
	
    public LeafIterator(Tree<T> tree) {
        this.tree = tree;
        LinkedList<Position<T>> auxList = new LinkedList<>();
        auxList.add(tree.root());
        while(! auxList.isEmpty()) {
        	Position<T> p = auxList.pollFirst();
        	if (tree.isLeaf(p)) {
        		nodeQueue.add(p);
        	}
        	else {
        		/* En el caso de que tenga que iterar los hijos de
        		 * izquierda a derecha
        		 */
//        		LinkedList <Position<T>> children = new LinkedList<>();
//        		for (Position <T> node: this.tree.children(p))
//        			children.addFirst(node);
//        		while (! children.isEmpty()) {
//        			auxList.addFirst(children.pollFirst());
//        		}
        		for (Position <T> node: this.tree.children(p))
        			auxList.addLast(node);
        	}        		
        }
    }
            
    @Override
    public boolean hasNext() {
        return ! nodeQueue.isEmpty();
    }

    @Override
    public Position<T> next() {
    	return nodeQueue.pollFirst();
    }
}
