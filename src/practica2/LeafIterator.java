/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica2;

import java.util.Collections;
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
	
	private Deque<Position<T>> nodeStack = new LinkedList<>();
	private final Tree<T> tree;
	
    public LeafIterator(Tree<T> tree) {
        this.tree = tree;
        if (tree.isLeaf(tree.root())) {
        	nodeStack.add(tree.root());
        }
        else {
        	Position<T> aux = tree.root();
            LinkedList<Position<T>> children = new LinkedList<>();
            //itera hasta encontrar el primer hijo (recorrido profundidad)
            while(!tree.isLeaf(aux)) {
            	//Da la vuelta a la lista de hijos de aux
            	for (Position <T> node: this.tree.children(aux))
            		children.addFirst(node);
	    		while (! children.isEmpty()) {
	    			nodeStack.addFirst(children.removeFirst());
	    		}
	    		aux = nodeStack.removeFirst();
    		}
            nodeStack.addFirst(aux);
        }
    }
            
    @Override
    public boolean hasNext() {
        return ! nodeStack.isEmpty();
    }

    @Override
    public Position<T> next() {
    	Position<T> aux = nodeStack.removeFirst();
    	if (!tree.isLeaf(aux)) {
	    	LinkedList<Position<T>> children = new LinkedList<>();
	    	while(!tree.isLeaf(aux)) {
	    		//Da la vuelta a la lista de hijos de aux
	        	for (Position <T> node: this.tree.children(aux))
	        		children.addFirst(node);
	    		while (! children.isEmpty()) {
	    			nodeStack.addFirst(children.removeFirst());
	    		}
	    		aux = nodeStack.removeFirst();
	    	}
    	}
    	return aux;
    }
}
