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
	
private class LCRSNode<E> implements material.Position<E> {
    	
    	private E element;
    	private LCRSNode parent;
    	private LCRSNode leftChild;
    	private LCRSNode rightSibling;
    	
		public LCRSNode(E element) {
			this(element, null, null, null);
		}
    	
    	public LCRSNode(E element, LCRSNode parent, LCRSNode leftChild, LCRSNode rightSibling) {
			super();
			this.element = element;
			this.parent = parent;
			this.leftChild = leftChild;
			this.rightSibling = rightSibling;
		}

		public LCRSNode getParent() {
			return parent;
		}

		public void setParent(LCRSNode parent) {
			this.parent = parent;
		}

		public LCRSNode getLeftChild() {
			return leftChild;
		}

		public void setLeftChild(LCRSNode leftChild) {
			this.leftChild = leftChild;
		}

		public LCRSNode getRightSibling() {
			return rightSibling;
		}

		public void setRightSibling(LCRSNode rightSibling) {
			this.rightSibling = rightSibling;
		}

		public void setElement(E element) {
			this.element = element;
		}

		@Override
		public E getElement() {
			return element;
		}
    	
    }

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
    	if (root == null) {
            throw new RuntimeException("The tree is empty");
        }
        return root;
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
    	return new BreadthFirstTreeIterator<>(this);
    }

 
    /**
     * Replaces the element at a node.
     */
    @Override
    public E replace(Position<E> p, E e) {
    	LCRSNode node = checkPosition(p);
    	E temp = p.getElement();
    	node.setElement(e);
    	return temp;
    }

    /**
     * Adds a root node to an empty tree
     */
    @Override
    public Position<E> addRoot(E e) {
    	if (this.isEmpty()) {
    		LCRSNode node = new LCRSNode<E>(e);
    		root = node;
    		return node;
    	} else 
    		throw new RuntimeException("Tree already has a root");
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
    public void attach(Position<E> p, LCRSTree<E> t) {
    	LCRSNode node = checkPosition(p);
    	LCRSNode r = checkPosition(t.root());
		
//    	Si el nodo no tiene hijos mete el arbol t como hijo
//    	del nodo, sino busca el primer nodo hermano que no
//    	tenga hermano derecho y mete el arbol t
    	if (node.leftChild == null) {
    		node.leftChild = r;
    	}
    	else {
    		LCRSNode nodeB = node.leftChild;
    		while (nodeB.rightSibling != null) {
    			nodeB = nodeB.rightSibling;
    		}
    		nodeB.rightSibling = r;
    	}
//    	Al nuevo nodo r se le da un padre y a la raiz del arbol 
//    	t se le asigna null
    	r.setParent(node);
		t.root = null;
    }
    
    

	private LCRSNode<E> checkPosition(Position<E> p) {
    	if ((p == null) || !(p instanceof LCRSNode))
    		throw new RuntimeException("The position is invalid");
    	return (LCRSNode<E>) p;
    }
    
    

}
