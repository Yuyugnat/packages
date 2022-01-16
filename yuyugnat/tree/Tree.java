package yuyugnat.tree;
import yuyugnat.linkedlist.*;

public class Tree <T>{
    
    private T value; // the value is set to null if it is the root of the structure
    private LinkedList<Tree<T>> branches;

    public Tree() {

        this.value = null;
        this.branches = new LinkedList<>();

    }

    public Tree(T value) {

        this.value = value;
        this.branches = new LinkedList<>();

    }

       


}
